package DayTwooo;

import java.util.Scanner;

public class DayTwo {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("enter first number: ");
        int n = userInput.nextInt();
        System.out.println("teine number");
        int l = userInput.nextInt();
        int result =n + l;
        System.out.println("vastus üks "+ n + " vastus kaks " + l + " ja nende kokku liitmisel saame " + result);

    }
}
