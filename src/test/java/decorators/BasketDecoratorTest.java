package decorators;

import flowerstore.Flower;
import flowerstore.FlowerType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketDecoratorTest {
    private Flower flower;
    private BasketDecorator basketDecorator;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.CHAMOMILE);
        flower.setPrice(20);
        basketDecorator = new BasketDecorator(flower);
    }

    @Test
    void getPrice() {
        assertEquals(24, basketDecorator.getPrice());
    }

    @Test
    void getDescription() {
        assertEquals(flower.toString(), basketDecorator.getDescription());
    }
}