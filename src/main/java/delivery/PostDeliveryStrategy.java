package delivery;

import flowerstore.Item;

public class PostDeliveryStrategy implements Delivery{

    public PostDeliveryStrategy(Item item){
        this.deliver(item);
    }

    @Override
    public Item deliver(Item item) {
        System.out.println("Post Delivery");
        return item;
    }
}
