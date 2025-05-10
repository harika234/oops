package OnlinePaymentGateway;

public class CreditCardPayment implements Payment {

    @Override
    public void pay(int amount) {
        System.out.println( amount + " paid" + " using Credit Card");
    }
}
