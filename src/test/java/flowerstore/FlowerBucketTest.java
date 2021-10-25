package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {
    private FlowerPack flowerPack;
    private FlowerPack flowerPack2;
    private Flower flower;
    private FlowerBucket flowerBucket;

    @BeforeEach
    void setUp() {
        flowerBucket = new FlowerBucket();

        flowerPack = new FlowerPack(FlowerType.ROSE);
        flower = new Flower(FlowerType.ROSE);
        flower.setPrice(10);
        flowerPack.setAmount(5);
        flowerPack.setFlower(flower);
        flowerBucket.addFlowerPack(flowerPack);

        flowerPack2 = new FlowerPack(FlowerType.CHAMOMILE);
        flower = new Flower(FlowerType.CHAMOMILE);
        flower.setPrice(20);
        flowerPack2.setAmount(4);
        flowerPack2.setFlower(flower);
    }

    @Test
    void getPrice() {
        assertEquals(50, flowerBucket.getPrice());
    }

    @Test
    void addFlowerPack() {
        flowerBucket.addFlowerPack(flowerPack2);
        assertEquals(130, flowerBucket.getPrice());
    }
}