package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class SimpleJunitTest {
    @Test
    void firstTest() {
        System.out.println("Tests.SimpleJunitTest.firstTest");
        Assertions.assertTrue(3 > 2);
    }

    @Test
    void secondTest() {
        System.out.println("Tests.SimpleJunitTest.secondTest");
        Assertions.assertTrue(3 > 2);
    }

    @Test
    void thirdTest() {
        System.out.println("Tests.SimpleJunitTest.thirdTest");
        Assertions.assertTrue(3 > 2);
    }
}
