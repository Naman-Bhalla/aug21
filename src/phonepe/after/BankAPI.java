package phonepe.after;

public interface BankAPI {

    void pay(int payment_id, String cardNumber);

    void isSuccess(int payment_id);

}

// USB-A, HDMI, LAN, SD Card, ..... (YBApi, ICICBankAPi)
// Adapter ()
// USB-C (BankAPI Interface)
