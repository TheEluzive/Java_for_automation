package Inheritance_and_Polymorphism.Task3;

import java.lang.reflect.Array;

public class MathUtil {

    public static final double PI = 3.14;

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

    public static double pow(double number, double power){
        double powResult=1;

        if (power < 0) return 1 / pow(number, -1 * power);


        for (int i = 0; i < power; i++)
            powResult = powResult * number;
        return powResult;
    }

    public static double radical(double number, double pow){ //

        double x1 = 2;
        double factor = 1;
        double savePow = pow;
        while(pow > 1){
           factor = factor / 2;
           pow--;
        }

        System.out.println(factor);



        double x2 = factor*(x1+number/x1);

        for (int i =0; i < 50; i++){
            x2 = factor*(x2+number/x2);
            System.out.println(x2);
            //if (savePow(number, savePow) ==) break;
        }

    return x2;
    }

}
