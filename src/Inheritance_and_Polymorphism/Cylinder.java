package Inheritance_and_Polymorphism;

import java.util.Objects;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cylinder cylinder = (Cylinder) o;
        return Double.compare(cylinder.height, height) == 0;
    }

    @Override
    public String toString() {
        return "Cylinder{Radius: " + getRadius() + "\ncolor: " + getColour() + "\nheight:" + height + "\narea: " + getArea() + "\nvolume: " + getVolume() + "\n}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height);
    }

    @Override
    protected double getArea() {
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
    }

    protected double getVolume() {
        return getArea() * height;
    }
}
