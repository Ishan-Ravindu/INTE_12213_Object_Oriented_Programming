package Lab4.Task6;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1.1, 1.2);
        Point point2 = new Point(6.6, 2.8);
        Point point3 = new Point(6.2, 9.9);
        Point point4 = new Point(2.2, 7.4);

        // Quadrilateral
        Quadrilateral quadrilateral = new Quadrilateral(point1, point2, point3, point4);
        System.out.println("Coordinates of Quadrilateral are : ");
        System.out.print("( " + quadrilateral.getPoint1().getX() + " , " + quadrilateral.getPoint1().getY() + " ),");
        System.out.print("( " + quadrilateral.getPoint2().getX() + " , " + quadrilateral.getPoint2().getY() + " ),");
        System.out.print("( " + quadrilateral.getPoint3().getX() + " , " + quadrilateral.getPoint3().getY() + " ),");
        System.out.println("( " + quadrilateral.getPoint4().getX() + " , " + quadrilateral.getPoint4().getY() + " )");
        System.out.println("");

        // Trapezoid
        point1.setX(0.0);
        point1.setY(0.0);
        point2.setX(10.0);
        point2.setY(0.0);
        point3.setX(8.0);
        point3.setY(5.0);
        point4.setX(3.3);
        point4.setY(5.0);
        Trapezoid trapezoid = new Trapezoid(point1, point2, point3, point4);
        System.out.println("Coordinates of Trapezoid are : ");
        System.out.print("( " + trapezoid.getPoint1().getX() + " , " + trapezoid.getPoint1().getY() + " ),");
        System.out.print("( " + trapezoid.getPoint2().getX() + " , " + trapezoid.getPoint2().getY() + " ),");
        System.out.print("( " + trapezoid.getPoint3().getX() + " , " + trapezoid.getPoint3().getY() + " ),");
        System.out.println("( " + trapezoid.getPoint4().getX() + " , " + trapezoid.getPoint4().getY() + " )");
        System.out.println("Hight is: " + trapezoid.calculateHight());
        System.out.println("Area is: " + trapezoid.calculateArea());
        System.out.println("");

        // Parallelogram
        point1.setX(5.0);
        point1.setY(5.0);
        point2.setX(11.0);
        point2.setY(5.0);
        point3.setX(12.0);
        point3.setY(20.0);
        point4.setX(6.0);
        point4.setY(20.0);
        Parallelogram parallelogram = new Parallelogram(point1, point2, point3, point4);
        System.out.println("Coordinates of Parallelogram are : ");
        System.out.print("( " + parallelogram.getPoint1().getX() + " , " + parallelogram.getPoint1().getY() + " ),");
        System.out.print("( " + parallelogram.getPoint2().getX() + " , " + parallelogram.getPoint2().getY() + " ),");
        System.out.print("( " + parallelogram.getPoint3().getX() + " , " + parallelogram.getPoint3().getY() + " ),");
        System.out.println("( " + parallelogram.getPoint4().getX() + " , " + parallelogram.getPoint4().getY() + " )");
        System.out.println("Width is: " + parallelogram.calculateWidth());
        System.out.println("Hight is: " + parallelogram.calculateHight());
        System.out.println("Area is: " + parallelogram.calculateArea());
        System.out.println("");

        // Rectangle
        point1.setX(17.0);
        point1.setY(14.0);
        point2.setX(30.0);
        point2.setY(14.0);
        point3.setX(30.0);
        point3.setY(28.0);
        point4.setX(17.0);
        point4.setY(28.0);
        Rectangle rectangle = new Rectangle(point1, point2, point3, point4);
        System.out.println("Coordinates of Rectangle are : ");
        System.out.print("( " + rectangle.getPoint1().getX() + " , " + rectangle.getPoint1().getY() + " ),");
        System.out.print("( " + rectangle.getPoint2().getX() + " , " + rectangle.getPoint2().getY() + " ),");
        System.out.print("( " + rectangle.getPoint3().getX() + " , " + rectangle.getPoint3().getY() + " ),");
        System.out.println("( " + rectangle.getPoint4().getX() + " , " + rectangle.getPoint4().getY() + " )");
        System.out.println("Width is: " + rectangle.calculateWidth());
        System.out.println("Hight is: " + rectangle.calculateHight());
        System.out.println("Area is: " + rectangle.calculateArea());
        System.out.println("");

        // Square
        point1.setX(4.0);
        point1.setY(0.0);
        point2.setX(8.0);
        point2.setY(0.0);
        point3.setX(8.0);
        point3.setY(4.0);
        point4.setX(4.0);
        point4.setY(4.0);
        Square square = new Square(point1, point2, point3, point4);
        System.out.println("Coordinates of Square are : ");
        System.out.print("( " + square.getPoint1().getX() + " , " + square.getPoint1().getY() + " ),");
        System.out.print("( " + square.getPoint2().getX() + " , " + square.getPoint2().getY() + " ),");
        System.out.print("( " + square.getPoint3().getX() + " , " + square.getPoint3().getY() + " ),");
        System.out.println("( " + square.getPoint4().getX() + " , " + square.getPoint4().getY() + " )");
        System.out.println("Side is: " + square.calculateWidth());
        System.out.println("Area is: " + square.calculateArea());
        System.out.println("");
    }
}
