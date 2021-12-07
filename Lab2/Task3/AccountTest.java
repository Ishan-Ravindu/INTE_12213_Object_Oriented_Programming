package Task3;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account(50.00);
        Account account2 = new Account(-7.53);
        System.out.printf("account1 balance $%.2f\n", account1.getBalance());
        System.out.printf("account2 balance $%.2f\n", account2.getBalance());
        Scanner input = new Scanner(System.in);
        double withdrawAmount;

        System.out.print("Enter Withdraw amount for account1: ");
        withdrawAmount = input.nextDouble();
        account1.debit(withdrawAmount);
        System.out.printf("account1 balance $%.2f\n", account1.getBalance());
        System.out.printf("account2 balance $%.2f\n", account2.getBalance());

        System.out.print("Enter Withdraw amount for account2: ");
        withdrawAmount = input.nextDouble();
        System.out.printf("\nsubtracting %.2f from account2 balance\n", withdrawAmount);
        account2.debit(withdrawAmount);

        System.out.printf("account1 balance $%.2f\n", account1.getBalance());
        System.out.printf("account2 balance $%.2f\n", account2.getBalance());

        input.close();

    }
}
