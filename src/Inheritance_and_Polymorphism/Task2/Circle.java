package Inheritance_and_Polymorphism.Task2;

import Inheritance_and_Polymorphism.Task3.MathUtil;

import java.util.Objects;

public class Circle extends Shape {
    private  double radius;

    public Circle() {
        super();
        this.radius = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String colour, boolean filled) {
        super(colour, filled);
        this.radius = radius;
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

    public String getColour() {
        return super.getColour();
    }

    protected void setColour(String colour) {
        super.setColour(colour);
    }

    public boolean isFilled() {
        return super.isFilled();
    }

    protected void setFilled(boolean filled) {
        super.setFilled(filled);
    }

    public double getArea(){
        return MathUtil.PI *radius*radius;
    }
}
