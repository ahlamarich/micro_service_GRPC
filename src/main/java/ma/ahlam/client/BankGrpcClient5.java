package ma.ahlam.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import ma.ahlam.stubs.Banc;
import ma.ahlam.stubs.BankserviceGrpc;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class BankGrpcClient5 {

    public static void main(String[] args) throws IOException {


        ManagedChannel managedChannel= ManagedChannelBuilder.forAddress("localhost",5555).usePlaintext().build();

        //cree un stub
        BankserviceGrpc.BankserviceStub asynchStub= BankserviceGrpc.newStub(managedChannel);
        Banc.ConvertcurrentRequest request= Banc.ConvertcurrentRequest.newBuilder()
                .setCurrencyFrom("MAD")
                .setCurrencyTo("USD")
                .setAmount(6500)
                .build();

       StreamObserver<Banc.ConvertcurrentRequest> performStream=asynchStub.fullCurrentStream(new StreamObserver<Banc.ConvertcurrentResponse>() {
           @Override
           public void onNext(Banc.ConvertcurrentResponse convertcurrentResponse) {
               System.out.println("******************************");
               System.out.println(convertcurrentResponse);
               System.out.println("******************************");
           }

           @Override
           public void onError(Throwable throwable) {

           }

           @Override
           public void onCompleted() {
               System.out.println("END..................");


           }
       });
        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            int conteur=0;
            @Override
            public void run() {
                    Banc.ConvertcurrentRequest request1= Banc.ConvertcurrentRequest.newBuilder()
                            .setAmount(Math.random()*7000)
                            .build();
                    performStream.onNext(request1);
                System.out.println("==============> conteur:"+conteur);

                ++conteur;
                if (conteur==20){
                    performStream.onCompleted();
                    timer.cancel();
                }
            }
        }, 1000, 1000);

        System.out.println("?.............");
        System.in.read();
}}
