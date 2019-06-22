package Inner_And_Abstract_Classes_Interfaces.Task1;


public class DemoShapes  {
    public static  void main(String ... args){

        int n = 8;
        Shape[] shapes = new Shape[n];



        shapes[0] = new Circle();shapes[3] = new Circle(5);
        shapes[1] = new Circle(7, "red", false );

        shapes[2] = new Rectangle();
        shapes[3] = new Rectangle(4,5);
        shapes[4] = new Rectangle(2,3, "yellow", true);

        shapes[5] = new Square();
        shapes[6] = new Square(4);
        shapes[7] = new Square(6, "black", false);


        for (int i = 0; i < n; i++) {
            System.out.println(shapes[i]);

            if (shapes[i].getClass().getName() == "Inner_And_Abstract_Classes_Interfaces.Task1.Shape") {
                System.out.println();
            }

            System.out.println("Area = " + (shapes[i]).getArea());
            System.out.println(shapes[i].isInside(5, 5));
            System.out.println(shapes[i].isInside(1, 1));
            System.out.println(shapes[i].isInside(0, 0.5));


            //System.out.println(shapes[i].getColour());System.out.println("Perimeter = " + ( shapes[i]).getPerimeter() + "\n");



        }



    }
}
