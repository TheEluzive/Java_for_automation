import java.util.Scanner;

public class Java_Fund_P_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstNumber = in.nextInt(); //read two numbers
        int secondNumber = in.nextInt();


        firstNumber = lowestFromTwo(firstNumber, secondNumber); //return lowest
        System.out.println(firstNumber);


        int thirdNumber = in.nextInt(); //3 number with last lowest
        firstNumber = lowestFromTwo(firstNumber, thirdNumber);
        System.out.println(firstNumber);

        int fourthNumber = in.nextInt(); // 4
        firstNumber=lowestFromTwo(firstNumber, fourthNumber);
        System.out.println(firstNumber);





    }

    public static int lowestFromTwo(int firstNumber, int secondNumber) {

        int lowest=0;
        // if (firstNumber==secondNumber), else ???
        if (firstNumber<secondNumber)
            lowest=firstNumber;
        else lowest=secondNumber;

        return lowest;
    }
}
