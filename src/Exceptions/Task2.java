package Exceptions;

public class Task2 {
    public static void main(String[] args) {
        try{
            Exception exception = new Exception("My exception");
            throw exception;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("that must be");
        }
    }

}
