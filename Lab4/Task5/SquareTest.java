package Lab4.Task5;

public class SquareTest {
    public static void main(String[] args) {
        Square square1 = new Square();
        Square square2 = new Square(10.0);

        System.out.println(square1.getSide());
        System.out.println(square2.getSide());

        square1.setSide(20.0);
        square2.setSide(30.0);

        System.out.println(square1.getSide());
        System.out.println(square2.getSide());

        System.out.println(square1.computeArea());
        System.out.println(square2.computeArea());
    }
}
