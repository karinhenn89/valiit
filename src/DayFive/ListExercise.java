package DayFive;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {

    public static void main(String[] args) {

        /*arrayListMistakeOne();*/
        arrayListMistakeTwo();
    }
//    private static void arrayListMistakeOne(){
//        ArrayList<Integer> numbers = new ArrayList<>();
//
//        numbers.add(10);
//        numbers.add(20);
//        numbers.add(30);
//
//        for (int i = 0; i < numbers.size(); i++) {                                  //size loeb 1,2,3 - aga elemente on 0,1,2 - seega ei saa olla seal vahel et võrdub i
//            System.out.println("Element at index " + i + ": " + numbers.get(i));
//
//        }
//        }
    private static void arrayListMistakeTwo(){

        //remove elements from a list in a loop
        //the code below attempts remove all even numbers from a list of integers.

        List<Integer> numbers = new ArrayList<>();

            for (int i = 1; i <= 10; i++) {
                numbers.add(i);
            }
        System.out.println("List, when numbers are added" + numbers);

           for (int i = numbers.size(); i >= 0; i--) {
                if (numbers.get(i) % 2 == 0) {
                    numbers.remove(i);
                }
            }

            System.out.println("List after removing even numbers: " + numbers);


        }


}
