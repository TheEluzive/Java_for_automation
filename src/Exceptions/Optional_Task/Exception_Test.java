package Exceptions.Optional_Task;

public class Exception_Test {
    public static void main(String[] args) {
        try{
            throw new C("Exception C");
        }
        catch (A e){
            System.out.println(e.getMessage());
        }
    }
}
