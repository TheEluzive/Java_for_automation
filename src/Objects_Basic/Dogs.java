package Objects_Basic;

import java.util.Scanner;

public class Dogs {
    private String name;
    private enum size{SMALL, BIG, MEDIUM};
    private int age;

    Dogs(){
        this.name = "";
        this.age = 0;
        size sizeE = size.SMALL;
    }



    private char check;
    private char[] masChar;
    private  String input="";

    protected boolean newDogs(int i){

       /* Scanner in = new Scanner((System.in));
        System.out.print("Dog " + (i+1) + "=");
        input = in.nextLine();




        int wordsAmount = 20;
        String[] words = new String[wordsAmount]; //size??
        for (int j = 0; j < wordsAmount; j ++)
            words[j] = "";

        int number= 0;
        masChar = input.toCharArray();
        for (int j = 0; j < masChar.length; j++){
            if (masChar[j] != ' '){
                words[number] += masChar[j];

            }
            else number++;
        }
        number++;

        //now all words about dog in strings "words"

        for (int j = 0; j < number; j++) {
            System.out.print(words[j]);
            System.out.println(" " + isNumber(words[j]));
            if (isNumber(words[j])) { //first number in string == age
                age = Integer.parseInt(words[j]);
                break;
            }
        }

        for (int j = 0; j < number; j++) {
            System.out.print(words[j]);
            System.out.println(" " + isEnum(words[j]));
        }



        System.out.println("Dog " + (i+1) + "=" + input);



        System.out.println("All right(Y/N)?");
        check =  in.next().charAt(0);
        boolean result = check == 'Y' || check == 'y';
        System.out.println(result);

*return result;*/
        return true;
    }

    private char [] masCharIsWord;
    public  boolean isNumber(String string){
        masCharIsWord = string.toCharArray();
        boolean result = true;
        for (int i=0; i<masCharIsWord.length; i++)
            if (Character.isDigit(masCharIsWord[i])==false) {
                result = false;
                break;
            }
        return result;
    }

    public boolean isEnum(String string) {

       if (string == "SMALL"|string == "MEDIUM"|string == "BIG")
             return true;
       else return  false;
    }

}