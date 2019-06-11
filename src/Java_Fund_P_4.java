import java.util.Scanner;

public class Java_Fund_P_4 {
    public static void main(String[] args) {
    String text = "We doesn`t write hello world!";
    char[] masChar = text.toCharArray();
    System.out.println(text);
    System.out.print("Char = ");

    Scanner in = new Scanner(System.in);
    char findChar = (char) in.next().charAt(0);;

    int amount=0;
    for (int i=0; i < masChar.length; i++){
        if (masChar[i] == findChar){
            amount++;
        }
    }

    System.out.print("Amount = " + amount);
    }
}
