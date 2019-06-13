import java.util.Scanner;

public class Java_Fund_P_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numbers = new int[4];
        System.out.print("First number = ");
        numbers[0] = in.nextInt(); //read  numbers
        System.out.print("Second number = ");
        numbers[1] = in.nextInt();
        System.out.print("Third number = ");
        numbers[2] = in.nextInt();
        System.out.print("Fourth number = ");
        numbers[3] = in.nextInt();
        System.out.println();

        System.out.println("Two numbers : " + numbers[0] + " " + numbers[1] + "\n"+"lowest is " + lowestFromTwo(numbers[0], numbers[1]));
        System.out.println("Three numbers : " + numbers[0] + " " + numbers[1] + " " + numbers[2] + "\n"+"lowest is " + lowestFromThree(numbers[0], numbers[1], numbers[2]));
        System.out.println("Four numbers : " + numbers[0] + " " + numbers[1] + " " + numbers[2] + " " + numbers[3] +"\n"+"lowest is " + lowestFromFour(numbers[0], numbers[1], numbers[2], numbers[3]));



    }

    private static int lowestFromTwo(int ... numbers) {

        int lowest=0;
        // if (numbers[0]==numbers[1]), else ???
        lowest = (numbers[0] < numbers[1]) ? numbers[0] : numbers[1];

        return lowest;
    }

    private static int lowestFromThree(int ... numbers) {

        int lowest=lowestFromTwo(numbers[0], numbers[1]);
        lowest = (lowest < numbers[2]) ? lowest : numbers[2];

        return lowest;
    }


    private static int lowestFromFour(int ... numbers) {

        int lowest = lowestFromThree(numbers[0], numbers[1], numbers[2]);
        lowest = (lowest <numbers[3]) ? lowest : numbers[3];

        return lowest;
    }
}
