package flowerstore;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class FlowerPack {
    private Flower flower;
    private int amount;

    public FlowerPack(FlowerType flowerType){
        this.flower = new Flower(flowerType);
    }


    public double getPrice() {
        return flower.getPrice() * amount;
    }
}
