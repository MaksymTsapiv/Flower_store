package payment;

import flowerstore.Flower;
import flowerstore.FlowerType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayPalPaymentStrategyTest {
    private PayPalPaymentStrategy payPalPaymentStrategy;
    private Flower flower;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE);
        flower.setPrice(200);
        payPalPaymentStrategy = new PayPalPaymentStrategy();
    }

    @Test
    void pay() {
        assertTrue(payPalPaymentStrategy.pay(flower.getPrice()));
    }
}