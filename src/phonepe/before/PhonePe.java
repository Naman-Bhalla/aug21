package phonepe.before;

public class PhonePe {
    YBApi ybApi = new YBApi();


    void pay() {
        ybApi.makePayment(
                123,
                "123-123",
                12345);

        boolean isSuccess = ybApi.checkSuccess(123);
    }

    boolean markSuccess() {
        ybApi.makePayment(
                123,
                "123-123",
                12345);

        boolean isSuccess = ybApi.checkSuccess(123);
        return false;
    }

    void payToFriend() {
        ybApi.makePayment(
                123,
                "123-123",
                12345);

        boolean isSuccess = ybApi.checkSuccess(123);
    }

    void sendGift() {
        ybApi.makePayment(
                123,
                "123-123",
                12345);

        boolean isSuccess = ybApi.checkSuccess(123);
    }


    void checkPaymentHistory() {
        ybApi.makePayment(
                123,
                "123-123",
                12345);

        boolean isSuccess = ybApi.checkSuccess(123);
    }


    void checkBalance() {
        ybApi.makePayment(
                123,
                "123-123",
                12345);

        boolean isSuccess = ybApi.checkSuccess(123);
    }

}
