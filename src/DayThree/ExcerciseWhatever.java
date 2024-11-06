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

    private static void getName(){
        System.out.println("John");
    }

    private static void checkUserAge(){
        int age = 20;                                           //mis siis kui siin vanus muutub
        if (age < 18) {
            System.out.println("you are younger than 18 years");
        } else {
            getAgee(age);
        }
    }
    private static void getAgee(int age){
        System.out.println("Age is:" + age);                       //kuidas vanuse muutumise korral age siia muutujaks tuua
    }


}
