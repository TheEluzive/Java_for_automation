package Generics;

public class Demo {
    public static void main(String[] args) {
        System.out.println("First task:");

        String string = "DemoFirst - string";
        Pair.DemoFirst demoFirst = new Pair.DemoFirst(1,2.0);
        Pair<String, Pair.DemoFirst> pair = new Pair<>(string, demoFirst);


        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond().toString());

        //pair.setFirst(DemoFirst);
        System.out.println();
        Pair<Pair.DemoFirst, Pair.DemoFirst> secondPair = new Pair<>(new Pair.DemoFirst(5, 4), new Pair.DemoFirst(2, 3));
        System.out.println(secondPair.getFirst());
        System.out.println(secondPair.getSecond().toString());
        System.out.println();

        Pair<String, Pair.DemoFirst> thirdPair = new Pair<>("work too so", demoFirst);
        System.out.println(thirdPair.getFirst().toString());
        System.out.println(thirdPair.getSecond().toString());
        Pair.DemoFirst secondDemo = new Pair.DemoFirst(1,2.0);


        ///////////////////////////////////////////////



        System.out.println("\nSecond task:");
        System.out.println(demoFirst.toString() +" " + secondDemo.toString() + " equals - " + Pair.compare(demoFirst, secondDemo));
        secondDemo.setA(5);
        System.out.println(demoFirst.toString() +" " + secondDemo.toString() + " equals - " +Pair.compare(demoFirst, secondDemo));
        Pair.DemoSecond demoSecond = new Pair.DemoSecond(1, 2, 3);
        Pair.DemoSecond secondDemoForSecondTask = new Pair.DemoSecond(3, 2, 3);
        System.out.println(demoSecond.toString() +" " + secondDemoForSecondTask.toString() +
                " equals - " + Pair.compare(demoSecond, secondDemoForSecondTask));
        secondDemoForSecondTask.setA(1);
        System.out.println(demoSecond.toString() +" " + secondDemoForSecondTask.toString() +
                " equals - " + Pair.compare(demoSecond, secondDemoForSecondTask));

    }
}
