package pl.pedyk.grpc.service;

import io.grpc.stub.StreamObserver;
import pl.pedyk.user.UserItem;
import pl.pedyk.user.UserServiceGrpc;

public class UserGrpcServiceImpl extends UserServiceGrpc.UserServiceImplBase {

    @Override
    public void getUser(UserItem.UserRequest request, StreamObserver<UserItem.UserResponse> responseObserver) {
        // Implement your logic to fetch user details using the provided ID
        UserItem.UserResponse response = UserItem.UserResponse.newBuilder()
                .setId(request.getId())
                .setName("John Doe")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void createUser(UserItem.User request, StreamObserver<UserItem.User> responseObserver) {
        // Implement your logic to create a new user
        UserItem.User newUser = UserItem.User.newBuilder()
                .setId("new_user_id")
                .setName(request.getName())
                .build();

        responseObserver.onNext(newUser);
        responseObserver.onCompleted();
    }
}
