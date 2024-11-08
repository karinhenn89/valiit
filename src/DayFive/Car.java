package DayFive;

public class Car {

    //properties of the class - fields
    String brand;
    String model;
    int year;
    //Deafult constructor            // loome etteandmata objektidele
    public Car(){                   //pole tüüpi. klassi nimi - kõikidel objektidel samad väärtused - siin määratud väärtused.
        brand = "Not specified";
        model = "Unknown";
        year = 2000;
    }
    //parametrizised constructor
    public Car(String brand, String model, int year) {                   //pole tüüpi. klassi nimi - kõikidel objektidel samad väärtused - siin määratud väärtused.
        this.brand  = brand;
        this.model = model;
        this.year = year;
    }
    public static void main(String[] args) {

        // Creating objects of the Car class
        Car car1 = new Car();                                       //loome Car klassist uue objekti - ta pole string, int...ta ongi Car tüüpi
        Car car2 = new Car("honda", "civic",2010);
        // Calling the method to display details of each car
        car1.displayDetails();
        car2.displayDetails();
    }
    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Details: ");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

}