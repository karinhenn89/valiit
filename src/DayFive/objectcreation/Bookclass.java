package DayFive.objectcreation;

import java.util.Locale;

public class Bookclass {

    public static void main(String[] args) {

        Book book1 = new Book("Harry Potter", "Author", 1896);
        /*System.out.println(book1.title);
        System.out.println(book1.author);
        System.out.println(book1.yearPublished);*/

        Book book2 = new Book();                //Kui jätan tühjaks, võtab default construktori, kui paned andmed, kirjutab andmed
      /*  System.out.println(book2.title);
        System.out.println(book2.author);
        System.out.println(book2.yearPublished);*/

        Book book3 = new Book("Kolm Karu", "Masha", 1987);
      /*  System.out.println(book3.title + ", "+  book3.author + ", " + book3.yearPublished);*/

        Book pipi = new Book ("Pipi Pikksukk", "Astrid Lingren", 1999);
       /* System.out.println(pipi.title);
        System.out.println(pipi.author);
        System.out.println(pipi.yearPublished);*/


        book3.toUppercase();                // kasutad Book klassist loodud meetodit. ERaldi real või objekti juures
        book2.toUppercase();
        book1.toUppercase();
        pipi.toUppercase();

    }

}
