package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void testCapitalize() {
        App app = new App();
        assertEquals("Hello", app.capitalize("hello"));
        assertNull(app.capitalize(null));
    }
}