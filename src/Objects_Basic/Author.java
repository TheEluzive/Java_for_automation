package Objects_Basic;

public class Author {

    protected String firstName;
    protected String lastName;
    protected Author(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    protected void print(){
    System.out.println("Author" + firstName + " " + lastName);
    }
}
