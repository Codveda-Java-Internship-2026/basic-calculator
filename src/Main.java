import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BasicCalculator calc = new BasicCalculator();

        System.out.print("Enter the first number: ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter 1 operator of choice (*, /, +, -): ");
        String operator = sc.next();

        System.out.print("Enter the second number: ");
        int secondNumber = sc.nextInt();

        sc.close();
        
        switch (operator) {
            case "*":
                System.out.println("Result: " + calc.multiplication(firstNumber, secondNumber));
                break;

            case "/":
                System.out.println("Result: " + calc.division(firstNumber, secondNumber));
                break;

            case "+":
                System.out.println("Result: " + calc.addition(firstNumber, secondNumber));
                break;

            case "-":
                System.err.println("Result: " + calc.subtraction(firstNumber, secondNumber));
                break;
        
            default:
                System.out.println("Invalid input!");
                break;
        }
    }
}
