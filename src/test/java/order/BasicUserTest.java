package order;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicUserTest {
    BasicUser basicUser;

    @BeforeEach
    void setUp() {
        basicUser = new BasicUser();
        basicUser.update("Wait");
    }

    @Test
    void update() {
        assertEquals(basicUser.status, "Wait");
    }
}