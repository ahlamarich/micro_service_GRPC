package ma.ahlam.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: banc.proto")
public final class BankserviceGrpc {

  private BankserviceGrpc() {}

  public static final String SERVICE_NAME = "Bankservice";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.ahlam.stubs.Banc.ConvertcurrentRequest,
      ma.ahlam.stubs.Banc.ConvertcurrentResponse> getConvertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "convert",
      requestType = ma.ahlam.stubs.Banc.ConvertcurrentRequest.class,
      responseType = ma.ahlam.stubs.Banc.ConvertcurrentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.ahlam.stubs.Banc.ConvertcurrentRequest,
      ma.ahlam.stubs.Banc.ConvertcurrentResponse> getConvertMethod() {
    io.grpc.MethodDescriptor<ma.ahlam.stubs.Banc.ConvertcurrentRequest, ma.ahlam.stubs.Banc.ConvertcurrentResponse> getConvertMethod;
    if ((getConvertMethod = BankserviceGrpc.getConvertMethod) == null) {
      synchronized (BankserviceGrpc.class) {
        if ((getConvertMethod = BankserviceGrpc.getConvertMethod) == null) {
          BankserviceGrpc.getConvertMethod = getConvertMethod = 
              io.grpc.MethodDescriptor.<ma.ahlam.stubs.Banc.ConvertcurrentRequest, ma.ahlam.stubs.Banc.ConvertcurrentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Bankservice", "convert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ahlam.stubs.Banc.ConvertcurrentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ahlam.stubs.Banc.ConvertcurrentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankserviceMethodDescriptorSupplier("convert"))
                  .build();
          }
        }
     }
     return getConvertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.ahlam.stubs.Banc.ConvertcurrentRequest,
      ma.ahlam.stubs.Banc.ConvertcurrentResponse> getGetCurrentStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCurrentStream",
      requestType = ma.ahlam.stubs.Banc.ConvertcurrentRequest.class,
      responseType = ma.ahlam.stubs.Banc.ConvertcurrentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ma.ahlam.stubs.Banc.ConvertcurrentRequest,
      ma.ahlam.stubs.Banc.ConvertcurrentResponse> getGetCurrentStreamMethod() {
    io.grpc.MethodDescriptor<ma.ahlam.stubs.Banc.ConvertcurrentRequest, ma.ahlam.stubs.Banc.ConvertcurrentResponse> getGetCurrentStreamMethod;
    if ((getGetCurrentStreamMethod = BankserviceGrpc.getGetCurrentStreamMethod) == null) {
      synchronized (BankserviceGrpc.class) {
        if ((getGetCurrentStreamMethod = BankserviceGrpc.getGetCurrentStreamMethod) == null) {
          BankserviceGrpc.getGetCurrentStreamMethod = getGetCurrentStreamMethod = 
              io.grpc.MethodDescriptor.<ma.ahlam.stubs.Banc.ConvertcurrentRequest, ma.ahlam.stubs.Banc.ConvertcurrentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Bankservice", "getCurrentStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ahlam.stubs.Banc.ConvertcurrentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ahlam.stubs.Banc.ConvertcurrentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankserviceMethodDescriptorSupplier("getCurrentStream"))
                  .build();
          }
        }
     }
     return getGetCurrentStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.ahlam.stubs.Banc.ConvertcurrentRequest,
      ma.ahlam.stubs.Banc.ConvertcurrentResponse> getPerformStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "performStream",
      requestType = ma.ahlam.stubs.Banc.ConvertcurrentRequest.class,
      responseType = ma.ahlam.stubs.Banc.ConvertcurrentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<ma.ahlam.stubs.Banc.ConvertcurrentRequest,
      ma.ahlam.stubs.Banc.ConvertcurrentResponse> getPerformStreamMethod() {
    io.grpc.MethodDescriptor<ma.ahlam.stubs.Banc.ConvertcurrentRequest, ma.ahlam.stubs.Banc.ConvertcurrentResponse> getPerformStreamMethod;
    if ((getPerformStreamMethod = BankserviceGrpc.getPerformStreamMethod) == null) {
      synchronized (BankserviceGrpc.class) {
        if ((getPerformStreamMethod = BankserviceGrpc.getPerformStreamMethod) == null) {
          BankserviceGrpc.getPerformStreamMethod = getPerformStreamMethod = 
              io.grpc.MethodDescriptor.<ma.ahlam.stubs.Banc.ConvertcurrentRequest, ma.ahlam.stubs.Banc.ConvertcurrentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Bankservice", "performStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ahlam.stubs.Banc.ConvertcurrentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ahlam.stubs.Banc.ConvertcurrentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankserviceMethodDescriptorSupplier("performStream"))
                  .build();
          }
        }
     }
     return getPerformStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.ahlam.stubs.Banc.ConvertcurrentRequest,
      ma.ahlam.stubs.Banc.ConvertcurrentResponse> getFullCurrentStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FullCurrentStream",
      requestType = ma.ahlam.stubs.Banc.ConvertcurrentRequest.class,
      responseType = ma.ahlam.stubs.Banc.ConvertcurrentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ma.ahlam.stubs.Banc.ConvertcurrentRequest,
      ma.ahlam.stubs.Banc.ConvertcurrentResponse> getFullCurrentStreamMethod() {
    io.grpc.MethodDescriptor<ma.ahlam.stubs.Banc.ConvertcurrentRequest, ma.ahlam.stubs.Banc.ConvertcurrentResponse> getFullCurrentStreamMethod;
    if ((getFullCurrentStreamMethod = BankserviceGrpc.getFullCurrentStreamMethod) == null) {
      synchronized (BankserviceGrpc.class) {
        if ((getFullCurrentStreamMethod = BankserviceGrpc.getFullCurrentStreamMethod) == null) {
          BankserviceGrpc.getFullCurrentStreamMethod = getFullCurrentStreamMethod = 
              io.grpc.MethodDescriptor.<ma.ahlam.stubs.Banc.ConvertcurrentRequest, ma.ahlam.stubs.Banc.ConvertcurrentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Bankservice", "FullCurrentStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ahlam.stubs.Banc.ConvertcurrentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ahlam.stubs.Banc.ConvertcurrentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankserviceMethodDescriptorSupplier("FullCurrentStream"))
                  .build();
          }
        }
     }
     return getFullCurrentStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BankserviceStub newStub(io.grpc.Channel channel) {
    return new BankserviceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BankserviceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BankserviceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BankserviceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BankserviceFutureStub(channel);
  }

  /**
   */
  public static abstract class BankserviceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *unary model
     * </pre>
     */
    public void convert(ma.ahlam.stubs.Banc.ConvertcurrentRequest request,
        io.grpc.stub.StreamObserver<ma.ahlam.stubs.Banc.ConvertcurrentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConvertMethod(), responseObserver);
    }

    /**
     * <pre>
     * server stream model
     * </pre>
     */
    public void getCurrentStream(ma.ahlam.stubs.Banc.ConvertcurrentRequest request,
        io.grpc.stub.StreamObserver<ma.ahlam.stubs.Banc.ConvertcurrentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCurrentStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * client stream model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ma.ahlam.stubs.Banc.ConvertcurrentRequest> performStream(
        io.grpc.stub.StreamObserver<ma.ahlam.stubs.Banc.ConvertcurrentResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getPerformStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     *Bidirectionnel stream model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ma.ahlam.stubs.Banc.ConvertcurrentRequest> fullCurrentStream(
        io.grpc.stub.StreamObserver<ma.ahlam.stubs.Banc.ConvertcurrentResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getFullCurrentStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getConvertMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.ahlam.stubs.Banc.ConvertcurrentRequest,
                ma.ahlam.stubs.Banc.ConvertcurrentResponse>(
                  this, METHODID_CONVERT)))
          .addMethod(
            getGetCurrentStreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ma.ahlam.stubs.Banc.ConvertcurrentRequest,
                ma.ahlam.stubs.Banc.ConvertcurrentResponse>(
                  this, METHODID_GET_CURRENT_STREAM)))
          .addMethod(
            getPerformStreamMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                ma.ahlam.stubs.Banc.ConvertcurrentRequest,
                ma.ahlam.stubs.Banc.ConvertcurrentResponse>(
                  this, METHODID_PERFORM_STREAM)))
          .addMethod(
            getFullCurrentStreamMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ma.ahlam.stubs.Banc.ConvertcurrentRequest,
                ma.ahlam.stubs.Banc.ConvertcurrentResponse>(
                  this, METHODID_FULL_CURRENT_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class BankserviceStub extends io.grpc.stub.AbstractStub<BankserviceStub> {
    private BankserviceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankserviceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankserviceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankserviceStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary model
     * </pre>
     */
    public void convert(ma.ahlam.stubs.Banc.ConvertcurrentRequest request,
        io.grpc.stub.StreamObserver<ma.ahlam.stubs.Banc.ConvertcurrentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * server stream model
     * </pre>
     */
    public void getCurrentStream(ma.ahlam.stubs.Banc.ConvertcurrentRequest request,
        io.grpc.stub.StreamObserver<ma.ahlam.stubs.Banc.ConvertcurrentResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetCurrentStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * client stream model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ma.ahlam.stubs.Banc.ConvertcurrentRequest> performStream(
        io.grpc.stub.StreamObserver<ma.ahlam.stubs.Banc.ConvertcurrentResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getPerformStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *Bidirectionnel stream model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ma.ahlam.stubs.Banc.ConvertcurrentRequest> fullCurrentStream(
        io.grpc.stub.StreamObserver<ma.ahlam.stubs.Banc.ConvertcurrentResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getFullCurrentStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class BankserviceBlockingStub extends io.grpc.stub.AbstractStub<BankserviceBlockingStub> {
    private BankserviceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankserviceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankserviceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankserviceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary model
     * </pre>
     */
    public ma.ahlam.stubs.Banc.ConvertcurrentResponse convert(ma.ahlam.stubs.Banc.ConvertcurrentRequest request) {
      return blockingUnaryCall(
          getChannel(), getConvertMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * server stream model
     * </pre>
     */
    public java.util.Iterator<ma.ahlam.stubs.Banc.ConvertcurrentResponse> getCurrentStream(
        ma.ahlam.stubs.Banc.ConvertcurrentRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetCurrentStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BankserviceFutureStub extends io.grpc.stub.AbstractStub<BankserviceFutureStub> {
    private BankserviceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankserviceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankserviceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankserviceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary model
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.ahlam.stubs.Banc.ConvertcurrentResponse> convert(
        ma.ahlam.stubs.Banc.ConvertcurrentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONVERT = 0;
  private static final int METHODID_GET_CURRENT_STREAM = 1;
  private static final int METHODID_PERFORM_STREAM = 2;
  private static final int METHODID_FULL_CURRENT_STREAM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BankserviceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BankserviceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONVERT:
          serviceImpl.convert((ma.ahlam.stubs.Banc.ConvertcurrentRequest) request,
              (io.grpc.stub.StreamObserver<ma.ahlam.stubs.Banc.ConvertcurrentResponse>) responseObserver);
          break;
        case METHODID_GET_CURRENT_STREAM:
          serviceImpl.getCurrentStream((ma.ahlam.stubs.Banc.ConvertcurrentRequest) request,
              (io.grpc.stub.StreamObserver<ma.ahlam.stubs.Banc.ConvertcurrentResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PERFORM_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.performStream(
              (io.grpc.stub.StreamObserver<ma.ahlam.stubs.Banc.ConvertcurrentResponse>) responseObserver);
        case METHODID_FULL_CURRENT_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.fullCurrentStream(
              (io.grpc.stub.StreamObserver<ma.ahlam.stubs.Banc.ConvertcurrentResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BankserviceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BankserviceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.ahlam.stubs.Banc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Bankservice");
    }
  }

  private static final class BankserviceFileDescriptorSupplier
      extends BankserviceBaseDescriptorSupplier {
    BankserviceFileDescriptorSupplier() {}
  }

  private static final class BankserviceMethodDescriptorSupplier
      extends BankserviceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BankserviceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BankserviceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BankserviceFileDescriptorSupplier())
              .addMethod(getConvertMethod())
              .addMethod(getGetCurrentStreamMethod())
              .addMethod(getPerformStreamMethod())
              .addMethod(getFullCurrentStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
