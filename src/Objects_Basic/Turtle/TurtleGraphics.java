package Objects_Basic.Turtle;

public class TurtleGraphics {
    private int[][] board;
    private final static char cellChar = '.';
    private final static char coloredCellChar = 'o';
    private final static char penChar = 'o';

    public TurtleGraphics(int x, int y) {
        this.board = new int[x][y];
    }

    public enum Direction{
        UP,
        DOWN,
        RIGHT,
        LEFT,
    }


    public void movePen(char dir, int lenght){

    }

    public void movePenUp(int lenght){

    }
    public void movePenDown(int lenght){

    }
    public void movePenleft(int lenght){

    }
    public void movePenRight(int lenght){

    }
    public void clearBoard(){

    }
}
