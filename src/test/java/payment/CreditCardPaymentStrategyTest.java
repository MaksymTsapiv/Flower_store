package payment;

import flowerstore.Flower;
import flowerstore.FlowerType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardPaymentStrategyTest {
    private CreditCardPaymentStrategy creditCardPaymentStrategy;
    private Flower flower;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE);
        flower.setPrice(200);
        creditCardPaymentStrategy = new CreditCardPaymentStrategy();
    }

    @Test
    void pay() {
        assertTrue(creditCardPaymentStrategy.pay(flower.getPrice()));
    }
}