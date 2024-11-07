package Dayfour;

                        // ülesanne - suurendab Array's kohta ühe võrra. ++ käsk
import java.util.Arrays;

public class ArrayTest1 {

    public static void main(String[] args) {

        int[] firstArray = new int[5];

        System.out.println("Initial array values: " + Arrays.toString(firstArray));

        firstArray[0]++;                            //suurendame esimese koha numbrit ühe võrra.
        firstArray[0]++;                            //suurendame esimese koha numbrit veel ühe võrra

        firstArray[1] = 8;                          //muudab teise koha numbri kaheksaks
        firstArray[1] = firstArray[1] + 2;           //liidab olemasolevale kohale 2 numbrile +2 juurde

        System.out.println(firstArray[0]);
        System.out.println(firstArray[1]);
        System.out.println("Changed array values: " + Arrays.toString(firstArray));





    }
}
