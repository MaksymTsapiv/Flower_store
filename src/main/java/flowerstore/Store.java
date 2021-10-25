package flowerstore;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter @Getter
public class Store {
    List<Flower> storage = new ArrayList<Flower>();

    public Store() {}


    public void addToStorage(Flower flower) {
        storage.add(flower);
    }


    public Flower search(FlowerType type, double price, double sepalLength) {
        for(Flower flower: storage){
            if(flower.getPrice() == price &&
                    flower.getFlowerType() == type && flower.getSepalLength() == sepalLength){
                return flower;
            }
        }
        return new Flower(FlowerType.NOFLOWER);
    }
}
