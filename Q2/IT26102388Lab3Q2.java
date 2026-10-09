import java.util.Scanner;

public class IT26102388Lab3Q2 {

    public static void main(String[] args) {

        // Declare the variables
        double monthlySalary, otHours, otHourlyRate;
        double otAmount, totalSalary;

        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Input monthly salary
        System.out.print("Enter the monthly salary: ");
        monthlySalary = input.nextDouble();

        // Input OT hours
        System.out.print("Enter the number of OT hours: ");
        otHours = input.nextDouble();

        // Input OT hourly rate
        System.out.print("Enter the OT hourly rate: ");
        otHourlyRate = input.nextDouble();

        // Calculate OT amount
        otAmount = otHours * otHourlyRate;

        // Calculate total salary
        totalSalary = monthlySalary + otAmount;

        // Display the results
        System.out.println("OT Amount: " + otAmount);
        System.out.println("Total Salary: " + totalSalary);

        input.close();
    }
}
