package Generics;

public class demo {
    public static void main(String[] args) {
        System.out.println("First task:");

        String string = "demoFirst - string";
        Pair.demoFirst demoFirst = new Pair.demoFirst(1,2.0);
        Pair<String, Pair.demoFirst> pair = new Pair<>(string, demoFirst);


        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond().toString());

        //pair.setFirst(demoFirst);
        System.out.println();
        Pair<Pair.demoFirst, Pair.demoFirst> secondPair = new Pair<>(new Pair.demoFirst(5, 4), new Pair.demoFirst(2, 3));
        System.out.println(secondPair.getFirst());
        System.out.println(secondPair.getSecond().toString());
        System.out.println();

        Pair<String, Pair.demoFirst> thirdPair = new Pair<>("work too so", demoFirst);
        System.out.println(thirdPair.getFirst().toString());
        System.out.println(thirdPair.getSecond().toString());
        Pair.demoFirst secondDemo = new Pair.demoFirst(1,2.0);


        ///////////////////////////////////////////////



        System.out.println("\nSecond task:");
        System.out.println(demoFirst.toString() +" " + secondDemo.toString() + " equals - " + Pair.compare(demoFirst, secondDemo));
        secondDemo.setA(5);
        System.out.println(demoFirst.toString() +" " + secondDemo.toString() + " equals - " +Pair.compare(demoFirst, secondDemo));
        Pair.demoSecond demoSecond = new Pair.demoSecond(1, 2, 3);
        Pair.demoSecond secondDemoForSecondTask = new Pair.demoSecond(3, 2, 3);
        System.out.println(demoSecond.toString() +" " + secondDemoForSecondTask.toString() +
                " equals - " + Pair.compare(demoSecond, secondDemoForSecondTask));
        secondDemoForSecondTask.setA(1);
        System.out.println(demoSecond.toString() +" " + secondDemoForSecondTask.toString() +
                " equals - " + Pair.compare(demoSecond, secondDemoForSecondTask));

    }
}
