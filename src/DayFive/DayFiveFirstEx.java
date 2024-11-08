package DayFive;

public class DayFiveFirstEx {

    public static void main(String[] args) {

        sumPositiveNumbers();
        firstNumberGreaterThan50();



    }
        private static void sumPositiveNumbers () {

        //Ex 4 - Print the Sum of Non-Negative numbers until a negative number is found
        //given an array of numbers, use a for loop to calculate the sum of all non-negative numbers. stop the loop when a negative number is encountered
            System.out.println("Exercise 4 answer is :");

            int sum = 0;                            //määrame algse summa nulliks, et seda tulemuseks kokku liita.
            int[] numbers = {5,12,3,7,-4,8,2};
            for (int posNum :numbers) {              //anname väärtuse igale massiivi/array liikmele.
                if (posNum < 0) {                   //tingimus, kui tuleb väiksem kui 0 number, siis lõpetada loop
                    break;
                }
                sum += posNum;                      //loop-is liidab kokku arvud järjest, mis sealt tulevad. see peab if plokist väljas olema.
            }
            System.out.println(sum);
    }
        private static void firstNumberGreaterThan50 () {
        //Ex 5 - find first number greater than 50
        //given an array of nr, use a loop to find the first number greater than 50. Print it and exit the loop immediately after finding it
            System.out.println("Exercise 5 answer is :");

            int[] numbers = {23,45,39,51,48,60};
            for (int overFifty :numbers) {
                if (overFifty > 50) {                   //tingimus otsib numbrit, mis on suurem kui 50, kirjutab selle ekraanile ja väljub loop-ist
                    System.out.println(overFifty);
                    break;
                }
            }

        }



}
