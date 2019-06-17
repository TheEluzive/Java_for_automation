package Java_Fundamentals;

import java.util.Scanner;

public class Java_Fund_P_3 {
    public static void main(String[] args) {
        int[] a;
        Scanner in = new Scanner(System.in);
        System.out.print("Array size = ");
        int n = in.nextInt(); //array size
        a = new int[n];

        double rand;
        for (int i = 0; i < n; i++) {
            rand = Math.random() * 20;
            a[i] = (int) rand;
            System.out.println(a[i]);
        }


        System.out.println("Number of algorithm(1,2,3,4) : ");
        int choose = in.nextInt();

        switch (choose) {
            case 1:
                bubbleSort(a);
                break;
            case 2:
                optimizedBubbleSort(a);
                break;
            case 3:
                insertionSort(a);
                break;
            case 4:
                selectionSort(a);
                break;
            default:
                break;


        }
        System.out.println("\nAgain.\n");

        main(args);

    }

    private static void printA(int[] a){
        System.out.println("Sorted :");
        for (int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static void bubbleSort(int[] a){
        System.out.println("U chose : bubbleSort  ");
        for (int i=0; i<a.length; i++)
            for (int j=0; j<a.length-1; j++)
            {
                if (a[j]>a[j+1]){
                    int first=a[j];
                    a[j]=a[j+1];
                    a[j+1]=first;
                }
            }
        printA(a);
    }

    private static void optimizedBubbleSort(int[] a){
        System.out.println("U chose : optimizedBubbleSort  ");
        int f=1; // if sorted then =0
        for (int i=0; i<a.length; i++) {
            f = 0;
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int first = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = first;
                    f = 1;
                }
                if (a[j] == a[j + 1]) f=1;
            }
            if (f==0) {System.out.println("was sorted before all iteration!"); break;}
        }
        printA(a);
    }

    private static void insertionSort(int[] a)  {
        System.out.println("U chose : insertionSort  ");
        int i, key, j;
        for (i = 1; i < a.length; i++)
        {
            key = a[i];
            j = i - 1;
            while (j >= 0 && a[j] > key)
            {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }
        printA(a);
    }

    private static void selectionSort(int[] a) {
        System.out.println("U chose : selectionSort  ");
        for (int min = 0; min < a.length - 1; min++) {
            int least = min;
            for (int j = min + 1; j < a.length; j++) {
                if (a[j] < a[least]) {
                    least = j;
                }
            }
            int tmp = a[min];
            a[min] = a[least];
            a[least] = tmp;
        }
        printA(a);
    }


}
