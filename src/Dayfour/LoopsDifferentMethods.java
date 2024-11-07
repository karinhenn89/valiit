package Dayfour;

public class LoopsDifferentMethods {

    public static void main(String[] args) {
        loopsNumbers();
        printCars();
        sumHundred();
        evenNumbers();
        sevenmultiplicationtable();
    }


    private static void loopsNumbers() {          //Loopib numbrid 1-10
        System.out.println("\n" + "First exercise");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ", ");
        }
    }

    private static void printCars() {          //print out each car brands
        System.out.println("\n" + "\n" + "Second exercise:");
        String[] cars = {"Ford", "Honda", "Audi"};
        for (String car : cars) {
            System.out.print(car + ", ");
        }
    }

    private static void sumHundred() {             //sum of numbers
        System.out.println("\n" + "\n" + "Third exercise:");
        int number = 1;
        int sum = 0;

        do {
            sum += number;
            number++;
        }
        while (number <= 100);
        System.out.println(sum);
    }
    private static void evenNumbers() {              //Even number between 1-20
        System.out.println("\n" + "Fourth exercise:");
        int i = 0;
        do {
            i += 2;
            System.out.print(i + ", ");
        }
        while (i <= 20);

    }
    private static void sevenmultiplicationtable() {              //7 korrutustabel
        System.out.println("\n" + "\n" + "Fifth exercise:");
        int seven = 7;
        for (int j = 1; j <= 10; j++) {
            int answer = seven * j;
            System.out.println(seven + " x " + j + " = " + answer);
        }
    }
}

