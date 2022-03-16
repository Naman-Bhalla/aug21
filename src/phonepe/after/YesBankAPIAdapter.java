package phonepe.after;

import phonepe.after.YBApi;

// created by phone
public class YesBankAPIAdapter implements BankAPI {
    YBApi ybApi = new YBApi();


    @Override
    public void pay(int payment_id, String cardNumber) {
        ybApi.makePayment(
                payment_id,
                cardNumber,
                1234
        );
    }

    @Override
    public void isSuccess(int payment_id) {
        ybApi.checkSuccess(payment_id);
    }
}
