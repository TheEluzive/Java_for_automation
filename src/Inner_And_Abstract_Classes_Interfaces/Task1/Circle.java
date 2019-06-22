package Inner_And_Abstract_Classes_Interfaces.Task1;

import java.util.Objects;

public class Circle extends Shape {
    private  double radius;
    static final double  PI = 3.1415;
    public Circle() {
        super();
        this.radius = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String colour, boolean filled) {
        this.setColour(colour);
        this.setFilled(filled);
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2*PI*radius;
    }

    @Override
    public double getArea(){
        return PI*radius*radius;
    }

    @Override
    public boolean isInside(double x, double y) {
        System.out.println(
                (Math.sqrt(
                (Math.pow(x,2)) +
                        (Math.pow(y,2))
                           )
                )
                +" " + Math.sqrt(radius+radius));
        return ( Math.sqrt( (Math.pow(x,2))+(Math.pow(y,2) ) )<= Math.sqrt(radius+radius))?true:false;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of" + removeCharAt(super.toString(), 0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }

    public double getRadius() {
        return radius;
    }


    protected void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String getColour() {
        return super.getColour();
    }

    @Override
    protected void setColour(String colour) {
        super.setColour(colour);
    }

    @Override
    public boolean isFilled() {
        return isFilled();
    }

    @Override
    protected void setFilled(boolean filled) {
        super.setFilled(filled);
    }


}
