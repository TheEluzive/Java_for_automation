package Objects_Basic;

import java.util.Scanner;



public class DogsDemo {

    private static int i = 0;
    private static String input;
    private static String amountS = "";
    private static int amount = 0;

    public static void main(String ... args){
        Scanner in = new Scanner((System.in));
        input  = in.nextLine();
        char[] masChar = input.toCharArray();



        while (masChar[i] != ' '){
            amountS = amountS +  masChar[i];
            i++;
        }
        amount = Integer.parseInt(amountS);
        System.out.println(amount);
        Dogs[] dogs = new Dogs[amount];

        String first="";
        String second="";
        String third="";


        while (masChar[i] != ' ' || masChar[i] !='\n'){
            first = first +  masChar[i];
            i++;
        }
        while (masChar[i] != ' ' || masChar[i] !='\n'){
            first = first +  masChar[i];
            i++;
        }
        while (masChar[i] != ' ' || masChar[i] !='\n'){
            first = first +  masChar[i];
            i++;
        }

    }
}
