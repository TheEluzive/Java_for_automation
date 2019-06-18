package Inheritance_and_Polymorphism;

import java.util.Objects;

public class Circle {
    private double radius;
    private String colour;
    Circle(){
        this.radius = 0;
        this.colour = "None";
    }
    Circle(double radius){
        this.radius = radius;
        this.colour = "";
    }

    Circle( double radius, String color){
        this.radius=radius;
        this.colour = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    protected double getArea(){
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Cirlce{Radius: " + radius + "\ncolor: " + colour + "\narea: " + getArea()+"\n}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 &&
                Objects.equals(colour, circle.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, colour);
    }
}
