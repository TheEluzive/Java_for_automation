import java.util.Scanner;

public class Java_Fund_P_5 {
    public static void main(String[] args) {
        System.out.print("Count = ");
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        move('A', 'C', 'B', count);
    }

    public static void move(char a, char c, char b, int count) {

        if (count==1){
            System.out.println(String.format(a + " -> " + c));
        }else {
            move(a, b, c, count - 1);
            System.out.println(String.format(a + " -> " + c));
            move(b,c,a,count-1);
        }

    }
}
