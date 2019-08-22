package Inner_And_Abstract_Classes_Interfaces.Minesweeper;

import java.util.Scanner;

public class Field implements IField {
    private static int width;
    private static int height;
    private char[][] board;
    private char[][] playerBoard;
    private static final char bomb = 'b';
    private static final char close = '-';
    private static final char nullBombsAround = '0';


    @Override
    public void setBoard(int firstX, int firstY) {


    width = 10;
    height = 10;
    board = new char[height][width];

        for (int i =0; i < height; i++)
            for (int j = 0; j< width; j++)
                board[i][j]=nullBombsAround;

   setBombs(firstX, firstY);

        System.out.println();
        for (int i =0; i < height; i++)
            for (int j = 0; j< width; j++)
                if (board[i][j]!=bomb) board[i][j] = aroundAmountBombs(i,j);

    }

    public char aroundAmountBombs(int y, int x){
        int bombsAround = 0;
        String forReturn ="";

        for (int i =y-1; i<=y+1; i++)
            for (int j=x-1; j <= x+1; j++){

                if(i<=height-1&i>=0&j<=width-1&j>=0) {

                        if (board[i][j] == bomb)
                            bombsAround++;




                }

            }

        forReturn = Integer.toString(bombsAround);
        return forReturn.charAt(0);
    }

    @Override
    public void showPlayerField() {
        for (int i =0; i < height; i++)
            for (int j = 0; j< width; j++)
                playerBoard[i][j]=close;
    }

    @Override
    public void showGameField() {
        for (int i =0; i < height; i++) {
            for (int j = 0; j < width; j++)
                System.out.print(board[i][j]+"\t");
            System.out.println();
        }
    }

    @Override
    public void firstPick() {
        Scanner scanner = new Scanner(System.in);
    System.out.println("Write x and y");
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    setBoard(x,y);
    setBombs(x,y);
    setPlayerField();
    }

    @Override
    public void setBombs(int firstX, int firstY) {
        int amountBombs = 10;
        int randX; int randY;
        int copyAmountBombs = amountBombs;
        while (copyAmountBombs > 0){
            randX = (int)(Math.random()*width);
            randY = (int)(Math.random()*height);
            if (randX!=firstX&&randY!=firstY)
                if (board[randY][randX] != bomb) board[randY][randX] = bomb ;
            copyAmountBombs--;
        }
        showGameField();
    }

    @Override
    public void setPlayerField() {
        playerBoard = new char[height][width];
        System.out.println();
        for (int i =0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (board[i][j] == nullBombsAround) playerBoard[i][j] = nullBombsAround;
                else playerBoard[i][j] = close;
                System.out.print(playerBoard[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i =0; i < height; i++)
            for (int j = 0; j < width; j++)
                if (playerBoard[i][j] == nullBombsAround) openDigitsCloseToNull(i,j);



    }

    public void openDigitsCloseToNull(int x, int y) {
        for (int i = y - 1; i <= y + 1; i++)
            for (int j = x - 1; j <= x + 1; j++) {
                if (i <= height - 1 & i >= 0 & j <= width - 1 & j >= 0) {
                    playerBoard[i][j] = board[i][j];
                    System.out.println("Work!");
                }
            }
    }
}
