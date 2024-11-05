package DayTwooo;




public class Uppercase {

    public static void main(String[] args) {

        System.out.println("Exercise 1: ");     //kirjuta lause suurte tähtedega
        String greeting ="hello world";
        System.out.println(greeting.toUpperCase() + "\n");          // kaldkriipsuga n tekitab vastusesse ühe tyhja rea


        System.out.println("Exercise 2: ");     //kirjuta antud lause väikeste tähtedega
        String greetingUp ="HELLO WORLD";
        System.out.println(greetingUp.toLowerCase()+ "\n");

        System.out.println("Exercise 3: ");     //kas antud lause sisaldab sõna world
        String greeting3 ="Hello, world";
        System.out.println(greeting3.contains("world") + "\n");

        System.out.println("Exercise 4: ");     //väljastada stringi esimene täht
        String greeting4 ="Hello";
        System.out.println(greeting4.charAt(0) + "\n");

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


    }

}
