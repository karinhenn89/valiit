package DayThree;

public class ExcerciseWhatever {
    public static void main(String[] args) {

        getPerson();

    }

    private static void getPerson(){
        System.out.println("Checking user details: ");
        getName();
        checkUserAge();

    }

    private static void getAge(){
        System.out.println("30");
    }

    private static void getName(){
        System.out.println("John");
    }

    private static void checkUserAge(){
        int age = 30;                                           //mis siis kui siin vanus muutub
        if (age < 18) {
            System.out.println("you are younger than 18 years");
        } else {
            getAgee();
        }
    }
    private static void getAgee(){
        System.out.println("Age is 30");                       //kuidas vanuse muutumise korral age siia muutujaks tuua
    }


}
