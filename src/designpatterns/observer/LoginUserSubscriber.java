package designpatterns.observer;

public interface LoginUserSubscriber {

    void handleLoginUser(int a, String e);
}


// 1. Produces has:
//   - L:ist subscriber
//    - subscribe()
//    - unsubscribe()

// Subscriver is an interface
// SUbscriber composes singleton producer
// Subscriber subscribes itself by calling
// subscribe() on producer
//
// producer calls notify() for every producer when
// action takes place