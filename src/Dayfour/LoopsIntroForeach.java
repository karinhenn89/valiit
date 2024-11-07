package Dayfour;

public class LoopsIntroForeach {

    public static void main(String[] args) {

        String[] fruits = {"Apple", "Banana", "Orange", "Mango"};
        for (String fruit : fruits) {                               //kirjutab välja arrayst andmed - stringile saab anda uue nimi. see Fruit ainuses
            System.out.println("Fruit: " + fruit);                  //forEach lõppeb array lõpuga
        }

    }
}
