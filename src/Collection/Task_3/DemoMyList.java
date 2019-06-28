package Collection.Task_3;

public class DemoMyList {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList();


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

        System.out.println("list[1] = " + list.get(1).toString());
        list.get(1);

    }
}
