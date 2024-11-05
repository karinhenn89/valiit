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
        System.out.print("Addition: " + addition);

        if (addition % 2 == 0) {
            System.out.println(", Even");
        } else {
            System.out.println(", Odd");
        }
        int subtraction = num1 - num2;
        System.out.print("Subtraction: " + subtraction);
        if (subtraction % 2 == 0) {
            System.out.println(", Even");
        } else {
            System.out.println(", Odd");
        }
        int multiplication = num1 * num2;
        System.out.print("Multiplication: " + multiplication);
        if (multiplication % 2 == 0) {
            System.out.println(", Even");
        } else {
            System.out.println(", Odd");
        }
        if (num2 == 0){                                     //välistada nulliga jagamine, muidu error
            System.out.println("You cant divide by 0.");
        } else {
            int division = num1 / num2;
            System.out.print("Division: " + division);

            if (division % 2 == 0) {
            System.out.println(", Even");
            } else {
                System.out.println(", Odd");
            }

            }
        }
    }