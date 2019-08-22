package Exceptions.Task4;

public class MyExceptionFirst extends Exception{
    private String exceptionString;

    public MyExceptionFirst(String exceptionString){
        this.exceptionString = exceptionString;
    }

    public String getString(){
        return exceptionString;
    }
}
