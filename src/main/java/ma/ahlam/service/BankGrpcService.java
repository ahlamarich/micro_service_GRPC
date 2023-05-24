package ma.ahlam.service;

import io.grpc.stub.StreamObserver;
import ma.ahlam.stubs.Banc;
import ma.ahlam.stubs.BankserviceGrpc;

import java.util.Timer;
import java.util.TimerTask;

public class BankGrpcService extends BankserviceGrpc.BankserviceImplBase {

    @Override
    public void convert(Banc.ConvertcurrentRequest request, StreamObserver<Banc.ConvertcurrentResponse> responseObserver) {
        String currencyFrom=request.getCurrencyFrom();
        String currencyTo=request.getCurrencyTo();
        double amount=request.getAmount();

        Banc.ConvertcurrentResponse response= Banc.ConvertcurrentResponse.newBuilder()
                .setCurrencyFrom(currencyFrom)
                .setCurrencyTo(currencyTo)
                .setAmount(amount*11.64)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getCurrentStream(Banc.ConvertcurrentRequest request, StreamObserver<Banc.ConvertcurrentResponse> responseObserver) {
        String currencyFrom=request.getCurrencyFrom();
        String currencyTo=request.getCurrencyTo();
        double amount=request.getAmount();

        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            int contere=0;
            @Override
            public void run() {
                Banc.ConvertcurrentResponse response= Banc.ConvertcurrentResponse.newBuilder()
                        .setCurrencyFrom(currencyFrom)
                        .setCurrencyTo(currencyTo)
                        .setAmount(amount)
                        .setResult(amount*Math.random()*100)
                        .build();

                responseObserver.onNext(response);
                ++contere;
                if (contere==20){
                    responseObserver.onCompleted();
                    timer.cancel();
                }
            }
        }, 1000, 1000);}

    @Override
    public StreamObserver<Banc.ConvertcurrentRequest> performStream(StreamObserver<Banc.ConvertcurrentResponse> responseObserver) {
        return new StreamObserver<Banc.ConvertcurrentRequest>() {
            double sum=0;
            @Override
            public void onNext(Banc.ConvertcurrentRequest convertcurrentRequest) {
                sum+=convertcurrentRequest.getAmount();
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                Banc.ConvertcurrentResponse response= Banc.ConvertcurrentResponse.newBuilder()
                        .setResult(sum*1.4)
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();


            }
        };
    }

    @Override
    public StreamObserver<Banc.ConvertcurrentRequest> fullCurrentStream(StreamObserver<Banc.ConvertcurrentResponse> responseObserver) {
        return new StreamObserver<Banc.ConvertcurrentRequest>() {
            @Override
            public void onNext(Banc.ConvertcurrentRequest convertcurrentRequest) {
                Banc.ConvertcurrentResponse response= Banc.ConvertcurrentResponse.newBuilder()
                        .setResult(convertcurrentRequest.getAmount()*Math.random()*40)
                        .build();
                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();

            }
        };
    }
}
