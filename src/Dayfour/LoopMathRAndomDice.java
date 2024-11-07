package Dayfour;

public class LoopMathRAndomDice {

    public static void main(String[] args) {

        int diceRoll =rollDice();                           //muutuja väärtustamine

        System.out.println("You rolled a number: " + diceRoll);
    }

    private static int rollDice(){
        return (int)(Math.random()*6)+1;                    // math random on 0 ja 1 vahel. korrutame kuuega ja lisame ühe, et saada numbrid 1-6 täisarvudena.
    }                                                       //int sulgude sees. math.random on tglt double, see int teisendab tulemuse täisarvuks
}                                                           //casting - väärtuse tüübi muutmine
