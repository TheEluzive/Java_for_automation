package Objects_Basic;

import java.util.Scanner;



public class DogsDemo {


    //private  static
    private static int amount;
    private static Dogs[] dogs;
    //static Dogs sobaka = new Dogs();


    public static void main(String ... args) {
        Scanner in = new Scanner((System.in));
        System.out.print("Amount dogs = ");

        amount = in.nextInt();

        Dogs.size[] size = new Dogs.size[amount];
                dogs = new Dogs[amount];
        for (int i=0; i < amount; i++)
            dogs[i] = new Dogs();
        //Dogs.size[] size = new Dogs.size[amount];
        //System.out.println("Specify any or none of the values for name, age or size(SMALL, MEDIUM or BIG) ");
        for (int i=0; i<amount;){
        if (dogs[i].newDogs(i))
            i++;
        }





    }




}
