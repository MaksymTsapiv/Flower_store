package flowerstore;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {

    private Flower flower;


    @org.junit.jupiter.api.BeforeEach
    void setUp() {

        flower = new Flower(FlowerType.ROSE);
        flower.setPrice(190);
        flower.setColor(new int[]{127,0,0});
        flower.setSepalLength(10.5);

    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        assertEquals(190, flower.getPrice());
    }

    @org.junit.jupiter.api.Test
    void getSepalLength() {
        assertEquals(10.5, flower.getSepalLength());
    }

    @org.junit.jupiter.api.Test
    void getFlowerType() {
        assertEquals(FlowerType.ROSE, flower.getFlowerType());
    }
}