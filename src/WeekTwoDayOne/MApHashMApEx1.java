package WeekTwoDayOne;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MApHashMApEx1 {


    public static void main(String[] args) {

        /*addUsers();
        studentGrades();
        removeKeyVAluPair();*/
        calculatorCompoundInterest();


    }

    private static void addUsers(){
       //Ex 1 - add user to map
        // Create a new map and add 2 new users  - print out user name and jobposition

        Map<String, String> jobPositions = new HashMap<>();
        jobPositions.put("John", "manager");
        jobPositions.put("Mark", "CEO");

        for (String namekey : jobPositions.keySet()) {
            System.out.println(namekey + " position at work is " + jobPositions.get(namekey));
        }

    }

    private static void studentGrades(){
        //ex 2 Store and retrieve student grades
        //creat a map where the key is a student name (string), and the value is their grade (integer)

        Map<String, Integer> grades = new HashMap<>();
        grades.put("Mary", 1);
        grades.put("Alex", 3);
        grades.put("Thomas", 5);
        grades.put("Teresa", 4);

        for (String namekey : grades.keySet()) {
            System.out.println(namekey + " grade is " + grades.get(namekey));
        }

    }
    private static void removeKeyVAluPair() {
        //remove a key-value pair
        //create a map that stores employee names and their salaries. write a program to remove an employee from the map by name and print the updated map
        //hint : use map method remove () using the key

        Map<String, Integer> salary = new HashMap<>();
        salary.put("John", 500);
        salary.put("Mark", 100);
        salary.put("Alex", 50);
        salary.put("Thomas", 20);

        String employeeToRemove = "Mark";

        salary.remove(employeeToRemove);              //See eemaldab key-valu paari "key" alusel

        System.out.println("Updated map: "+ salary);

        /*for (String namekey : salary.keySet()) {                            //kirjutab ekraanile uue key - valu paari mapi
            System.out.println(namekey + " salary is " + salary.get(namekey));*/
        }

    private static void calculatorCompoundInterest() {
        //Task compound Interest Calculator (liitintressi kalkulaator)
        //Create a Java program that calculates the compound interest based on user input. The formula for compound interest is:

        System.out.println("Principal amount (The initial amount of money)");
        Scanner scanner = new Scanner(System.in);
        int P =scanner.nextInt();

        System.out.println("Annual interest rate (in decimal form, so 5% = 0.05):");
        double r = scanner.nextDouble();

        System.out.println("Number of times the interest is compounded per year: ");
        int n = scanner.nextInt();

        System.out.println("time, the money is invested or borrowed for, in years: ");
        int t = scanner.nextInt();
        double s = n*t;
        double k = 1+r/n;

        double a = Math.pow (k, s);
        double b = P*a;

        System.out.println(b); //proovida see lahtilöödud valem ühe tehte alla kokku ikka panna.



    }
}

