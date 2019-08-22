package Exceptions.Optional_Task;

public class A extends Throwable{
    public A(String message) {
        super("From A: " + message);
    }

    public static A ExceptionA(String a) throws A{
        return new A(a);
    }
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
