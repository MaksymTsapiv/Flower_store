package decorators;

import flowerstore.Flower;
import flowerstore.FlowerType;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemDecoratorTest {
    private Flower flower;
    private ItemDecorator decorator;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.CHAMOMILE);
        flower.setPrice(20);
        decorator = new ItemDecorator(flower);
    }

    @Test
    void getPrice() {
        assertEquals(20, decorator.getPrice());
    }

    @Test
    void getDescription() {
        assertEquals(flower.toString(), decorator.getDescription());
    }
}