package Lab2.Task1;

public class NumberHolder {
    public int anInt;
    public float aFloat;

    public static void main(String[] args) {
        NumberHolder numberObj = new NumberHolder();
        numberObj.anInt = 10;
        numberObj.aFloat = 10.1f;
        System.out.println(numberObj.anInt);
        System.out.println(numberObj.aFloat);
    };
}