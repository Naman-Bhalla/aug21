package designpatterns.observer;

public class EmailManagamentService implements ResgiterUserSubscriber {
    private void sendEmail(String to, String from) {}
    private UserService userService; // Singleton

    EmailManagamentService() {
        userService.subscribeRegisterUser(this);
    }

    @Override
    public void handleRegisterUser() {
        sendEmail("abc", "def");
    }
}
