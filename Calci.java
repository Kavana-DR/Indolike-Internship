
import java.util.Scanner;
public class Calci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            // Take user input
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /, %): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;
            boolean valid = true;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0)
                        result = num1 / num2;
                    else {
                        System.out.println("Error: Division by zero is not allowed.");
                        valid = false;
                    }
                    break;
                case '%':
                    if (num2 != 0)
                        result = num1 % num2;
                    else {
                        System.out.println("Error: Modulus by zero is not allowed.");
                        valid = false;
                    }
                    break;
                default:
                    System.out.println("Invalid operator! Please use +, -, *, /, %.");
                    valid = false;
            }

            if (valid)
                System.out.println("Result: " + result);
            System.out.print("Do you want to perform another calculation? (y/n): ");
            choice = scanner.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Calculator exited. Thank you!");
        scanner.close();
    }
}

    

