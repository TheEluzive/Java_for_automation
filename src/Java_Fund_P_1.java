import java.util.Scanner;

public class Java_Fund_P_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int firstNumber = in.nextInt(); //read  numbers
        int secondNumber = in.nextInt();
        int thirdNumber = in.nextInt();
        int fourthNumber = in.nextInt(); // 4

        System.out.println("Two numbers : " + firstNumber + " " + secondNumber + "\n"+"lowest is " + lowestFromTwo(firstNumber, secondNumber));
        System.out.println("Three numbers : " + firstNumber + " " + secondNumber + " " + thirdNumber + "\n"+"lowest is " + lowestFromThree(firstNumber, secondNumber, thirdNumber));
        System.out.println("Four numbers : " + firstNumber + " " + secondNumber + " " + thirdNumber + fourthNumber +"\n"+"lowest is " + lowestFromFour(firstNumber, secondNumber, thirdNumber, fourthNumber));



    }

    public static int lowestFromTwo(int firstNumber, int secondNumber) {

        int lowest=0;
        // if (firstNumber==secondNumber), else ???
        lowest = (firstNumber < secondNumber) ? firstNumber : secondNumber;

        return lowest;
    }

    public static int lowestFromThree(int firstNumber, int secondNumber, int thirdNumber) {

        int lowest=lowestFromTwo(firstNumber, secondNumber);
        lowest = (lowest < thirdNumber) ? lowest : thirdNumber;

        return lowest;
    }

    public static int lowestFromFour(int firstNumber, int secondNumber, int thirdNumber, , int fourthNumber) {

        int lowest = lowestFromThree(firstNumber, secondNumber, thirdNumber);
        lowest = (lowest <fourthNumber) ? lowest : fourthNumber;

        return lowest;
    }
}
