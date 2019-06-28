package Exceptions;

public class Task1 {
    public static void main(String[] args) {
        int n =10;
        int nReserving = 0;
        int[] a =  new int[n];
        try {
            for (int i = 0; i < n + 10; i++) {
                a[i] = i ;
                nReserving++;
            }
        }
        catch ( ArrayIndexOutOfBoundsException e){
            System.out.println("Exception: " + e);
        }

        finally {
            System.out.println("Successfull iteration = " + n);
            for (int i = 0; i < nReserving; i++)
                System.out.println(a[i]);

        }
    }
}
