package Lab4.Task5;

/**
 * Square
 */
public class Square {
    private double side;

    public Square() {
        setSide(1.0);
    }

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side > 0) {
            this.side = side;
        } else {
            this.side = 1.0;
        }
    }

    public double computeArea() {
        return this.side * this.side;
    }

}