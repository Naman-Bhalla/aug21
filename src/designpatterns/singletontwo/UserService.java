package designpatterns.singletontwo;

import javax.management.InstanceAlreadyExistsException;

public class UserService {
//    private UserRepsitory userRepsitory;// SQLUserRepository
    // MongoDBRepository
    private static UserService instance = null;
//
//    private UserService(UserRepository userRepository) {
//        this.userRepsitory = userRepository;
//    }

//    public static UserService getInstance(UserRepository userRepository) {
//        if (instance != null) {
//            throw InstanceAlreadyExistsException();
//        }
//    }

    public static UserService getInstance() {
        return null;
    }


}

// Back at 11:03

