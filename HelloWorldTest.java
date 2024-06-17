package test.java;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HelloWorldTest {
    @Test
    public void testOutput() {
        assertEquals("Hello, World!", "Hello, World!");
    }
}
