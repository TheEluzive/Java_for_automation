package Exceptions.Task3;

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


}
