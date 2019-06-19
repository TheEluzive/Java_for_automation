package Inheritance_and_Polymorphism.Task3;

import java.lang.reflect.Array;

public class MathUtil {



    public static int min(int[] array){

        int minimum = array[0];
        for (int value : array) if (value < minimum) minimum = value;
        return minimum;
    }

    public static double min(double[] array){

        double minimum = array[0];
        for (double v : array) if (v < minimum) minimum = v;
        return minimum;
    }

    public static int max(int[] array){

        int maximum = 0;
        for (int value : array) if (value > maximum) maximum = value;
        return maximum;
    }

    public static double max(double[] array){

        double maximum = 0;
        for (double value : array) if (value > maximum) maximum = value;
        return maximum;
    }

    public static int nextAfter(int[] array, int number){
        for (int value : array) {
            if (value > number) return value;
        }
        return 0;
    }

    public static double nextAfter(double[] array, double number){
        for (double value : array) {
            if (value > number) return value;
        }
        return 0;
    }

    public static double pow(int number, int power){
        int powResult=1;

        if (power < 0) return 1 / pow(number, -1 * power);

        for (int i = 0; i < power; i++)
            powResult = powResult * number;
        return powResult;
    }

}
