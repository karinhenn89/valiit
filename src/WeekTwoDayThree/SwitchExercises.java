package WeekTwoDayThree;

import java.util.Scanner;

public class SwitchExercises {


    public static void main(String[] args) {
        dayOfTheWeek();
        calculatorSimple();
        grades();
        monthDays();
        seasonFinder();

    }
        public static void dayOfTheWeek() {
            //switch statement
            //day of the week
            //Write a java program that takes an integer from 1 to 7 and prints the corresponding day of the week (e.g 1 for monday..

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of weekday : ");

            int weekdayNumber = Integer.parseInt(sc.nextLine());
            switch (weekdayNumber) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid day. Enter a number between 1 and 7");
            }
        }
        public static void calculatorSimple() {
            ////Exercise 2: Calculator
            //Task: Write a Java program that takes two numbers and an operator (+, -, *, /) as input and performs the corresponding calculation.

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two numbers and a operator to perform the corresponding operation : ");
            System.out.println("Enter first number : ");
            int firstNumber = Integer.parseInt(sc.nextLine());
            System.out.println("Enter second number : ");
            int secondNumber = Integer.parseInt(sc.nextLine());
            System.out.println("Enter operator (+, -, * or /) : ");
            String operator = sc.nextLine();

            switch (operator) {
                case "+":
                    int result = firstNumber + secondNumber;
                    System.out.println(firstNumber + "+" + secondNumber + " = " + result);
                    break;
                case "-":
                    int resultMinus = firstNumber - secondNumber;
                    System.out.println(firstNumber + "-" + secondNumber + " = " + resultMinus);
                    break;
                case "*":
                    int resultMult = firstNumber * secondNumber;
                    System.out.println(firstNumber + "*" + secondNumber + " = " + resultMult);
                    break;
                case "/":                                                                   //nulliga jagamise tingimus sisse
                    if (secondNumber ==0) {
                        System.out.println("cant divide by zero");
                    }
                    else {
                        int resultdiv = firstNumber / secondNumber;
                        System.out.println(firstNumber + " / " + secondNumber + " = " + resultdiv);
                    }
                    break;
                default:
                    System.out.println("Invalid operator");
                    break;

            }
        }
        public static void grades(){
        ////Exercise 3: Grade Description
         //Task: Write a Java program that takes a grade character (A, B, C, D, or F) and prints out a description
         // (e.g., A for "Excellent", B for "Good", C for "Average", D for "Poor", F for "Fail").

                System.out.println("Insert grade character (A,B,C,D or F) for description: ");
                Scanner sc = new Scanner(System.in);
                String grade = sc.nextLine();
                switch (grade) {
                    case "A":
                        System.out.println("Excellent");
                        break;
                    case "B":
                        System.out.println("Good");
                        break;
                    case "C":
                        System.out.println("Average");
                        break;
                    case "D":
                        System.out.println("Poor");
                        break;
                    case "F":
                        System.out.println("Fail");
                        break;
                    default:
                        System.out.println("Invalid grade");
                        break;
                }


        }
        private static void monthDays(){
        ////Exercise 4: Month Days
        //Task: Write a program that takes an integer (1-12) representing a month and prints the number of days in that month. Assume February has 28 days.

          Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of month (from 1 to 12) to get the number of days in that month : ");
            int monthNumber = Integer.parseInt(sc.nextLine());
            switch (monthNumber) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    System.out.println("31 days");
                    break;
                case 2:
                    System.out.println("28 days");
                    break;
                case 4: case 6: case 9: case 11:
                    System.out.println("30 days");
                    break;
                default:
                    System.out.println("Invalid month");
                    break;


            }

        }
        private static void seasonFinder(){
        ////Exercise 5: Season Finder
        //Task: Write a program that takes an integer from 1 to 12 and prints the season (e.g., December, January, February for "Winter").

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the month number to get Season : ");
            int monthNumber = Integer.parseInt(sc.nextLine());
            switch (monthNumber) {
                case 1: case 2: case 12:
                    System.out.println("Winter");
                    break;
                case 4: case 5: case 3:
                    System.out.println("Spring");
                    break;
                case 7: case 8: case 6:
                    System.out.println("Summer");
                    break;
                case 10, 11, 9:
                    System.out.println("Autumn");
                    break;
                default:
                    System.out.println("Invalid month");
                    break;
            }

        }

    }

