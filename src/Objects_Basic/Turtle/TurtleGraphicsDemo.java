package Objects_Basic.Turtle;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TurtleGraphicsDemo {
    private static String dir;
    private static String c;
    public static void main(String[] args) {
        TurtleGraphics turtleGraphics = new TurtleGraphics(15,10);
       turtleGraphics.setBoard();
       turtleGraphics.showField();
        Scanner in = new Scanner(System.in);

        System.out.println("Input direction(D/U/L/R) and distance(integer number), clear board(C)");
        while (true){
            dir =in.next();
            c = in.next();

            if ((c.chars().allMatch( Character::isDigit ) )&(dir.equals("U") | dir.equals("D") | dir.equals("L") | dir.equals("R")|dir.equals("C")))
                turtleGraphics.movePen(dir, Integer.parseInt(c)); else System.out.println("Incorrect input, try again!");
            turtleGraphics.showField();
        }


    }
}
