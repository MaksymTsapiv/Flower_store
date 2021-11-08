package order;

import java.util.concurrent.ThreadLocalRandom;

public class BasicUser implements User {
    int id = ThreadLocalRandom.current().nextInt(0, 100000);
    String status;

    @Override
    public void update(String status){
        this.status = status;
    }
}
