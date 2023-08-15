package pl.pedyk.grpc.usergrpc;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import pl.pedyk.grpc.service.UserGrpcServiceImpl;

import java.io.IOException;

public class UserGrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 50051; // Specify the port for your gRPC server

        Server server = ServerBuilder.forPort(port)
                .addService(new UserGrpcServiceImpl())
                .build();

        System.out.println("Starting gRPC server...");
        server.start();
        System.out.println("gRPC server started on port " + port);

        server.awaitTermination();
    }
}
