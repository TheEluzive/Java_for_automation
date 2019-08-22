package Exceptions.Task3;

public  class MyException extends Exception{
    private String exceptionString;

    public MyException(String exceptionString){
        this.exceptionString = exceptionString;
    }

    public String getString(){
        return exceptionString;
    }
}
