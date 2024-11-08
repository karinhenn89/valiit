package Dayfour;

public class LoopBreak {

    //Break and Continue

    public static void main(String[] args) {

    firstEvenNumber();
    oddNumbersPrint();
    multiplesOf3SkipSix();

    }

    private static void firstEvenNumber(){

        //find first even number with loop, exit and print it on the screen
        System.out.println("First even number, Exercise 1: ");

        int[] numbers = {1,3,7,4,9,10};

        for (int number : numbers){             //for each loop, mingi kogumi põhjal
           if (number % 2==0){
               System.out.println(number);
               break;                                   //break - kirjutab selle paarisarvu ekraanile ja kohe peale seda lõpetab loop-imise
           }
        }

    }
    private static void oddNumbersPrint(){

        //use a for loop to print all odd numbers between 1 and 20. if number is a multiple of 5, skip it using continue
        System.out.println("Odd numbers, Exercise 2: ");

        for (int i= 1; i<=20; i +=2){           //only get odd numbers
           if (i%5==0){
               continue;                        //skip numbers what are divided by 5
           }
           System.out.println(i);               //print out odd numbers, where there are no numbers in what divides by 5

        }

    }

    private static void multiplesOf3SkipSix() {
        //print multiples  3 up to 30, skip multiples of 6
        //use a for loop to print multiples up to 30.skip any multiples of 6 using continue
        System.out.println("Multiples of three, Exercise 3: ");

        /*int j = 3;                        //Ma ise tegin nii, ehk siis vastused said õiged, ag ama tegin korrutustabeli. oli ainult vastuseid vaja
        for (int i = 1; i <= 10; i++) {
            int answer = i * j;
            if (answer % 6 == 0) {
                continue;
            }
            System.out.println(j + " x " + i + " = " + answer);
        }
        */

        for (int i = 3; i <= 30; i += 3) {
            if (i % 6 == 0) {
                continue;           //skip the numbers that are multiples of 6
            }
            System.out.println(i);
        }

    }
}