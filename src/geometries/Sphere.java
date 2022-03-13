package geometries;
import primitives.Point;
import primitives.Vector;
//did get normal
public class Sphere implements Geometry {
    private final Point center;
    private final double raduius;

    /**
     * constructer for sphere
     * @param center
     * @param raduius
     */
    public Sphere(Point center, double raduius) {
        this.center = center;
        this.raduius = raduius;
    }

    /**
     *
     * @return the center of sphere
     */
    public Point getCenter() {
        return center;
    }

    /**
     *
     * @return the radius of sphere
     */
    public double getRaduius() {
        return raduius;
    }

    /**
     *
     * @return the tostring of spehre
     */
    @Override
    public String toString() {
        return "Sphere{" +
                "center=" + center +
                ", raduius=" + raduius +
                '}';
    }

    /**
     *
     * @param p
     * calculates normal according ot equation
     * @return normal
     */
    @Override
    public Vector getNormal(Point p) {
        Vector p0_p = p.subtract(center);
        return p0_p.normalize();
    }
}
