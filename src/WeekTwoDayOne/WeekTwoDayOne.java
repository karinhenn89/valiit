package WeekTwoDayOne;


import java.sql.SQLOutput;
import java.util.*;
import java.util.Scanner;

public class WeekTwoDayOne {

    public static void main(String[] args) {

        /*firstExercise();*/
        /*secondExercise();
        secondRightsolutionExercise();*/
        thirdExercise();

    }

    private static void firstExercise() {

        //Find unique Words from a sentence
        //Hints: input, scanner
        //Problem: Write a program, that takes a sentence as input, splits it into words and then stores each unique word in a set.
        // finally print the set of unique words.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split("\\s+");

        Set<String> wordsSeparated = new HashSet<>();

        for (String word : words) {
            System.out.println(word);
            wordsSeparated.add(word);           //adds words into set
        }
        System.out.println("Unique words: " + wordsSeparated);

        System.out.println(wordsSeparated);
    }

    private static void secondExercise() {

        //remove all vowels from a set of characters
        //Problem: create a set of lowercase alphabet characters, then remove all vowels from the set. Finally print the set with only consonants

        Set<Character> letters = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                continue;
            }
            letters.add(c);

        }
        System.out.println(letters);

    }
    private static void secondRightsolutionExercise() {

        Set<Character> letters = new HashSet<>();                   //koostame tähestiku algusest peale
        for (char c = 'a'; c <= 'z'; c++) {
            letters.add(c);
        }
        System.out.println(letters);

        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');    //koostame uue listi täishäälikutega

        letters.removeAll(vowels);                                  //eemaldame kõik vowels seti märgid letters listist

        System.out.println("Alphabet without vowels: " + letters);  //kirjutame välja uue listi
    }
    private static void thirdExercise() {
        // Guess the number
        //write a program that asks the user to guess a number between 1 and 50. The program should continue to prompt the user until the correct number is guessed.
        // If the guess is not correct, print a message saying "try again". otherwise print "correct guess". program shoud use != to check if the guess is wrong.
        //hint: set the maximum number of attempts: int maxAttempts

        Scanner sc = new Scanner(System.in);
        /*System.out.println("Guess The number: ");

        int num = sc.nextInt();*/

        int maxAttempts = 5;
        int correctNumber = 10;

        for (int attempt = 0; attempt < maxAttempts; attempt++) {

            if (attempt < maxAttempts) {

                System.out.println("Guess The number betweel 1 and 50: ");        //Küsib kasutajalt numbri sisendit
                int num = sc.nextInt();

                if (num != correctNumber) {                                 // False, kui ei võrdu õige vastusega - et eitus oleks ennemalt
                    if (attempt == maxAttempts-1){               //kuna esimene attempt on 0 , siis  max attempts peaks olema -1, et viienda katse korral ütleks Game over , mitte try again
                        System.out.println("Game over");
                        break;                                     //peale viiendat katset viskab välja
                    }
                    else {
                        System.out.println("Try Again!");           //kui vastus ei võrdu ˇ10, ütleb, proovi veel
                    }
                } else {
                    System.out.println("Correct Guess!");          //kui vastus on 10, siis ütleb, et on õige ja viskab loopist välja
                    break;
                }
            }
        }
    }
}
