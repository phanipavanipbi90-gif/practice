<<<<<<< HEAD
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
=======
import java.util.Scanner; // Import Scanner for user input

public class SampleJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt for name
            System.out.print("Enter your name: ");
            String name = scanner.nextLine().trim();

            // Prompt for age
            System.out.print("Enter your age: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Age must be a number.");
                return;
            }
            int age = scanner.nextInt();

            // Output greeting
            System.out.println("Hello, " + name + "! You are " + age + " years old.");

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close(); // Always close the scanner
        }
    }
}
>>>>>>> e4b1ca5 (dummy commit)
