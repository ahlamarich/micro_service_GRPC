package ma.ahlam.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import ma.ahlam.stubs.Banc;
import ma.ahlam.stubs.BankserviceGrpc;

public class BankGrpcClient {

    public static void main(String[] args) {


        ManagedChannel managedChannel= ManagedChannelBuilder.forAddress("localhost",5555).usePlaintext().build();

        //cree un stub
        BankserviceGrpc.BankserviceBlockingStub blockingStub= BankserviceGrpc.newBlockingStub(managedChannel);
        Banc.ConvertcurrentRequest request= Banc.ConvertcurrentRequest.newBuilder()
                .setCurrencyFrom("MAD")
                .setCurrencyTo("USD")
                .setAmount(6500)
                .build();

        Banc.ConvertcurrentResponse currencyResponse= blockingStub.convert(request);
        System.out.println(currencyResponse);

    }
}
