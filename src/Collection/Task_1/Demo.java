package Collection.Task_1;

import java.util.*;

public class Demo {
    private ArrayList<String> arrayList = new ArrayList<>();
    private HashSet<String> hashSet = new HashSet<>();
    private HashMap<Integer, String> hashMap = new HashMap<>();
    private Queue<Integer> queue= new ArrayDeque<Integer>();

    public static void main(String[] args) {
        Demo demo = new Demo();



        /// ArrayList
        System.out.println("ArrayList:" );
        demo.arrayList.add("one");
        demo.arrayList.add("two");
        demo.arrayList.add("three");
        demo. arrayList.add("four");
        demo.arrayList.add("five");

        demo.arrayList.set(0, "First");

        demo. arrayList.remove(1);

        for (String i : demo.arrayList) {
            System.out.println(i);
        }

        Collections.sort(demo.arrayList);
        System.out.println("\nSorted: size = "+ demo.arrayList.size());
        for (String i : demo.arrayList) {
            System.out.println(i);
        }

        //HashSet
        ///////////////////////////////////////////////////////////

        demo.hashSet.add("One");
        demo.hashSet.add("two");
        demo.hashSet.add("three");
        demo.hashSet.add("four");
        demo.hashSet.add("five");
        demo.hashSet.remove(4);
        System.out.println("\nHashSet:");
        for (String i : demo.hashSet) {
            System.out.println(i);
        }

        //HashMap
        ////////////////////////////////////
        System.out.println("\nHashMap:");
        String[] string = {"first", "second", "third", "fourth", "fifth"};
        for (int i = 0; i<string.length; i++)
            demo.hashMap.put(i, string[i]);

        demo.hashMap.put(0, "one");

        demo.hashMap.remove(4);

        for (java.util.Map.Entry<Integer, String> entry : demo.hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: "
                    + entry.getValue());
        }

        //Queue
        ///////////////////////////////////
        System.out.println("\nQueue");

        demo.queue.add(0);
        demo.queue.offer(1);
        demo.queue.add(2);
        demo.queue.add(3);
        demo.queue.poll();

        for(int pq : demo.queue) {
            System.out.println(pq);
        }


    }
}
