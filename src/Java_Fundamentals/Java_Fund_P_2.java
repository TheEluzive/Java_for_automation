package Java_Fundamentals;

import java.util.Scanner;

public class Java_Fund_P_2 {
    public static void main(String[] args) {
        int[] a;
        Scanner in = new Scanner(System.in);
        System.out.print("Array size = ");
        int n = in.nextInt(); //array size

        a=new int[n];

        double rand;
        for (int i=0; i < a.length; i++) {
            rand= Math.random()*20;
            a[i]=(int)rand;
            System.out.println(a[i]);
        }

        System.out.println("\nSorted :");
        bubbleSort(a);
        for (int i=0; i < n; i++) {
            System.out.println(a[i]);
        }


        System.out.print("\nWe will search = ");
        int f = in.nextInt();

        long startTime = System.currentTimeMillis(); //from 100000 elements
        findOneByOne(f, a); //search
        long finishTime = System.currentTimeMillis();
        System.out.println("execution time = " + (finishTime-startTime)+"\n");

        startTime = System.currentTimeMillis();
        binarySearch(f, a); //binarySearch
        finishTime = System.currentTimeMillis();
        System.out.println("execution time = " + (finishTime-startTime)+"\n");



    }

    private static void findOneByOne(int f, int[] a){

        boolean result=false;
        for (int i = 0; i < a.length; i++){
            if (a[i] == f) {
                result = true;
            }

        }
        System.out.println("\nResult of search one by one is :");
        System.out.println(result);
    }

    private static void bubbleSort(int[] a){
        int first;
        for (int i = 0; i < a.length; i++)
        for (int j = 0; j < a.length-1; j++)
        {
            if (a[j] > a[j+1]){
               first = a[j];
               a[j] = a[j+1];
               a[j+1] = first;
            }
        }
    }

    private static void binarySearch(int f, int[] a){// Запускаем бинарный поиск
        int left = -1;                      // l, r — borders
        int right = a.length;
        while (left < right - 1) {
            int middle = (left + right) / 2;
            if (a[middle] < f)
            left = middle;
        else
            right = middle;
        }
        System.out.println("Result of binary search one by one is :");
        boolean result = a[right] == f;
        System.out.println(result);

    }


}

