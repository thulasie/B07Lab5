package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CircleTest {

    @Test
    @DisplayName("perimeter(): 2πr with r=5")
    void testPerimeter_basic() {
        Point o = new Point(0, 0);
        Circle c = new Circle(o, 5.0);
        double expected = 2 * Math.PI * 5.0;
        assertEquals(expected, c.perimeter(), 1e-10);
    }

    @Test
    @DisplayName("insideContains(): strictly inside, not on border")
    void testInsideContains_strictlyInside() {
        Point o = new Point(0, 0);
        Circle c = new Circle(o, 5.0);

        Point p = new Point(3, 3); // distance ≈ 4.24 < 5
        assertTrue(c.insideContains(p));

        Point border34 = new Point(3, 4); // distance = 5
        assertFalse(c.insideContains(border34));
    }

    @Test
    @DisplayName("borderContains(): points exactly on the circle are true")
    void testBorderContains_onBorder() {
        Point o = new Point(0, 0);
        Circle c = new Circle(o, 5.0);

        assertTrue(c.borderContains(new Point(5, 0)));
        assertTrue(c.borderContains(new Point(3, 4)));

        assertFalse(c.borderContains(new Point(3, 3)));
        assertFalse(c.borderContains(new Point(6, 0)));
    }

    @Test
    @DisplayName("Edge cases: radius=0, negative coordinates, non-origin center")
    void testEdgeCases() {
        Circle c0 = new Circle(new Point(2, -1), 0.0);
        assertTrue(c0.borderContains(new Point(2, -1)));
        assertFalse(c0.insideContains(new Point(2, -1)));

        Circle c = new Circle(new Point(-2, 3), 5.0);
        assertTrue(c.borderContains(new Point(3, 3)));
        assertTrue(c.insideContains(new Point(0, 3)));
        assertFalse(c.insideContains(new Point(10, 10)));
    }
}
