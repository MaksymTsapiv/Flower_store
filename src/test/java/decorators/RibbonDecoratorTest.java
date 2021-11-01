package decorators;

import flowerstore.Flower;
import flowerstore.FlowerType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RibbonDecoratorTest {
    private Flower flower;
    private RibbonDecorator ribbonDecorator;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.CHAMOMILE);
        flower.setPrice(20);
        ribbonDecorator = new RibbonDecorator(flower);
    }

    @Test
    void getPrice() {
        assertEquals(60, ribbonDecorator.getPrice());
    }

    @Test
    void getDescription() {
        assertEquals(flower.toString(), ribbonDecorator.getDescription());
    }
}