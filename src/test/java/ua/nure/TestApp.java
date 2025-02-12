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


}
