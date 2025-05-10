package OnlinePaymentGateway;

public class UpiPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println( amount + " paid" + " Using UPI");
    }
}
