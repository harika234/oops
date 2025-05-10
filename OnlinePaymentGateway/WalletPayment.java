package OnlinePaymentGateway;

public class WalletPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println( amount + " paid " + " using Wallet.");
    }
}
