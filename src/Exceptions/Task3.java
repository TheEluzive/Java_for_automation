package Exceptions;

import java.io.IOException;

public class Task3 {
    public static void main(String[] args) {
        try{
            someMethod();
        }
        catch (MyException e){
            System.out.println("someMethod throws " + e.getString());
            e.printStackTrace();
        }
        finally {
            System.out.println("exception was");
        }
    }

    public static void someMethod() throws MyException{
        throw new MyException("some Exception");
    }

    public static class MyException extends Exception{
        private String exceptionString;

        public MyException(String exceptionString){
            this.exceptionString = exceptionString;
        }

        public String getString(){
            return exceptionString;
        }
    }
}
