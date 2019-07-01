package Objects_Basic.Turtle;

public class TurtleGraphics {
    private char[][] board;
    private final static char cellChar = '.';
    private final static char coloredCellChar = 'o';
    private final static char penChar = 'x';
    private int lengthX;
    private int heightY;

    public void setBoard() {
        for (int i =0; i< getHeightY(); i++){
            for(int j = 0; j < getLengthX(); j++)
                board[i][j]=cellChar;
        }
        board[0][0]=coloredCellChar;
        PenPosition.setX(0);
        PenPosition.setY(0);
    }


    public int getLengthX() {
        return lengthX;
    }



    public int getHeightY() {
        return heightY;
    }



    public TurtleGraphics(int x, int y) {
        this.board = new char[y][x];
        this.lengthX=x;
        this.heightY=y;
    }

    private enum Direction {
        DOWN,
        LEFT,
        NULL,
        RIGHT,
        UP

    }


    public void movePen(String s, int dist){
        Direction direction;

        switch (s){
            case "U":
                direction = Direction.UP;
                break;
            case "D":
                direction = Direction.DOWN;
                break;
            case "L":
                direction = Direction.LEFT;
                break;
            case "R":
               direction = Direction.RIGHT;
                break;
            case "C":
                direction = Direction.NULL;
                clearBoard();
                break;
            default: direction = Direction.NULL; break;

        }


        switch (direction){
            case UP:
                movePenUp(dist);
                break;
            case DOWN:
                movePenDown(dist);
                break;
            case LEFT:
                movePenLeft(dist);
                break;
            case RIGHT:
                movePenRight(dist);
                break;

            default: clearBoard();break;

        }
    }


    public void movePenUp(int length){
        board[PenPosition.getY()][PenPosition.getX()] = coloredCellChar;
        for (int i =0; i < length; i++)
            if (PenPosition.getY() > 0 & PenPosition.getY() < getHeightY()) {
                PenPosition.setY(PenPosition.getY() - 1);
                board[PenPosition.getY()][PenPosition.getX()] = coloredCellChar;
            } else break;
        board[PenPosition.getY()][PenPosition.getX()] = penChar;
    }
    public void movePenDown(int length){
        board[PenPosition.getY()][PenPosition.getX()] = coloredCellChar;
        for (int i =0; i < length; i++)
            if (PenPosition.getY() < getHeightY() -1) {
                PenPosition.setY(PenPosition.getY() + 1);
                board[PenPosition.getY()][PenPosition.getX()] = coloredCellChar;
            } else break;
        board[PenPosition.getY()][PenPosition.getX()] = penChar;
    }
    public void movePenLeft(int length){
        board[PenPosition.getY()][PenPosition.getX()] = coloredCellChar;
        for (int i =0; i < length; i++)
            if (PenPosition.getX() > 0 & PenPosition.getX() < getLengthX()) {
                PenPosition.setX(PenPosition.getX() - 1);
                board[PenPosition.getY()][PenPosition.getX()] = coloredCellChar;
            } else break;
        board[PenPosition.getY()][PenPosition.getX()] = penChar;
    }
    public void movePenRight(int length){
        board[PenPosition.getY()][PenPosition.getX()] = coloredCellChar;
        for (int i =0; i < length; i++)
            if ( PenPosition.getX() < getLengthX()-1) {
                PenPosition.setX(PenPosition.getX() + 1);
                board[PenPosition.getY()][PenPosition.getX()] = coloredCellChar;
            } else break;
        board[PenPosition.getY()][PenPosition.getX()] = penChar;
    }
    public void clearBoard(){
        for (int i =0; i< getHeightY(); i++)
            for(int j = 0; j < getLengthX(); j++)
                board[i][j]=cellChar;
        board[PenPosition.getY()][PenPosition.getX()] = penChar;
    }

    public void showField(){
        for (int i =0; i< heightY; i++){
            for(int j = 0; j<lengthX; j++)
                System.out.print(board[i][j] + "\t");
            System.out.println();
        }
    }



}
