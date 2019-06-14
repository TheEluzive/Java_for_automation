package Objects_Basic;
import java.util.Scanner;

public class ClockDemo {
    public static void main(String ... args){
        System.out.print("FirstTime(seconds) = ");
        Scanner in = new Scanner(System.in);
        Clock firstClock = new Clock(in.nextInt());
        for (int i =0; i < 10; i++)
            firstClock.tick();
        System.out.println(firstClock.returnHHMMSS(firstClock));

        System.out.println("\nSecondTime(HH,MM,SS)(from enter) = ");

        Clock secondClock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
        for (int i =0; i < 10; i++)
            secondClock.tick();
        System.out.println(secondClock.returnHHMMSS(secondClock));

        firstClock.addClock(secondClock);

        System.out.print("\n" + firstClock.returnHHMMSS(firstClock) + " + " + secondClock.returnHHMMSS(secondClock) + " = ");
        firstClock.addClock(secondClock);
        System.out.println(firstClock.returnHHMMSS(firstClock));

        System.out.print("\n" + firstClock.returnHHMMSS(firstClock) + " difference with " + secondClock.returnHHMMSS(secondClock) + " = ");
        Clock differentClock = firstClock.substracktClock(secondClock);
        System.out.println(differentClock.returnHHMMSS(differentClock));
    }
}
