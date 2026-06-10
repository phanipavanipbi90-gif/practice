import java.util.Scanner;

public class SampleProgram {

    // Safely reads an integer with validation
    private static int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);

            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Consume invalid token
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two integers with validation
        int num1 = readInt(scanner, "Enter the first integer: ");
        int num2 = readInt(scanner, "Enter the second integer: ");

        // Compute sum
        int sum = num1 + num2;

        // Output result
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);

        scanner.close();
    }
}
