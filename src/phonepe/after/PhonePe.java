package phonepe.after;

import phonepe.before.YBApi;

// Dependency Inversion - Design Principle
// Dependency Injection
public class PhonePe {
    BankAPI bankAPI;

    PhonePe(BankAPI bankAPI) {
        // dependency is being injected into the phonepe class by the client
        // dependency injection
        // IoC -> Inversion of Control
        // Web framework creates dependency for us
        this.bankAPI = bankAPI;
    }

    void pay() {
        bankAPI.pay(123, "123-123");

        bankAPI.isSuccess(123);
    }

    boolean markSuccess() {
        bankAPI.pay(123, "123-123");

        bankAPI.isSuccess(123);
        return false;
    }

    void payToFriend() {
        bankAPI.pay(123, "123-123");

        bankAPI.isSuccess(123);
    }

    void sendGift() {
        bankAPI.pay(123, "123-123");

        bankAPI.isSuccess(123);
    }


    void checkPaymentHistory() {
        bankAPI.pay(123, "123-123");

        bankAPI.isSuccess(123);
    }


    void checkBalance() {
        bankAPI.pay(123, "123-123");

        bankAPI.isSuccess(123);
    }

    void changeBankAPI(BankAPI bankAPI) {
        this.bankAPI = bankAPI;
    }

}
