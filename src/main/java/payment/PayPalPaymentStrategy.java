package payment;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public boolean pay(double price) {
        System.out.format("Paid with PayPal \n %f", price);
        return true;
    }
}
