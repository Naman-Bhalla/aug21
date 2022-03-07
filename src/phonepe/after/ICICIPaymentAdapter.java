package phonepe.after;

// 3 classes -> Structural Design Paterns -> Adapter Design Pattern
public class ICICIPaymentAdapter implements BankAPI {
    ICICIBankAPI bankAPI = new ICICIBankAPI();

    @Override
    public void pay(int payment_id, String cardNumber) {
        bankAPI.payTo(123, payment_id, cardNumber);
//        bankAPI.marklStartOfTransaction();
//        bankAPI.markCompletionofTransacvtion();
    }

    @Override
    public void isSuccess(int payment_id) {
        bankAPI.checkSuccess(String.valueOf(payment_id));
    }
}

