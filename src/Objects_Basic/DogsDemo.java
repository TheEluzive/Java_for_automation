package Objects_Basic;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;



public class DogsDemo {


    //private  static
    private static int amount;
    private static Dogs[] dogs;
    //static Dogs sobaka = new Dogs();


    public static void main(String ... args) {
        Scanner in = new Scanner((System.in));
        System.out.print("Amount dogs = ");
 //fix Character.toLowerCase///////
        //
        //
        amount = in.nextInt();
        dogs = new Dogs[amount];
        for (int i = 0; i < amount; i++) //initialization
            dogs[i] = new Dogs();

        System.out.println("Specify any or none of the values for name, age or size(SMALL, MEDIUM or BIG) ");
        for (int i = 0; i < amount; i++)
            dogs[i].newDogs(i);

        Arrays.sort(dogs);
        System.out.println("\n\nSort by name(ascending)");
        for (int i = 0; i < amount; i++)
            dogs[i].print(i);

        Collections.reverse(Arrays.asList(dogs));
        System.out.println("\n\nSort by name(discending)");
        for (int i = 0; i < amount; i++)
            dogs[i].print(i);

        Dogs dogForSort = new Dogs();
        for (int i = 0; i < amount; i++)
            for (int j = 0; j < amount-1; j++)
            dogs[j].sortByAge(dogs[j+1],dogForSort );

        System.out.println("\n\nSort by age(ascending)");
        for (int i = 0; i < amount; i++)
            dogs[i].print(i);

        Collections.reverse(Arrays.asList(dogs));
        System.out.println("\n\nSort by age(discending)");
        for (int i = 0; i < amount; i++)
            dogs[i].print(i);


        for (int i = 0; i < amount; i++)
            for (int j = 0; j < amount-1; j++)
                dogs[j].sortBySize(dogs[j+1],dogForSort );

        System.out.println("\n\nSort by size(ascending)");
        for (int i = 0; i < amount; i++)
            dogs[i].print(i);

        Collections.reverse(Arrays.asList(dogs));
        System.out.println("\n\nSort by size(discending)");
        for (int i = 0; i < amount; i++)
            dogs[i].print(i);







    }





}
