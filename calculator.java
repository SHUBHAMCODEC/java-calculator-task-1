import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        double result = calculate(num1, operator, num2);
        System.out.println("Result: " + result);
    }

    public static double calculate(double num1, char operator, double num2) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                    return Double.NaN;
                } else {
                    return num1 / num2;
                }
            default:
                System.out.println("Error: Invalid operator.");
                return Double.NaN;
        }
    }
}

