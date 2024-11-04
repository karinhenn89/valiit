
public class DayOne {
    public static void main(String[] args) {

        // System.out.println("Karin");

        // if conditions - print out "b on bigger than a"
        // If, If else, Else - b on suurem kui a , a on suurem kui b, a ja b on võrdsed

        /*


        int a = 1;
        int b = 2;

        if (b > a){
            System.out.println("b on suurem kui a");
        } else if (a > b){
            System.out.println("b on väiksem kui a");
        } else{
            System.out.println("b võrdub a");
        }
                                */


      //print out "b is bigger than a , andb a is positive"
      //print out "a is bigger than b, and  b is positive" in else if block
      //print out "a and b are either equal on both are negative" in else if block//print out "no specific conditions were met" in else block


        int a = 1;
        int b = 2;

        if (b>a && a>=0) {
            System.out.println("b is bigger than a, and a is positive");
        } else if (a>b && b>=0) {
            System.out.println("a is bigger than b, and b is positive");
        } else if (a==b || (a<0 && b<0)) {
            System.out.println("a and b are either equal or both are negative");
        } else {
            System.out.println("No specific conditions were met");
        }

        }

    }

