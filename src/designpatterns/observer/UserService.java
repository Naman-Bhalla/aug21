package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    List<ResgiterUserSubscriber> registerUserSubscribers
            = new ArrayList<>();
    List<DeleteUserSubscriber> deleteUserSubscribers
            = new ArrayList<>();
    List<LoginUserSubscriber> loginUserSubscribers
            = new ArrayList<>();


//    void subscribe(xyz, Type type) {
//        mp[type].add(xyz);
//    }
    void subscribeRegisterUser(ResgiterUserSubscriber subscriber) {
        this.registerUserSubscribers.add(subscriber);
    }

    void unsubscribeRegisterUser(ResgiterUserSubscriber subscriber) {
        this.registerUserSubscribers.remove(subscriber);
    }


    public void registerUser(String c, String d) {
        String a = "a";

        for (ResgiterUserSubscriber subscriber: registerUserSubscribers) {
            subscriber.handleRegisterUser();
        }
    }

    public void loginUser(String a, String b) {

    }

    public void deleteUser(String e, String f) {

    }
}
