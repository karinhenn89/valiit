package Dayfour;

import java.util.Arrays;

public class ArrayExercises {


    public static void main(String[] args) {

        //Task 1: Declare an integer array of size 5 and initialize it with values: {1, 2, 3, 4, 5}.
        //Hint: Use int[] myArray = {1, 2, 3, 4, 5};

        int[] array1 = new int[5];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        array1[3] = 4;
        array1[4] = 5;

        System.out.println("Exercise 1 - My first Array:" + Arrays.toString(array1));

        //exercise 2 - Task: Access and print the third element in the array {10, 20, 30, 40, 50}.
        //Hint: Use array[2] (since arrays are zero-indexed).

        int[] array2 = {10,20,30,40,50};
        System.out.println("Exercise 2, 3rd element in the row is:" + array2[2]);       //pöörata täheleapnu, et kolmanda elemendi nr on 2


        //Exercise 3 - Given an array {5, 10, 15, 20}, change the second element to 12 and print the entire array to see the change.
        //Hint Assign a new value to array[1], then print the elements individually.

        int[] array3 = {5,10,15,20};
        System.out.println("Exercise 3 - First array " + Arrays.toString(array3));      // arraystostring, sest array on int väärtus

        array3[1] = 12;                                                     //annan kohale 2 uue väärtuse
        System.out.println("           - changed array: " + Arrays.toString(array3));
        System.out.println("            second version:  " + array3[0] + " " + array3[1] + " " + array3[2]+ " " + array3[3]);     //teine variant muutujate näitamisel

        //Exercise 4 - Create an array {8, 6, 7, 5, 3, 0, 9} and print its length
        //Hint: Use array.length to get the length of an array.

        int[] array4 = {8, 6, 7, 5, 3, 0, 9};
        int array4lenght = array4.length;
        System.out.println("Exercise 4 - Lenght of array " + array4lenght);

        //Task: Calculate the sum of elements in an array {4, 2, 8, 1, 6} and store it in a variable.
        //Hint: Manually add each element: int sum = array[0] + array[1] + ... + array[4];

        int[] array5 = {4,2,8,1,6};
        System.out.println("Exercise 5 - print out  array: " + Arrays.toString(array5));
        int arraySum = array5[0] + array5[1] + array5[2]+ array5[3] + array5[4];
        System.out.println("             print out array sum: " + arraySum);

        //katsetus - kuidas arrayst asju välja kirjutada

        String[] array6 = {"red","blue"};

        System.out.println("Test Array - "+ array6[0] + " and " + array6[1]);




    }
}
