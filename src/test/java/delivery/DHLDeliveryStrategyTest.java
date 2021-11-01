package delivery;

import flowerstore.Flower;
import flowerstore.FlowerType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DHLDeliveryStrategyTest {
    private DHLDeliveryStrategy dhlDeliveryStrategy;
    private Flower flower;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.CHAMOMILE);
        flower.setPrice(20);
        dhlDeliveryStrategy = new DHLDeliveryStrategy(flower);
    }

    @Test
    void deliver() {
        assertEquals(flower, dhlDeliveryStrategy.deliver(flower));
    }
}