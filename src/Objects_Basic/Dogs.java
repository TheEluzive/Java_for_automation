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
    private int usedAge=-1;
    private int usedEnum=-1;
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


        //
        //
        //
        //now all words about dog in strings "words"
        //
        //
        //




        for (int j = 0; j < number; j++) {
            if (isNumber(words[j])) { //first number in string == age
                if (Integer.parseInt(words[j]) > 0& Integer.parseInt(words[j])<=20) { //if it from 1 to 20
                    age = Integer.parseInt(words[j]);
                    usedAge = j;
                    break;
                }
            }
        }

        for (int j = 0; j < number; j++) { //search size
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
                name = name + words[j]+" ";  //can be hard name like "Dog`s King Artur Younger Third"

        String[] names = {"Tom", "Sharik", "Brain", "Muhtar"}; //names for auto-generate;
        double randNum;


        if (name.isEmpty()|name.equalsIgnoreCase(" ")){
            //System.out.println("name is undefinied");
            randNum=Math.random()*names.length;
            name = names[(int)randNum];
        }

        if (age == -1) { // if age in undefinied create random
            randNum= Math.random()*20+1;
            age=(int) randNum;
        }

        if (sizeE == null) { // if size in undefinied create random


            randNum = Math.random() * 3;
            int randSize = (int) randNum;
            switch (randSize) {
                case 0:
                    sizeE = size.SMALL;
                    break;
                case 1:
                    sizeE = size.MEDIUM;
                    break;
                case 2:
                    sizeE = size.BIG;
                    break;
                default:
                    break;

            }
        }





        System.out.println("========");
        System.out.println("Dog " + (i+1) + ":" );
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Size: " + sizeE);
        System.out.println("========");





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



}