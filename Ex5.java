import java.util.Scanner;

interface Calculator {
    double add(double num1, double num2);
    double subtract(double num1, double num2);
    double multiply(double num1, double num2);
    double divide(double num1, double num2);
}

class SimpleCalculator implements Calculator {

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Division by zero is not possible.");
            return 0;
        }
        return num1 / num2;
    }
}

public class Ex5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SimpleCalculator calculator = new SimpleCalculator();

        while (true) {

            System.out.println("\nChoose Operation");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. End");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("First Number: ");
                    double num1 = sc.nextDouble();

                    System.out.print("Second Number: ");
                    double num2 = sc.nextDouble();

                    System.out.println("Result = " + calculator.add(num1, num2));
                    break;

                case 2:
                    System.out.print("First Number: ");
                    double num3 = sc.nextDouble();

                    System.out.print("Second Number: ");
                    double num4 = sc.nextDouble();

                    System.out.println("Result = " + calculator.subtract(num3, num4));
                    break;

                case 3:
                    System.out.print("First Number: ");
                    double num5 = sc.nextDouble();

                    System.out.print("Second Number: ");
                    double num6 = sc.nextDouble();

                    System.out.println("Result = " + calculator.multiply(num5, num6));
                    break;

                case 4:
                    System.out.print("First Number: ");
                    double num7 = sc.nextDouble();

                    System.out.print("Second Number: ");
                    double num8 = sc.nextDouble();

                    System.out.println("Result = " + calculator.divide(num7, num8));
                    break;

                case 5:
                    System.out.println("Calculator ended.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}