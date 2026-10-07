import java.util.Scanner;
public class IT26102391Lab3Q1B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter price of 1kg rice: ");
        double price = input.nextDouble();

        System.out.print("Enter number of kilograms: ");
        double kg = input.nextDouble();

        double amount = price * kg;
        double discount = amount * 10 / 100;
        double finalAmount = amount - discount;

        System.out.println("Amount to pay after discount = " + finalAmount);
    }
}
