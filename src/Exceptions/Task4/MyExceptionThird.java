package Exceptions.Task4;

public class MyExceptionThird extends Exception{
    private String exceptionString;

    public MyExceptionThird(String exceptionString){
        this.exceptionString = exceptionString;
    }

    public String getString(){
        return exceptionString;
    }
}
