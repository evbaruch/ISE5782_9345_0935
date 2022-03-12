/**
 *
 */
package unittests.geometries;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import geometries.*;
import primitives.*;

public class SphereTests {

@Test
public void testGetNormal() {
    // ============ Equivalence Partitions Tests ==============
    // TC01: There is a simple single test here
    Sphere sph = new Sphere(new Point(0, 0, 1),1.0);
    assertEquals(new Vector(0, 0, 1), sph.getNormal(new Point(0, 0, 2)), "Bad normal to sphere");
}
}