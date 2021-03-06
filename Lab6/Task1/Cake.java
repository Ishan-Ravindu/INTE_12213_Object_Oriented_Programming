package Lab6.Task1;

public abstract class Cake {
	protected String name;
	protected double rate;

	public Cake(String name, double rate) {
		this.name = name;
		this.rate = rate;
	}

	public abstract double calcPrice();

	public String toString() {
		return name + "\t" + rate;
	}
}
