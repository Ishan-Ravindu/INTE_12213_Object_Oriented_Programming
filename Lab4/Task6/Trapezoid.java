package Lab4.Task6;

public class Trapezoid extends Quadrilateral {

    public Trapezoid(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);
    }

    public double calculateArea() {
        return (sumOfTwoLine() * calculateHight()) / 2;
    }

    private double sumOfTwoLine() {
        double topLine = getPoint2().getX() - getPoint1().getX();
        double bottomLine = getPoint4().getX() - getPoint3().getX();
        if (topLine < 0) {
            topLine = -1.0 * topLine;
        }
        if (bottomLine < 0) {
            bottomLine = -1.0 * bottomLine;
        }
        return topLine + bottomLine;
    }
}
