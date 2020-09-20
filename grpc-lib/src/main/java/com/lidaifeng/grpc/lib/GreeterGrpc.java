package com.lidaifeng.grpc.lib;

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
 * <pre>
 * demo案例
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.1)",
    comments = "Source: greeter.proto")
public final class GreeterGrpc {

  private GreeterGrpc() {}

  public static final String SERVICE_NAME = "Greeter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.lidaifeng.grpc.lib.HelloRequest,
      com.lidaifeng.grpc.lib.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = com.lidaifeng.grpc.lib.HelloRequest.class,
      responseType = com.lidaifeng.grpc.lib.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lidaifeng.grpc.lib.HelloRequest,
      com.lidaifeng.grpc.lib.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<com.lidaifeng.grpc.lib.HelloRequest, com.lidaifeng.grpc.lib.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
          GreeterGrpc.getSayHelloMethod = getSayHelloMethod = 
              io.grpc.MethodDescriptor.<com.lidaifeng.grpc.lib.HelloRequest, com.lidaifeng.grpc.lib.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Greeter", "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lidaifeng.grpc.lib.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lidaifeng.grpc.lib.HelloReply.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayHello"))
                  .build();
          }
        }
     }
     return getSayHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lidaifeng.grpc.lib.ThinkivePortfolioSubmitRequest,
      com.lidaifeng.grpc.lib.ThinkivePortfolioSubmitResponse> getThinkivePortfolioSubmitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ThinkivePortfolioSubmit",
      requestType = com.lidaifeng.grpc.lib.ThinkivePortfolioSubmitRequest.class,
      responseType = com.lidaifeng.grpc.lib.ThinkivePortfolioSubmitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lidaifeng.grpc.lib.ThinkivePortfolioSubmitRequest,
      com.lidaifeng.grpc.lib.ThinkivePortfolioSubmitResponse> getThinkivePortfolioSubmitMethod() {
    io.grpc.MethodDescriptor<com.lidaifeng.grpc.lib.ThinkivePortfolioSubmitRequest, com.lidaifeng.grpc.lib.ThinkivePortfolioSubmitResponse> getThinkivePortfolioSubmitMethod;
    if ((getThinkivePortfolioSubmitMethod = GreeterGrpc.getThinkivePortfolioSubmitMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getThinkivePortfolioSubmitMethod = GreeterGrpc.getThinkivePortfolioSubmitMethod) == null) {
          GreeterGrpc.getThinkivePortfolioSubmitMethod = getThinkivePortfolioSubmitMethod = 
              io.grpc.MethodDescriptor.<com.lidaifeng.grpc.lib.ThinkivePortfolioSubmitRequest, com.lidaifeng.grpc.lib.ThinkivePortfolioSubmitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Greeter", "ThinkivePortfolioSubmit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lidaifeng.grpc.lib.ThinkivePortfolioSubmitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lidaifeng.grpc.lib.ThinkivePortfolioSubmitResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("ThinkivePortfolioSubmit"))
                  .build();
          }
        }
     }
     return getThinkivePortfolioSubmitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lidaifeng.grpc.lib.ThinkivePortfolioCommentExamRequest,
      com.lidaifeng.grpc.lib.ThinkivePortfolioCommentExamResponse> getThinkivePortfolioCommentExamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ThinkivePortfolioCommentExam",
      requestType = com.lidaifeng.grpc.lib.ThinkivePortfolioCommentExamRequest.class,
      responseType = com.lidaifeng.grpc.lib.ThinkivePortfolioCommentExamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lidaifeng.grpc.lib.ThinkivePortfolioCommentExamRequest,
      com.lidaifeng.grpc.lib.ThinkivePortfolioCommentExamResponse> getThinkivePortfolioCommentExamMethod() {
    io.grpc.MethodDescriptor<com.lidaifeng.grpc.lib.ThinkivePortfolioCommentExamRequest, com.lidaifeng.grpc.lib.ThinkivePortfolioCommentExamResponse> getThinkivePortfolioCommentExamMethod;
    if ((getThinkivePortfolioCommentExamMethod = GreeterGrpc.getThinkivePortfolioCommentExamMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getThinkivePortfolioCommentExamMethod = GreeterGrpc.getThinkivePortfolioCommentExamMethod) == null) {
          GreeterGrpc.getThinkivePortfolioCommentExamMethod = getThinkivePortfolioCommentExamMethod = 
              io.grpc.MethodDescriptor.<com.lidaifeng.grpc.lib.ThinkivePortfolioCommentExamRequest, com.lidaifeng.grpc.lib.ThinkivePortfolioCommentExamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Greeter", "ThinkivePortfolioCommentExam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lidaifeng.grpc.lib.ThinkivePortfolioCommentExamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lidaifeng.grpc.lib.ThinkivePortfolioCommentExamResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("ThinkivePortfolioCommentExam"))
                  .build();
          }
        }
     }
     return getThinkivePortfolioCommentExamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreeterStub newStub(io.grpc.Channel channel) {
    return new GreeterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreeterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GreeterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreeterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GreeterFutureStub(channel);
  }

  /**
   * <pre>
   * demo案例
   * </pre>
   */
  public static abstract class GreeterImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * demo案例
     * </pre>
     */
    public void sayHello(com.lidaifeng.grpc.lib.HelloRequest request,
        io.grpc.stub.StreamObserver<com.lidaifeng.grpc.lib.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    /**
     * <pre>
     *思迪组合上架接口
     * </pre>
     */
    public void thinkivePortfolioSubmit(com.lidaifeng.grpc.lib.ThinkivePortfolioSubmitRequest request,
        io.grpc.stub.StreamObserver<com.lidaifeng.grpc.lib.ThinkivePortfolioSubmitResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getThinkivePortfolioSubmitMethod(), responseObserver);
    }

    /**
     * <pre>
     *思迪组合点评发送审核
     * </pre>
     */
    public void thinkivePortfolioCommentExam(com.lidaifeng.grpc.lib.ThinkivePortfolioCommentExamRequest request,
        io.grpc.stub.StreamObserver<com.lidaifeng.grpc.lib.ThinkivePortfolioCommentExamResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getThinkivePortfolioCommentExamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.lidaifeng.grpc.lib.HelloRequest,
                com.lidaifeng.grpc.lib.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .addMethod(
            getThinkivePortfolioSubmitMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.lidaifeng.grpc.lib.ThinkivePortfolioSubmitRequest,
                com.lidaifeng.grpc.lib.ThinkivePortfolioSubmitResponse>(
                  this, METHODID_THINKIVE_PORTFOLIO_SUBMIT)))
          .addMethod(
            getThinkivePortfolioCommentExamMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.lidaifeng.grpc.lib.ThinkivePortfolioCommentExamRequest,
                com.lidaifeng.grpc.lib.ThinkivePortfolioCommentExamResponse>(
                  this, METHODID_THINKIVE_PORTFOLIO_COMMENT_EXAM)))
          .build();
    }
  }

  /**
   * <pre>
   * demo案例
   * </pre>
   */
  public static final class GreeterStub extends io.grpc.stub.AbstractStub<GreeterStub> {
    private GreeterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterStub(channel, callOptions);
    }

    /**
     * <pre>
     * demo案例
     * </pre>
     */
    public void sayHello(com.lidaifeng.grpc.lib.HelloRequest request,
        io.grpc.stub.StreamObserver<com.lidaifeng.grpc.lib.HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *思迪组合上架接口
     * </pre>
     */
    public void thinkivePortfolioSubmit(com.lidaifeng.grpc.lib.ThinkivePortfolioSubmitRequest request,
        io.grpc.stub.StreamObserver<com.lidaifeng.grpc.lib.ThinkivePortfolioSubmitResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getThinkivePortfolioSubmitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *思迪组合点评发送审核
     * </pre>
     */
    public void thinkivePortfolioCommentExam(com.lidaifeng.grpc.lib.ThinkivePortfolioCommentExamRequest request,
        io.grpc.stub.StreamObserver<com.lidaifeng.grpc.lib.ThinkivePortfolioCommentExamResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getThinkivePortfolioCommentExamMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * demo案例
   * </pre>
   */
  public static final class GreeterBlockingStub extends io.grpc.stub.AbstractStub<GreeterBlockingStub> {
    private GreeterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * demo案例
     * </pre>
     */
    public com.lidaifeng.grpc.lib.HelloReply sayHello(com.lidaifeng.grpc.lib.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *思迪组合上架接口
     * </pre>
     */
    public com.lidaifeng.grpc.lib.ThinkivePortfolioSubmitResponse thinkivePortfolioSubmit(com.lidaifeng.grpc.lib.ThinkivePortfolioSubmitRequest request) {
      return blockingUnaryCall(
          getChannel(), getThinkivePortfolioSubmitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *思迪组合点评发送审核
     * </pre>
     */
    public com.lidaifeng.grpc.lib.ThinkivePortfolioCommentExamResponse thinkivePortfolioCommentExam(com.lidaifeng.grpc.lib.ThinkivePortfolioCommentExamRequest request) {
      return blockingUnaryCall(
          getChannel(), getThinkivePortfolioCommentExamMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * demo案例
   * </pre>
   */
  public static final class GreeterFutureStub extends io.grpc.stub.AbstractStub<GreeterFutureStub> {
    private GreeterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * demo案例
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lidaifeng.grpc.lib.HelloReply> sayHello(
        com.lidaifeng.grpc.lib.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *思迪组合上架接口
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lidaifeng.grpc.lib.ThinkivePortfolioSubmitResponse> thinkivePortfolioSubmit(
        com.lidaifeng.grpc.lib.ThinkivePortfolioSubmitRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getThinkivePortfolioSubmitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *思迪组合点评发送审核
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lidaifeng.grpc.lib.ThinkivePortfolioCommentExamResponse> thinkivePortfolioCommentExam(
        com.lidaifeng.grpc.lib.ThinkivePortfolioCommentExamRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getThinkivePortfolioCommentExamMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_THINKIVE_PORTFOLIO_SUBMIT = 1;
  private static final int METHODID_THINKIVE_PORTFOLIO_COMMENT_EXAM = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreeterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreeterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.lidaifeng.grpc.lib.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.lidaifeng.grpc.lib.HelloReply>) responseObserver);
          break;
        case METHODID_THINKIVE_PORTFOLIO_SUBMIT:
          serviceImpl.thinkivePortfolioSubmit((com.lidaifeng.grpc.lib.ThinkivePortfolioSubmitRequest) request,
              (io.grpc.stub.StreamObserver<com.lidaifeng.grpc.lib.ThinkivePortfolioSubmitResponse>) responseObserver);
          break;
        case METHODID_THINKIVE_PORTFOLIO_COMMENT_EXAM:
          serviceImpl.thinkivePortfolioCommentExam((com.lidaifeng.grpc.lib.ThinkivePortfolioCommentExamRequest) request,
              (io.grpc.stub.StreamObserver<com.lidaifeng.grpc.lib.ThinkivePortfolioCommentExamResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreeterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.lidaifeng.grpc.lib.GreeterOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Greeter");
    }
  }

  private static final class GreeterFileDescriptorSupplier
      extends GreeterBaseDescriptorSupplier {
    GreeterFileDescriptorSupplier() {}
  }

  private static final class GreeterMethodDescriptorSupplier
      extends GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreeterMethodDescriptorSupplier(String methodName) {
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
      synchronized (GreeterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreeterFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .addMethod(getThinkivePortfolioSubmitMethod())
              .addMethod(getThinkivePortfolioCommentExamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
