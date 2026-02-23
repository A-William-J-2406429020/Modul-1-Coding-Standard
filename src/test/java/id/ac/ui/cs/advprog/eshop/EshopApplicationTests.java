package id.ac.ui.cs.advprog.eshop;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class EshopApplicationTests {


    private final EshopApplication app;

    EshopApplicationTests() {
        this.app = new EshopApplication();
    }

    @Test
    void contextLoads() {
        assertNotNull(app);
    }

    @Test
    void testMain() {
        assertDoesNotThrow(() -> EshopApplication.main(new String[]{}));
    }
}
