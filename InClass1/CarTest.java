package InClass1;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new AutoCar();
        Car car2 = new ManualCar();

        car1.turnOfCar();
        car1.turnOfCar();
        System.out.println(car1.getCarType());

        car2.turnOfCar();
        car2.turnOfCar();
        System.out.println(car2.getCarType());

    }
}
