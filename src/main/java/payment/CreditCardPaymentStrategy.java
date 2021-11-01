package payment;

public class CreditCardPaymentStrategy implements Payment{

    CreditCardPaymentStrategy(){
    }

    @Override
    public boolean pay(double price) {
        System.out.format("Paid with Credit Card \n %f", price);
        return true;
    }
}
