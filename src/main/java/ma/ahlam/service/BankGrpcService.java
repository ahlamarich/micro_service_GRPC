package ma.ahlam.service;

import io.grpc.stub.StreamObserver;
import ma.ahlam.stubs.Banc;
import ma.ahlam.stubs.BankserviceGrpc;

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
        super.getCurrentStream(request, responseObserver);
    }

    @Override
    public StreamObserver<Banc.ConvertcurrentRequest> performStream(StreamObserver<Banc.ConvertcurrentResponse> responseObserver) {
        return super.performStream(responseObserver);
    }

    @Override
    public StreamObserver<Banc.ConvertcurrentRequest> fullCurrentStream(StreamObserver<Banc.ConvertcurrentResponse> responseObserver) {
        return super.fullCurrentStream(responseObserver);
    }
}
