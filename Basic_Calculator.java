import java.util.Scanner;

public class Basic_Calculator {

    // Methods for operations
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        System.out.println("=== Java Console Calculator ===");

        while (keepRunning) {
            try {
                System.out.println("\nChoose an operation:");
                System.out.println("1. Addition (+)");
                System.out.println("2. Subtraction (-)");
                System.out.println("3. Multiplication (*)");
                System.out.println("4. Division (/)");
                System.out.println("5. Exit");
                System.out.print("Enter choice (1-5): ");

                int choice = Integer.parseInt(scanner.nextLine());

                if (choice == 5) {
                    keepRunning = false;
                    System.out.println("Exiting calculator. Goodbye!");
                    break;
                }

                if (choice < 1 || choice > 5) {
                    System.out.println("Invalid choice. Please select from 1 to 5.");
                    continue;
                }

                System.out.print("Enter first number: ");
                double num1 = Double.parseDouble(scanner.nextLine());

                System.out.print("Enter second number: ");
                double num2 = Double.parseDouble(scanner.nextLine());

                double result = 0;

                switch (choice) {
                    case 1:
                        result = add(num1, num2);
                        break;
                    case 2:
                        result = subtract(num1, num2);
                        break;
                    case 3:
                        result = multiply(num1, num2);
                        break;
                    case 4:
                        result = divide(num1, num2);
                        break;
                }

                System.out.println("Result: " + result);

            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter valid numbers.");
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected error occurred: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
