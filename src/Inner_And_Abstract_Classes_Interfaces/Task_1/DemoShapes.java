package Inner_And_Abstract_Classes_Interfaces.Task_1;


public class DemoShapes {
    public static  void main(String ... args){

        int n = 2;
        Shape[] shapes = new Shape[n];



        shapes[2] = new Circle();
        shapes[3] = new Circle(5);
        shapes[4] = new Circle(7, "red", false );

        shapes[5] = new Rectangle();
        shapes[6] = new Rectangle(4,5);
        shapes[7] = new Rectangle(2,3, "yellow", true);

        shapes[8] = new Square();
        shapes[9] = new Square(4);
        shapes[10] = new Square(6, "black", false);


        for (int i = 0; i < n; i++) {
            System.out.println(shapes[i]);

            if (shapes[i].getClass().getName() == "Inheritance_and_Polymorphism.Task2.Shape") {
                System.out.println();
            }
            if (shapes[i] instanceof Circle) {
                System.out.println("Area = " + ((Circle) shapes[i]).getArea()+ "\n");
            }

            if (shapes[i] instanceof Rectangle) {
                System.out.println("Perimeter = " + ((Rectangle) shapes[i]).getPerimeter() + "\n");
            }




        }



    }
}
