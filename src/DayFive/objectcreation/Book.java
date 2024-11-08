package DayFive.objectcreation;

public class Book {

    //properties of the class

    String title;
    String author;
    int yearPublished;

    //Default constructor
    public Book(){
        title = "Unknown";
        author = "Unknown";
        yearPublished = 1900;
    }
    //parameterized constructor
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public void toUppercase() {
        System.out.println(title.toUpperCase() +", " + author.toUpperCase() + ", " + yearPublished);
    }
}
