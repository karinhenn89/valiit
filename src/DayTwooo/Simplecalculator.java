package DayTwooo;

import java.util.Scanner;

public class Simplecalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert first number: ");
        int num1 = scanner.nextInt();
        System.out.println("insert second number: ");
        int num2 = scanner.nextInt();

        int addition = num1 + num2;
        System.out.println("Addition: " + addition);
        int subtraction = num1 - num2;
        System.out.println("Subtraction: " + subtraction);
        int multiplication = num1 * num2;
        System.out.println("Multiplication: " + multiplication);
        int division = num1 / num2;
        System.out.println("Division: " + division);

    }
}
