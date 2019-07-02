package Objects_Basic;

import java.util.Comparator;

public class Book   {
    private String title;
    private Author author;
    private double price;
    public Book(String title, Author author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author.toString() +
                ", price=" + price +
                '}';
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    protected void print(){
        System.out.println("Title: " + title);
        author.print();
        System.out.println("Price: " + price + " $");
    }




    public double compare(Book o1, Book o2) {
        return this.getPrice() - o2.getPrice();
    }
}