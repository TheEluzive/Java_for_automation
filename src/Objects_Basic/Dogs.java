package Objects_Basic;

import java.util.Scanner;

public class Dogs implements Comparable <Dogs> {
    private String name;
    private String size;
    protected int age;
    private enum sizeE{SMALL,
        MEDIUM,
        BIG;
        protected String ToString(){
            return name();
        }
    }



    Dogs(){
        this.name = "";
        this.age = -1;
        this.size = null;


    }

    public int compareTo(Dogs o) {
        int result = this.name.compareToIgnoreCase(o.name);
        if (result == 0) result = this.size.compareTo((o.size));
        return result;
    }


    private char check;
    private char[] masChar;
    private  String input="";
    private int usedAge=-1;
    private int usedEnum=-1;
    private double randNum;
    private int number= 0;
    private int wordsAmount = 20;
    private String[] words = new String[wordsAmount]; //size??

    protected void newDogs(int i){

        Scanner in = new Scanner((System.in));
        System.out.print("Dog " + (i+1) + "=");
        input = in.nextLine();



        fromStringToWords();        //now all words about dog in strings "words"


        searchAge();
        searchSize();
        searchName();



        if (name.isEmpty()|name.equalsIgnoreCase(" ")){
            setRandomName();
            System.out.println("YEEEEEEEEEEEEEEEEEEEEEEES");
        }

        if (age == -1) { // if age in undefinied create random
            setRandomAge();
        }

        if (size == null) { // if size in undefinied create random
            setRandomSize();
        }

        print(i);



    }

    private char[] masCharIsWord;
    private  boolean isNumber(String string){
        masCharIsWord = string.toCharArray();
        boolean result = true;
        for (int i=0; i<masCharIsWord.length; i++)
            if (!Character.isDigit(masCharIsWord[i])) {
                result = false;
                break;
            }
        return result;
    }
    private int randSize;
    private void setRandomSize(){
        randNum = Math.random() * 3;
        randSize = (int) randNum;
        switch (randSize) {
            case 0:
                size = sizeE.SMALL.ToString();
                break;
            case 1:
                size = sizeE.MEDIUM.ToString();
                break;
            case 2:
                size = sizeE.BIG.ToString();
                break;
            default:
                break;

        }

    }
    private void setRandomAge(){
        randNum= Math.random()*20+1;
        age=(int) randNum;
    }

    private void setRandomName(){
        String[] names = {"Tom", "Sharik", "Brain", "Muhtar", "Jack"}; //names for auto-generate;
        //System.out.println("name is undefinied");
        randNum=Math.random()*names.length;
        name = names[(int)randNum];
    }

    private void searchAge(){
        for (int j = 0; j < number; j++) { //search age
            if (isNumber(words[j])) { //first number in string == age
                if (Integer.parseInt(words[j]) > 0& Integer.parseInt(words[j])<=20) { //if it from 1 to 20
                    age = Integer.parseInt(words[j]);
                    usedAge = j;
                    break;
                }
            }
        }
    }

    private void searchSize(){
        for (int j = 0; j < number; j++) { //search size
            //System.out.print(words[j]+" ");
            if (words[j].equalsIgnoreCase("small")) {
                size = sizeE.SMALL.ToString();
                usedEnum = j;
                break;
            }
            if (words[j].equalsIgnoreCase("medium")) {
                size = sizeE.MEDIUM.ToString();
                usedEnum = j;
                break;
            }
            if (words[j].equalsIgnoreCase("big")) {
                size = sizeE.BIG.ToString();
                usedEnum = j;
                break;
            }
        }

    }


    private void searchName(){
        for (int j=0; j <= number; j++) //all not used words go to name
            if (j!=usedAge&j!=usedEnum) {

                //String whynot=words[j].charAt(0) + words[j].substring(1).toLowerCase();
                //words[j] = words[j].charAt(0) + words[j].substring(1).toLowerCase();
                // why not worked??? String index out of range: -1
                //words[j] = whynot;
                ///whyyyyyyyyyyyyyyyyyy

                name = name + words[j] + " ";  //can be hard name like "Dog`s King Artur Younger Third"
            }

    }

    protected void print(int i){
        System.out.println("========");
        System.out.println("Dog " + (i+1) + ":" );
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Size: " + size);
        System.out.println("========");
    }

    private int firstChar=0;
    private void fromStringToWords(){
        for (int j = 0; j < wordsAmount; j ++)
            words[j] = "";


        masChar = input.toCharArray();
        for (int j = 0; j < masChar.length; j++){
            if (masChar[j] != ' '){
                words[number] += masChar[j];

            }
            else number++;
        }
        number++;

    }

    protected void sortByAge(Dogs dogs, Dogs dogForSort){ //ascending
        if (this.age>dogs.age){  //if == ??????
            dogForSort.age = this.age;
            dogForSort.size = this.size;
            dogForSort.name = this.name;
            this.age = dogs.age;
            this.size = dogs.size;
            this.name = dogs.name;
            dogs.age = dogForSort.age;
            dogs.size = dogForSort.size;
            dogs.name = dogForSort.name;

        }
    }

    protected void sortBySize(Dogs dogs, Dogs dogForSort) { //ascending

        if (sizeE.valueOf(this.size).ordinal() > sizeE.valueOf(dogs.size).ordinal()){   //if == ??????
            dogForSort.age = this.age;
            dogForSort.size = this.size;
            dogForSort.name = this.name;
            this.age = dogs.age;
            this.size = dogs.size;
            this.name = dogs.name;
            dogs.age = dogForSort.age;
            dogs.size = dogForSort.size;
            dogs.name = dogForSort.name;

        }
    }





}