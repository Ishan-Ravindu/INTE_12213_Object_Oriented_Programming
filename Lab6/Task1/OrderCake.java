package Lab6.Task1;

public class OrderCake extends Cake {
    protected double weight;

    public OrderCake(String name, double rate, double weight) {
        super(name, rate);
        this.weight = weight;

    }

    @Override
    public double calcPrice() {
        return this.rate * this.weight;
    }

}
