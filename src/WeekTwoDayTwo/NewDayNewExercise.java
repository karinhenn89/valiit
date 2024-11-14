package WeekTwoDayTwo;

public class NewDayNewExercise {

    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);       //FAlse stringide puhal equals, muidu jookseb rappa tulemusega. siin hello ei võrdu hello, sest üks on objekt, teine string
        System.out.println(str1.equals(str3));
    }
}
