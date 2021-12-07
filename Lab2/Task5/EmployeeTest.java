package Task5;

public class EmployeeTest {
    public static void main(String[] args) {
        final short MONTH_IN_YEAR = 12;

        Employee employee1 = new Employee("sam", "smith", 100_000.00);
        Employee employee2 = new Employee("judy", "jones", 150_000.00);

        System.out.println(employee1.getMonthlySalary() * MONTH_IN_YEAR);
        System.out.println(employee2.getMonthlySalary() * MONTH_IN_YEAR);

        double employee1NewMonthlySalary = (employee1.getMonthlySalary() * 110) / 100;
        double employee2NewMonthlySalary = (employee2.getMonthlySalary() * 110) / 100;

        employee1.setMonthlySalary(employee1NewMonthlySalary);
        employee2.setMonthlySalary(employee2NewMonthlySalary);

        System.out.println(employee1.getMonthlySalary() * MONTH_IN_YEAR);
        System.out.println(employee2.getMonthlySalary() * MONTH_IN_YEAR);

    }
}
