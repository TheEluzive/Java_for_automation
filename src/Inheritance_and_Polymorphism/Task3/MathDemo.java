package Inheritance_and_Polymorphism.Task3;

public class MathDemo {
    public static void main (String[] args){

        int[] arrayInt = new int[10];

        System.out.println("Integer: ");
        for (int i =0; i < arrayInt.length; i++){
            arrayInt[i] = (int) (Math.random()*10);
            System.out.println("A["+i+"] = " + arrayInt[i]);
        }

        System.out.println("Minimum: " + MathUtil.min(arrayInt));
        System.out.println("Maximum: " + MathUtil.max(arrayInt));

        int numberInt = 5;
        String string = (MathUtil.nextAfter(arrayInt, numberInt) != 0) ? "Was found number greater that" +  numberInt
                : "Was`n found number greater that" + numberInt;
        System.out.println(string);




        double[] arrayDouble= new double[10];

        System.out.println("\nDouble: ");
        for (int i =0; i < arrayDouble.length; i++){
            arrayDouble[i] =  Math.random()*10;
            System.out.printf("A[%d] = %f \n",i, arrayDouble[i]);
        }

        System.out.printf("Minimum: %f \n", MathUtil.min(arrayDouble));
        System.out.printf("Maximum: %f \n",  MathUtil.max(arrayDouble));
        double numberDouble= 2;
        string = (MathUtil.nextAfter(arrayDouble, numberDouble) != 0) ? "Was found number greater that " +  numberInt
                : "Was`n found number greater that " + numberInt;
        System.out.println(string);

        System.out.println();
        System.out.println("2^10 = " + MathUtil.pow(2, 10 ));
        System.out.println("2^(-3) = " +MathUtil.pow(2, -3 ));
        System.out.println("1^(-3) = " +MathUtil.pow(1, -3 ));
        System.out.println("10^1 = " +MathUtil.pow(10, 1 ));
    }
}
