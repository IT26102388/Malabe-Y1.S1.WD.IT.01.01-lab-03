import java.util.Scanner;

public class IT26102388Lab3Q1B {

    public static void main(String[] args) {

        // Declare the variables
        double pricePerKg, quantity, totalAmount;
        double discount, amountToPay;

        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Enter the price per kilogram of rice
        System.out.print("Enter the price of 1kg of rice: ");
        pricePerKg = input.nextDouble();

        // Enter the number of kilograms
        System.out.print("Enter the number of kilograms you want to buy: ");
        quantity = input.nextDouble();

        // Calculate the total amount
        totalAmount = pricePerKg * quantity;

        // Calculate the 10% discount
        discount = totalAmount * 0.10;

        // Calculate the amount to pay
        amountToPay = totalAmount - discount;

        // Display the results
        System.out.println("Total amount: " + totalAmount);
        System.out.println("Discount (10%): " + discount);
        System.out.println("Amount to pay: " + amountToPay);

        input.close();
    }
}
