package Inner_And_Abstract_Classes_Interfaces.Task2;

public class demoMove {
    public static void main(String[] args) {
        MovablePoint topLeft = new MovablePoint(0,0, 1,1);
        MovablePoint bottomRight = new MovablePoint(3,3, 1,1);

        MovableRectangle movableRectangle = new MovableRectangle(topLeft, bottomRight);
        movableRectangle.setXSpeed(1);
       // movableRectangle.setYspeed(1);

        System.out.println(movableRectangle.toString());



        System.out.println("Down, down!");
        movableRectangle.moveDown();
        movableRectangle.moveDown();


        System.out.println(movableRectangle.toString());


    }
}
