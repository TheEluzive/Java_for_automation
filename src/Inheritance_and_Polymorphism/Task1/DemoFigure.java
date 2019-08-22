package Inheritance_and_Polymorphism.Task1;

public class DemoFigure {
    public static  void main(String ... args){
        int n = 3;
        Circle[] circles = new Circle[n];
        circles[0] = new Circle();
        circles[1] = new Circle(10);
        circles[2] = new Circle(5, "red");

        for (int i =0; i<n; i++)
        {
            System.out.println(i + " " +circles[i].toString());
        }



        n=4;
        Cylinder[] cylinders = new Cylinder[n];
        cylinders[0] = new Cylinder();
        cylinders[1] = new Cylinder(5);
        cylinders[2] = new Cylinder(7, 5);
        cylinders[3] = new Cylinder(7, 5, "red");

        for (int i =0; i<n; i++)
        {
            System.out.print(i+ " " + cylinders[i].toString()+"\n");
        }

    }
}
