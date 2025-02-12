package ua.nure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestApp {
    @Test
    public void test() {
        String str = "Hello World";
        Assertions.assertEquals(str, "Hello World");
        Assertions.assertEquals(str, "Hello World");
    }
    @Test
    public void testSum() {
        Assertions.assertEquals(5, App.sum(3,2));
    }

    @Test
    public void testGreater100() {
        Assertions.assertEquals(100, App.sum(300,200));
    }

}
