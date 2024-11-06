package DayThree;


public class DayThreeFirstExercise {
    public static void main(String[] args) {

        int a = 5;
        int b = 6;
        int c = 7;
        getVolume(a,b,c);

    }

    private static void getVolume(int a, int b, int c) {
        int volume = a*b*c;
        System.out.println(volume);

        checkVolume(volume);

    }
    private static void checkVolume(int volume) {
        if (volume < 0) {
            System.out.println("Volume is negative");
        } else{
            System.out.println("Volume is positive");
        }
    }
}
