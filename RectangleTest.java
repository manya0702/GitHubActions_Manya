package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RectangleTest {

    @Test
    public void testCalculateArea() {
        // Test case 1: length = 5.0, width = 3.0
        Rectangle rect1 = new Rectangle(5.0, 3.0);
        assertEquals(15.0, rect1.calculateArea(), 0.001);

        // Test case 2: length = 7.5, width = 4.0
        Rectangle rect2 = new Rectangle(7.5, 4.0);
        assertEquals(30.0, rect2.calculateArea(), 0.001);

        // Test case 3: length = 0.0, width = 0.0
        Rectangle rect3 = new Rectangle(0.0, 0.0);
        assertEquals(0.0, rect3.calculateArea(), 0.001);

        // Test case 4: length = -5.0, width = 3.0 (negative value test)
        Rectangle rect4 = new Rectangle(-5.0, 3.0);
        assertEquals(-15.0, rect4.calculateArea(), 0.001);
    }
}
