package Objects_Basic;

import java.util.Scanner;

public class Dogs {
    private String name;
    protected enum size{SMALL, BIG, MEDIUM};
    protected int age;

    Dogs(){
        this.name = "";
        this.age = -1;
        size sizeE;
    }




    private char check;
    private char[] masChar;
    private  String input="";
    private int usedAge;
    private int usedEnum;
    protected boolean newDogs(int i){

        Scanner in = new Scanner((System.in));
        System.out.print("Dog " + (i+1) + "=");
        input = in.nextLine();

        size sizeE = null;



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
           // System.out.print(words[j]);
           // System.out.println(" " + isNumber(words[j]));
            if (isNumber(words[j])) { //first number in string == age
                age = Integer.parseInt(words[j]);
                usedAge = j;
                break;
            }
        }

        for (int j = 0; j < number; j++) {
            //System.out.print(words[j]+" ");
            if (words[j].equalsIgnoreCase("small")) {
                //-----------------
                sizeE = size.SMALL;
                //----------------------
                usedEnum = j;
                break;
            }
            if (words[j].equalsIgnoreCase("medium")) {
                //-----------------
                sizeE = size.MEDIUM;
                //----------------------
                usedEnum = j;
                break;
            }
            if (words[j].equalsIgnoreCase("big")) {
                //-----------------
                sizeE = size.BIG;
                //----------------------
                usedEnum = j;
                break;
            }
        }

        for (int j=0; j <= number; j++) //all not used words go to name
            if (j!=usedAge&j!=usedEnum)
                name = name + words[j]+" ";  //can be hard name like "DogKing Artur Younger Third"




        System.out.println("Dog " + (i+1) + ":" );
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Size:" + sizeE);



        System.out.println("All right(Y/N)?");
        check =  in.next().charAt(0);
        boolean result = check == 'Y' || check == 'y';
        //System.out.println(result);

        return result;

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



}