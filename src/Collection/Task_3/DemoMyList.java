package Collection.Task_3;

import java.util.Iterator;

public class DemoMyList {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList();
        Iterator<String> iterator = list.iterator();

        list.add("one");

        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.printList();

        list.remove();
        System.out.println("After removing:");
        list.printList();
        //list.get(1);
        System.out.println("After reverse:");
        list.reverse();
        list.printList();

        System.out.println("list[1] = " + list.get(1));

        System.out.println("Iterator work: ");
      for (; iterator.hasNext();){
            System.out.println(iterator.next());
        }
        //System.out.println( list.size);


    }
}
