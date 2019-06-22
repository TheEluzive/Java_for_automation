package Inner_And_Abstract_Classes_Interfaces.Task1;

import java.util.Objects;

public abstract class Shape {
    private String colour;
    private boolean filled;

    public Shape() {
        this.colour = "Green";
        this.filled = true;
    }

    public Shape(String colour, boolean filled) {
        this.colour = colour;
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract boolean isInside( double x, double y );



    @Override
    public String toString() {
        return "A Shape with the colour of " +  colour + " and " + ((filled) ? "filled.":"not filled.") ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return filled == shape.filled &&
                Objects.equals(colour, shape.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colour, filled);
    }

    public String getColour() {
        return colour;
    }

    protected void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    protected void setFilled(boolean filled) {
        this.filled = filled;
    }

    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
}
