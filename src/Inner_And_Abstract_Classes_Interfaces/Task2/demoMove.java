package Inner_And_Abstract_Classes_Interfaces.Task2;

public class demoMove {
    public static void main(String[] args) {
        MovablePoint topLeft = new MovablePoint(0,0, 0,0);
        MovablePoint bottomRight = new MovablePoint(3,3, 0,0);

        MovableRectangle movableRectangle = new MovableRectangle(topLeft, bottomRight);
        movableRectangle.setXSpeed(1);
        movableRectangle.setYspeed(1);

        System.out.println(movableRectangle.toString());



        System.out.println("Down, down!\n");
        movableRectangle.moveDown();
        movableRectangle.moveDown();

        System.out.println(movableRectangle.toString());

        System.out.println("left, left, left!\n");
        movableRectangle.moveLeft();
        movableRectangle.moveLeft();
        movableRectangle.moveLeft();

        System.out.println(movableRectangle.toString());


        movableRectangle.setYspeed(2);

        System.out.println("Up!\n");
        movableRectangle.moveUp();
        System.out.println(movableRectangle.toString());



    }
}
