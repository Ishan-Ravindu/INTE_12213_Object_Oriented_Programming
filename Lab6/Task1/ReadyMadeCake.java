package Lab6.Task1;

public class ReadyMadeCake extends Cake {
    protected int quantity;

    public ReadyMadeCake(String name, double rate, int quantity) {
        super(name, rate);
        this.quantity = quantity;
    }

    @Override
    public double calcPrice() {
        return this.rate * (double) this.quantity;
    }

    public int getQuantity() {
        return quantity;
    }

}
