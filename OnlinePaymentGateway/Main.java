package OnlinePaymentGateway;

public class Main {
    public static void main(String[] args) {
        Payment payment;

        // Polymorphism
        payment = new CreditCardPayment();
        payment.pay(1000);

        payment = new UpiPayment();
        payment.pay(500);

        payment = new WalletPayment();
        payment.pay(750);
    }
}
