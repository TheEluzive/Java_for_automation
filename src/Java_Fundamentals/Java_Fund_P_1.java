package Java_Fundamentals;

import java.util.Scanner;

public class Java_Fund_P_1 {
    private static int[] numbers = new int[4];
    private static int lowestNumber;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("First number = ");
        numbers[0] = in.nextInt(); //read  numbers
        System.out.print("Second number = ");
        numbers[1] = in.nextInt();
        System.out.print("Third number = ");
        numbers[2] = in.nextInt();
        System.out.print("Fourth number = ");
        numbers[3] = in.nextInt();
        System.out.println();

        System.out.println("Two numbers : " + numbers[0] + " " + numbers[1] +
                "\n"+"lowest is " + lowest(numbers[0], numbers[1]) + "\n");
        System.out.println("Three numbers : " + numbers[0] + " " + numbers[1] + " " + numbers[2] + "\n"+"lowest is " + lowest(numbers[0], numbers[1], numbers[2])+ "\n");
        System.out.println("Four numbers : " + numbers[0] + " " + numbers[1] + " " + numbers[2] + " " + numbers[3] +"\n"+"lowest is " + lowest(numbers[0], numbers[1], numbers[2], numbers[3])+ "\n");

    }


    private static int lowest(int first, int second) {
        // if (numbers[0]==numbers[1]), else ???
        lowestNumber = (first < second) ? first : second;
        return lowestNumber;
    }

    private static int lowest(int first, int second, int third) {
        lowestNumber=lowest(first, second);
        lowestNumber = (lowestNumber < third) ? lowestNumber : third;
        return lowestNumber;
    }

    private static int lowest(int first, int second, int third, int fourth) {
        lowestNumber = lowest(first, second,  third);
        lowestNumber = (lowestNumber < fourth) ? lowestNumber : fourth;
        return lowestNumber;
    }
}