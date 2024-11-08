package DayFive;

public class DayFiveExercises {


    public static void main(String[] args) {
        Car carinOtherClass1 = new Car();                //siin kasutame konstruktorit, kus pole parameetreid
        System.out.println(carinOtherClass1.brand);      //

        Car carInotherClass2 = new Car("Toyota","",2020);
        System.out.println(carInotherClass2.brand);
    }
}
