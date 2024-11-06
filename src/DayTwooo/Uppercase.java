package DayTwooo;


        // Vaadata kõik ülesanded üle ja kirjutada ümber. Seal peaks kõik kirjeldama muutujatega. praegu liiga hard code

public class Uppercase {

    public static void main(String[] args) {

        System.out.println("Exercise 1: ");     //kirjuta lause suurte tähtedega
        String greeting ="hello world";
        greeting = greeting.toUpperCase();      // Greetingule uue väärtuse andmine
        System.out.println(greeting + "\n");          // kaldkriipsuga n tekitab vastusesse ühe tyhja rea


        System.out.println("Exercise 2: ");     //kirjuta antud lause väikeste tähtedega
        String greetingUp ="HELLO WORLD";
        greetingUp = greetingUp.toLowerCase();
        System.out.println(greetingUp + "\n");

        System.out.println("Exercise 3: ");     //kas antud lause sisaldab sõna world
        String greeting3 ="Hello, world";
        System.out.println(greeting3.contains("world") + "\n");

        System.out.println("Exercise 4: ");     //väljastada stringi esimene täht
        String greeting4 ="Hello";
        System.out.println(greeting4.charAt(0) + "\n");

        String original = "Hello ";            // Esimese märgi välja võtmine, leidmine, meetod kaks
        char firstChar = original.charAt(0);
        System.out.println(firstChar + "\n");

        System.out.println("Exercise 5: ");     //asendada o a-ga
        String greeting5 ="Hello, World";
        System.out.println(greeting5.replace('o','a') + "\n");

        System.out.println("Exercise 6: ");        //kontrollib, kas lause algab JA lõppeb mingite sõnadega
        String greeting6 ="Hello, World";
        System.out.println(greeting6.startsWith("Hello") && greeting6.endsWith("World"));
        System.out.println("\n");

        System.out.println("Exercise 7: ");
        String greeting7 ="Hello, World";
        System.out.println(greeting7.substring(7,12)+ "\n");

        System.out.println("Exercise 8: ");       //Write a program that finds the first and last position of a specific character in a string.
        String magicword ="abracadabra";
        System.out.println("Esimene a asub kohal: " + magicword.indexOf('a'));
        System.out.println("Viimane a asub kohal: " + magicword.lastIndexOf('a') + "\n");

        System.out.println("Exercise 9: ");     // Write a program that replaces a specific word in a sentence with another word
        String hooray = "Java is fun!";
        String regex = "fun";
        System.out.println(hooray.replaceFirst(regex, "awesome"));
        System.out.println("\n");



        System.out.println("testimiseks, veel harjutus endale");  //leia täht sõnast
        String sentence = "abracatabra";

        char findA = 'a';

        int firstA = sentence.indexOf(findA);
        int lastA = sentence.lastIndexOf(findA);

        System.out.println("First position of " + findA + ": " + firstA);
        System.out.println("Last position of " + findA + ": " + lastA);



    }

}
