package delivery;

import flowerstore.Item;

public class DHLDeliveryStrategy implements Delivery{

    public DHLDeliveryStrategy(Item item){
        this.deliver(item);
    }

    @Override
    public Item deliver(Item item) {
        System.out.println("DHL Delivery");
        return item;
    }
}
