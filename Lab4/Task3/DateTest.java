package Lab4.Task3;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(7, 4, 2004);
        System.out.println("The initial Date is : " + date.displayDate());

        date.setDay(11);
        date.setMonth(1);
        date.setYear(2003);
        System.out.println("Date with new value is : " + date.displayDate());
    }
}
