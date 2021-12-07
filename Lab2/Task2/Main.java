package Task2;

public class Main {
    public static void main(String[] args) {
        Counter counterObj = new Counter();
        System.out.println(counterObj.getValue());
        counterObj.increment();
        System.out.println(counterObj.getValue());
    }
}
