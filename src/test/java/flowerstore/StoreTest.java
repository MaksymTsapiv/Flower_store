package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    private Store store;
    private Flower flower;
    private Flower flower2;

    @BeforeEach
    void setUp() {
        store = new Store();

        flower = new Flower(FlowerType.ROSE);
        flower.setPrice(190);
        flower.setColor(new int[]{});
        flower.setSepalLength(10.5);

        flower2 = new Flower(FlowerType.TULIP);
        flower2.setPrice(80);
        flower2.setColor(new int[]{0,127,0});
        flower2.setSepalLength(5.6);

        store.addToStorage(flower);
        store.addToStorage(flower2);
    }

    @Test
    void search() {
        assertEquals(flower, store.search(FlowerType.ROSE, 190, 10.5));
    }
}