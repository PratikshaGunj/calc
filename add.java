import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Calculate the sum
        double sum = num1 + num2;
	double sub = num1 - num2;
        double mul = num1 * num2;


        // Display the result
        System.out.println("The sum is: " + sum);
        System.out.println("The mul is: " + mul);
	System.out.println("The sub is: " + sub);

        // Close the scanner
        scanner.close();
    }
}
