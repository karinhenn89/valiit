package DayThree;

public class Methodsnew {

    //meetodid on mingid koodi osad, mis grupeerivad mingit teatud kindlat funktsionaalsust
    //kui koodis on korduvaid osasid, mõelda, kas teha nende kohta erinevad meetodid

    public static void main(String[] args) {
        getUser();
        getName();
        getPassword();
    }

    private static void getUser() {
        boolean isTrue = true;
        System.out.println("Hello");
        if (isTrue) {
            getName();
        }


    }
    private static void getName() {
        System.out.println("John");


    }
    private static void getPassword() {
        System.out.println("12345");
    }

}