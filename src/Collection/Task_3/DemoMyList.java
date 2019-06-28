package Collection.Task_3;

public class DemoMyList {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList();


        list.add("one");
        list.add("two");
        list.add("three");

        list.remove();

        list.printList();
        //list.get(1);


    }
}
