package Objects_Basic;

import java.util.Comparator;
import java.util.Objects;

public class Author implements Comparator<Author> {

    protected String firstName;
    protected String lastName;
    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
    public String getAuthor() {
        return lastName + " " + firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstName, author.firstName) &&
                Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    protected void print(){
    System.out.println("Author" + firstName + " " + lastName);
    }

    @Override
    public int compare(Author o1, Author o2) {
        if (o1.firstName.compareTo(o2.firstName) != 0 )
        return o1.firstName.compareTo(o2.firstName);
        else return o1.lastName.compareTo(o2.lastName);
    }
}
