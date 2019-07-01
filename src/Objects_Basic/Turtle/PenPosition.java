package Objects_Basic.Turtle;

public class PenPosition {
    private static int x;
    private static int y;

    public static int getX() {
        return x;
    }

    public static void setX(int x) {
        PenPosition.x = x;
    }

    public static int getY() {
        return y;
    }

    public static void setY(int y) {
        PenPosition.y = y;
    }

    public PenPosition(int x1, int y1) {
        x=x1;
        y=y1;

    }
}
