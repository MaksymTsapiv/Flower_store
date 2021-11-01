package decorators;

import flowerstore.Flower;
import flowerstore.FlowerType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaperDecoratorTest {
    private Flower flower;
    private PaperDecorator paperDecorator;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.CHAMOMILE);
        flower.setPrice(20);
        paperDecorator = new PaperDecorator(flower);
    }

    @Test
    void getPrice() {
        assertEquals(33, paperDecorator.getPrice());
    }

    @Test
    void getDescription() {
        assertEquals(flower.toString(), paperDecorator.getDescription());
    }
}
