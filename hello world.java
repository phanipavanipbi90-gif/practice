public class Main {
public static void main(String[] args) {
System.out.println("Hello World");
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