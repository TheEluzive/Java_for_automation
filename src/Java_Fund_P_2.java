import java.util.Scanner;

public class Java_Fund_P_2 {
    public static void main(String[] args) {
        int a[];
        Scanner in = new Scanner(System.in);
        System.out.print("Array size = ");
        int n = in.nextInt(); //array size


        a=new int[n];



        double rand=0;
        for (int i=0; i<n; i++) {
            rand= Math.random()*20;
            a[i]=(int)rand;
            System.out.println(a[i]);
        }

        System.out.println("Sorted :");
        bubbleSort(n, a);
        for (int i=0; i<n; i++) {
            System.out.println(a[i]);
        }


        System.out.println("We will search = ");
        int f = in.nextInt();
        long startTime = System.currentTimeMillis(); //from 100000 elements
        findOneByOne(f, n, a); //search
        long finishTime = System.currentTimeMillis();
        System.out.println("execution time = " + (finishTime-startTime));

        startTime = System.currentTimeMillis();
        binarySearch(f, n, a); //binarySearch
        finishTime = System.currentTimeMillis();
        System.out.println("execution time = " + (finishTime-startTime));



    }

    public static void findOneByOne(int f, int n, int[] a){

        boolean result=false;
        for (int i=0; i<n; i++){
            if (a[i] == f) {
                result = true;
            }

        }
        System.out.println("Result of search one by one is :");
        if (result==true) System.out.println("true");
        else System.out.println("false");
    }

    public static void bubbleSort(int n, int[] a){
        for (int i=0; i<n; i++)
        for (int j=0; j<n-1; j++)
        {
            if (a[j]>a[j+1]){
               int first=a[j];
               a[j]=a[j+1];
               a[j+1]=first;
            }
        }
    }

    public static void binarySearch(int f, int n, int[] a){// Запускаем бинарный поиск
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
        if (a[right]==f) System.out.println("true");
        else System.out.println("false");

    }


}

