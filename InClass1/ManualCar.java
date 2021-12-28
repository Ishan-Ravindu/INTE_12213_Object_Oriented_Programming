package InClass1;

public class ManualCar implements Car {

    @Override
    public void turnOfCar() {
        System.out.println("car started");

    }

    @Override
    public void turnOnCar() {
        System.out.println("car stopped");

    }

    @Override
    public String getCarType() {
        return "manual";
    }

}
