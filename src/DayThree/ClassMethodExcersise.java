package DayThree;

import java.util.Scanner;

public class ClassMethodExcersise {

    // loo uus meetod, mis arvutab ruudu pindala (private static void getArea). kutsu see main meetodis välja
    //argumendi väärtused 4 ja 5
    // loo uus meetod private static void checkArea(), kutsu checkArea() meetod välja getArea meetodist
    //prindi konsooli "area is bigger than 20" kui pindala suurus ületab 20 ja "area is smaller than 20"

    public static void main(String[] args) {

        getArea();

    }

    private static void getArea(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Sisesta kaks täisarvu: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int area =a*b;
        System.out.println("Area size is: " + area);
        checkArea(area);
    }
    private static void checkArea(int area){
        if (area > 20){
            System.out.println("Area is bigger than 20");
        } else if (area < 20) {
            System.out.println("Area is smaller than 20");
        }else{
            System.out.println("Area is equal to 20");
        }
    }


}
