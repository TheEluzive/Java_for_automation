package Objects_Basic;

public class Book {
    private String title;
    private Author author;
    private double price;
    protected Book(String title, Author author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    protected void print(){
        System.out.println("Title: " + title);
        author.print();
        System.out.println("Price: " + price + " $");
    }
}