package Objects_Basic;

import java.util.Scanner;



public class DogsDemo {


    //private  static
    private static int amount = 0;
    //private Dogs[] dogs = new Dogs[amount];
    static Dogs sobaka = new Dogs();


    public static void main(String ... args) {
        Scanner in = new Scanner((System.in));
        System.out.print("Amount dogs = ");

        amount = in.nextInt();

        System.out.println("Specify any or none of the values for name, age or size(SMALL, MEDIUM or BIG) ");
        /*for (int i=0; i<amount;){
        if (dogs[2].newDogs(2))
            i++;
        }*/
        //System.out.println(dogs);
        sobaka.newDogs(1);
       // dogs[0].newDogs(0);

    }




}
