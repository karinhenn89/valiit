package DayThree;

import java.util.Arrays;

public class Arrayfirst {

    public static void main(String[] args) {

        String[] carBrand = {"tesla", "honda", "audi"};
        String[] carModel = {"model S", "civic", "A3"};

        carModel[0] = "model 3";

        Arrays.sort(carBrand);
        System.out.println(Arrays.toString(carBrand));

        carBrand[0] = "BMW";

        System.out.println(carBrand[0]+ " " + carModel[0]);
    }
}
