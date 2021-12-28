package InClass1;

public class AutoCar implements Car {

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
        return "auto";
    }

}
