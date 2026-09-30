import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class SimpleJunitTest {
    @Test
    void firstTest() {
        System.out.println("SimpleJunitTest.firstTest");
        Assertions.assertTrue(3 > 2);
    }

    @Test
    void secondTest() {
        System.out.println("SimpleJunitTest.secondTest");
        Assertions.assertTrue(3 > 2);
    }

    @Test
    void thirdTest() {
        System.out.println("SimpleJunitTest.thirdTest");
        Assertions.assertTrue(3 > 2);
    }
}
