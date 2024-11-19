package ThirdWeekThuesday;

import java.util.Scanner;

public class TryCatchExeptsions {



    public static void main(String[] args) {

        divideNumbers();

    }
        public static int divideNumbers(){
            int a=100;
            Scanner sc = new Scanner(System.in);
            System.out.println("First number is 100. Enter the second number: ");
            int b = sc.nextInt();
            try{
                return a/b;
            }catch (ArithmeticException e){
                System.out.println("cant divide by zero");
            }
            return 0;
        }


    }
