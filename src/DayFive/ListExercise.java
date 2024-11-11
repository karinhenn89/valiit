package DayFive;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {

    public static void main(String[] args) {

        String text = "Hello";
        System.out.println("\"Hello\" text lenght: " + text.length());

        String text2 = "";
        System.out.println("Text2 empty - true or false: " + text2.isEmpty());


        arrayListMistakeOne();
        arrayListMistakeTwo();
    }
    private static void arrayListMistakeOne(){
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("List size: " + numbers.size());

        for (int i = 0; i < numbers.size(); i++) {                                  //size loeb 1,2,3 - aga elemente on 0,1,2 - seega ei saa olla seal vahel et võrdub i
            System.out.println("Element at index " + i + ": " + numbers.get(i));

        }
       }
    private static void arrayListMistakeTwo(){

        //remove elements from a list in a loop
        //the code below attempts remove all even numbers from a list of integers.

        List<Integer> numbers = new ArrayList<>();

            for (int i = 1; i <= 10; i++) {
                numbers.add(i);
            }
        /*System.out.println("List, when numbers are added" + numbers);*/

           for (int i = numbers.size()-1; i >= 0; i--) {        //-1 nr size, sest numbers size loetakse alates ühest(1-10), aga listis on numbrid alates 0-ist (0-9)
                if (numbers.get(i) % 2 == 0) {
                    numbers.remove(i);
                }
            }

            System.out.println("List after removing even numbers: " + numbers);


        }


}
