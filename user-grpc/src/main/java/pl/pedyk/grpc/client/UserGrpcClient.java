package pl.pedyk.grpc.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import pl.pedyk.user.UserItem;
import pl.pedyk.user.UserServiceGrpc;

public class UserGrpcClient {
    public static void main(String[] args) {
        String serverHost = "localhost"; // Replace with your server's host
        int serverPort = 50051; // Replace with your server's port

        ManagedChannel channel = ManagedChannelBuilder.forAddress(serverHost, serverPort)
                .usePlaintext()
                .build();

        UserServiceGrpc.UserServiceBlockingStub blockingStub = UserServiceGrpc.newBlockingStub(channel);

        // Call the GetUser gRPC method
        UserItem.UserRequest request = UserItem.UserRequest.newBuilder()
                .setId("user_id_to_fetch")
                .build();

        UserItem.UserResponse response = blockingStub.getUser(request);
        System.out.println("Received User: " + response.getId() + ", " + response.getName());

        // Call the CreateUser gRPC method
        UserItem.User newUser = UserItem.User.newBuilder()
                .setName("New User")
                .build();

        UserItem.User createdUser = blockingStub.createUser(newUser);
        System.out.println("Created User: " + createdUser.getId() + ", " + createdUser.getName());

        channel.shutdown();
    }
}
