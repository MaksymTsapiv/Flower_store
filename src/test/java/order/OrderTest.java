package order;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    Order order;
    Sender sender;

    @BeforeEach
    void setUp() {
        order = new Order();
        order.addUser(sender);
    }

    @Test
    void addUser() {
        assertEquals(order.users.size(), 1);
    }

    @Test
    void removeUser() {
        order.removeUser(sender);
        assertEquals(order.users.size(), 0);
    }
}