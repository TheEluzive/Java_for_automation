package Exceptions.Task4;

public class MyExceptionSecond extends Exception{
    private String exceptionString;

    public MyExceptionSecond(String exceptionString){
        this.exceptionString = exceptionString;
    }

    public String getString(){
        return exceptionString;
    }
}