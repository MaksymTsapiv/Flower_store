package flowerstore;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item{
    List<FlowerPack> flowerPacks = new ArrayList<FlowerPack>();

    public FlowerBucket() {}

    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack : flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }

    public void addFlowerPack(FlowerPack flowerPack) {
        this.flowerPacks.add(flowerPack);
    }

    @Override
    public String getDescription() {
        return this.toString();
    }
}
