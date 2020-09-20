package com.lidaifeng.grpcclient;

import com.lidaifeng.grpc.lib.GreeterGrpc;
import com.lidaifeng.grpc.lib.GreeterOuterClass;
import com.lidaifeng.grpc.lib.HelloReply;
import com.lidaifeng.grpc.lib.HelloRequest;
import io.grpc.Channel;
import net.devh.springboot.autoconfigure.grpc.client.GrpcClient;
import org.springframework.stereotype.Service;


@Service
public class GrpcClientService {

    @GrpcClient("local-grpc-server")
    private Channel serverChannel;

    public String sendMessage(String name) {
        GreeterGrpc.GreeterBlockingStub stub= GreeterGrpc.newBlockingStub(serverChannel);
        HelloReply response = stub.sayHello(HelloRequest.newBuilder().setName(name).build());
        return response.getMessage();
    }
}