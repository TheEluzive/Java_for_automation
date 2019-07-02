package Lambda_Expressions_And_Stream_API;

import Objects_Basic.Author;
import Objects_Basic.Book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Task_2 {
    public static void main(String[] args) {
        ArrayList<Book> arrayList = new ArrayList<>();

        arrayList.add(new Book("Martin Iden", new Author("Jack", "London"), 20.5));
        arrayList.add(new Book("Love of Life", new Author("Jack", "London"), 5.5));
        arrayList.add(new Book("Master and Margarita", new Author("Michael", "Bulgakov"), 15));
        arrayList.add(new Book("Programming on Java, comprehensive guide for professionals", new Author("Patrick", "Naimayer"), 15));
        arrayList.add(new Book("1984", new Author("Dzhordzh", "Oruell"), 25));
        arrayList.add(new Book("1984", new Author("Daaaao", "Oruell"), 25));

        ///// book with the highest price;
        System.out.println("book with the highest price: " +
                arrayList.stream().max(Comparator.comparing(Book::getPrice)).get().toString() + "\n");


        ///////////String containing books titles separated by the space character containing all books written by an author;
        //space change to ','

        ArrayList<Book> byAuthor = arrayList.stream()
                .filter((a) -> a.getAuthor().equals(new Author("Jack", "London"))).collect(Collectors.toCollection(ArrayList::new));

        ArrayList<String> booksNameFromAuthor = new ArrayList<>();
        for (Book book : byAuthor) {
            booksNameFromAuthor.add(book.getTitle());
            //System.out.println(book);
        }
        String stringBooks="";
        for (int i = 0;i<booksNameFromAuthor.size(); i++){

            if (i == 0)stringBooks =stringBooks + booksNameFromAuthor.get(i);
                else stringBooks =stringBooks + ", " + booksNameFromAuthor.get(i);
        }
        System.out.print(stringBooks + "\n");

        //list of books sorted by the author's full name
        ArrayList<Book> books = arrayList.stream().sorted(
                Comparator.comparing(book -> book.getAuthor().getAuthor())
        ).collect(Collectors.toCollection(ArrayList::new));
        books.forEach(s -> System.out.print(s + "\n"));
        System.out.println();

        //sum of all books prices in the list.
        double sumPrices = arrayList.stream().mapToDouble(Book::getPrice).sum();
        System.out.println(sumPrices);

    }
}
