package Lab4.Task6;

public class Parallelogram extends Quadrilateral {

    public Parallelogram(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);
    }

    public double calculateArea() {
        return calculateHight() * calculateWidth();
    }
}
