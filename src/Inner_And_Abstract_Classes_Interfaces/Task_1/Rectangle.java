package Inner_And_Abstract_Classes_Interfaces.Task_1;

import java.util.Objects;

public class Rectangle extends Shape {
    private double width;
    private double lenght;

    Rectangle() {
        this.width = 1.0;
        this.lenght = 1.0;
    }

    Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    Rectangle(double width, double lenght, String colour, boolean filled) {
        super(colour, filled);
        this.width = width;
        this.lenght = lenght;
    }

    @Override
    public double getArea() {
        return width*lenght;
    }

    @Override
    public boolean isInside(double x, double y) {
        double xAngle = lenght / 2;
        double yAngle = width / 2;
        if (x>=0&y>=0){
            if(x<xAngle&y<yAngle) return true;
        }
        if (x>=0&y<=0){
            if(x<=xAngle&y>=-1*yAngle) return true;
        }
        if (x<0&y>0){
            if(x>=-1*xAngle&y<=yAngle) return true;
        }
        if (x<0&y<0){
            if(x>=-1*xAngle&y>=-1*yAngle) return true;
        }
        return false;

    }

    public double getWidth() {
        return width;
    }

    protected void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    protected void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public String getColour() {
        return getColour();
    }

    protected void setColour(String colour) {
        this.setColour(colour);
    }

    public boolean isFilled() {
        return isFilled();
    }

    protected void setFilled(boolean filled) {
        this.setFilled(filled);
    }

    public double getPerimeter() {
        return width * lenght;
    }

    @Override
    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + lenght + ", which is a subclass of" + removeCharAt(super.toString(), 0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.width, width) == 0 &&
                Double.compare(rectangle.lenght, lenght) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), width, lenght);
    }


}
