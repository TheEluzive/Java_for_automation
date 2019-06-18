package Inheritance_and_Polymorphism;

public class DemoFigure {
    public static  void main(String ... args){
        Circle circle = new Circle(5, "red");
        System.out.println(circle.toString());

        System.out.println();

        Cylinder cylinder = new Cylinder(5);
        System.out.println(cylinder.toString());
    }
}
