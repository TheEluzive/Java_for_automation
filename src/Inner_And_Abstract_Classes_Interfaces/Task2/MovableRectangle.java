package Inner_And_Abstract_Classes_Interfaces.Task2;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bootomRight;

    @Override
    public String toString() {
        return "MovableRectangle\n{\n" +
                "topLeft=" + topLeft +
                "bootomRight=" + bootomRight +
                "}\n";
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bootomRight.moveUp();

    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bootomRight.moveDown();

    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bootomRight.moveLeft();

    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bootomRight.moveRight();

    }

    public MovablePoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MovablePoint topLeft) {
        this.topLeft = topLeft;
    }

    public MovablePoint getBootomRight() {
        return bootomRight;
    }

    public void setBootomRight(MovablePoint bootomRight) {
        this.bootomRight = bootomRight;
    }

    public void getXSpeed(){
        topLeft.getxSpeed();
    }

    public void getYspeed(){
        topLeft.getySpeed();
    }

    public void setXSpeed(int x){
        topLeft.setxSpeed(x);
        bootomRight.setxSpeed(x);
    }

    public void setYspeed(int x){
        topLeft.setySpeed(x);
        bootomRight.setxSpeed(x);
    }

    public MovableRectangle(MovablePoint topLeft, MovablePoint bootomRight) {
        this.topLeft = topLeft;
        this.bootomRight = bootomRight;
    }
}
