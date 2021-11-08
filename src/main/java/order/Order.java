package order;

import flowerstore.Item;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public List<User> users = new ArrayList<User>();
    public String[] statuses = new String[]{"Success", "Failure", "Wait"};


    public void addUser(User user){
        users.add(user);
    }

    public void removeUser(User user){
        users.remove(user);
    }

    public void notifyUsers(){
        for(int i = 0; i < users.size(); i++){
            users.get(i).update(statuses[i % 3]);
        }
    }

    public void order(Item item){
        notifyUsers();
        System.out.printf("Ordered a %s", item);
    }
}
