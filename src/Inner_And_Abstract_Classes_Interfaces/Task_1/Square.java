package Inner_And_Abstract_Classes_Interfaces.Task_1;

public class Square extends Rectangle {
    public Square(){
     super();
    }

    public Square(double side){
        super(side, side);
}

    public Square(double side, String colour, boolean filled){
        super(side, side, colour, filled);
    }

    @Override
    public String toString() {
        return "A Square with width=" + getWidth() + " and length= " + getLenght() + "\nwhich is a subclass of" + removeCharAt(super.toString(), 0);
    }
}
