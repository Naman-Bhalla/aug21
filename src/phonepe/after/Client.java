package phonepe.after;

public class Client {

    public static void main(String[] args) {
        PhonePe phonePe = new PhonePe(
                new ICICIPaymentAdapter()
        );


    }
}
