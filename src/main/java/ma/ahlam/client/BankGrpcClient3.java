package ma.ahlam.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import ma.ahlam.stubs.Banc;
import ma.ahlam.stubs.BankserviceGrpc;

import java.io.IOException;

public class BankGrpcClient3 {

    public static void main(String[] args) throws IOException {


        ManagedChannel managedChannel= ManagedChannelBuilder.forAddress("localhost",5555).usePlaintext().build();

        //cree un stub
        BankserviceGrpc.BankserviceStub asynchStub= BankserviceGrpc.newStub(managedChannel);
        Banc.ConvertcurrentRequest request= Banc.ConvertcurrentRequest.newBuilder()
                .setCurrencyFrom("MAD")
                .setCurrencyTo("USD")
                .setAmount(6500)
                .build();

        asynchStub.getCurrentStream(request, new StreamObserver<Banc.ConvertcurrentResponse>() {
            @Override
            public void onNext(Banc.ConvertcurrentResponse convertcurrentResponse) {
                System.out.println("*************************************");
                System.out.println(convertcurrentResponse);
                System.out.println("*************************************");
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("END.....................");
            }
        });

        System.out.println("?.............");
        System.in.read();
}}
