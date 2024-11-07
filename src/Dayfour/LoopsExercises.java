package Dayfour;

public class LoopsExercises {

    public static void main(String[] args) {

        //Exercise 1 - Print numbers 1 to 10
        //write a program that uses a for loop to print numbers from 1 to 10
        //use for loop, example for {int i =0; i<myArray.lenght; i++}

        for (int i = 1; i<=10; i++) {
            System.out.println("First Exercise loop: " + i);
        }


        //Exercise 2 - the forEach loop (or enhanced loop) is designed to iterate over collections or arrays without needing
        //an index variable. creat an array string[]cars, define array with elements. using loop print each car brand to the console

        String[] cars = {"Ford", "Honda", "Audi"};
        for (String car : cars) {
            System.out.println("Second exercise: " + car);
        }

        //Exercise 3 - Loop that calculates the sum of first 100 positive integers
        //while < boolean

        int number = 1;                                         //defineerib esimese numbri
        int sum = 0;                                            //alustab numbrite liitmist alates algusest

        do {
            sum = sum + number;                                 //loop jätab meelde eelmise summa ja eelmise numbri ja teeb nendega tehteid järjest kuni nr jõuab 100ni
            number++;
        }
        while (number <= 100);
        System.out.println("Third exercise: " + sum);

        //Exercise 4 Exercise 4 – Even Numbers Between 1 and 20
        //Write a program that uses a for loop to print all the even numbers between 1 and 20.
        //For incrementing use:  i += 1 (1 is just an example, assign a correct number instead of 1)

        int i = 0;
        do {
            i += 2;
            System.out.println(i);
        }
        while (i <= 20);


        //Exercise 5 Multiplication table
        //write a program that uses a for loop to print the multiplication table of 7. Provide the table up to 7x10=70
        //meaning limit loop to repeat 10 times.
        //Hint: when printing te result, use variables values and strings

        int seven = 7;
        for (int  j = 1 ; j<=10; j++) {
            int answer = seven * j;
            System.out.println(j + " x " + j +" = " + answer);
        }



    }
}
