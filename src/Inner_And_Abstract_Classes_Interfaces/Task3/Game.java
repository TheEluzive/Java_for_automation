package Inner_And_Abstract_Classes_Interfaces.Task3;

import java.util.Scanner;

public class Game {
    public static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        System.out.println("Welcome in Minesweeper!\n Set parameters or use default(S\\D)?");
        menu();
        newGame();
    }

    public static void menu(){
        String choose = in.nextLine();
        switch (choose){
            case "S":
                setByHand();
                break;
            case "D":
                setDefault();
                break;
            default:
                break;

        }
    }

    public static void newGame(){
        Field field = new Field();
        field.setField();
        field.firstChoose(in.nextInt(),in.nextInt());

        pick(field,1,2);
        tryAgain();
    }

    public static void setDefault(){
        Field.setWidth(5);
        Field.setHeight(5);
        Field.setAmountBombs(10);
    }

    public static void setByHand(){
        System.out.print("height = ");
        Field.setHeight(in.nextInt());
        System.out.print("width  = ");
        Field.setWidth(in.nextInt());
        System.out.print("Bombs = ");
        Field.setAmountBombs(in.nextInt());
    }

    public static void pick(Field field, int y, int x){
        int yPick=y; int xPick=x; int dataBeforeChecking = 0;
        int result = field.openCell(yPick,xPick);
        while (result == 1){
            field.showPlayersField();
            dataBeforeChecking = in.nextInt();
            if (dataBeforeChecking >= 0&dataBeforeChecking<field.getHeight()) {
                yPick = dataBeforeChecking;
                result = field.openCell(yPick,xPick);;
            }
                else pick(field, y, x);
            dataBeforeChecking = in.nextInt();
            if (dataBeforeChecking >= 0&dataBeforeChecking< Field.getWidth()){
            xPick=dataBeforeChecking;
            result = field.openCell(yPick,xPick);;
            }
                else pick(field, y, x);

        }
        if (result==0) {
            System.out.println("Loose!");
            tryAgain();
        }
        if (result==2){
            System.out.println("Win!");
            tryAgain();
        }


    }

    public static void tryAgain(){
        System.out.println("Try again?(Y,N)?");

        String choose = in.nextLine();
        switch (choose){
            case "Y":
                newGame();
                break;

            default:
                break;

        }
    }


}
