package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {
    private FlowerPack flowerPack;
    private Flower flower;

    @BeforeEach
    void setUp() {
        flowerPack = new FlowerPack(FlowerType.ROSE);
        flower = new Flower(FlowerType.ROSE);
        flower.setPrice(10);
        flowerPack.setAmount(5);
        flowerPack.setFlower(flower);
    }

    @Test
    void getPrice() {
        assertEquals(50, flowerPack.getPrice());
    }
}