package Collection.Task_3;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedList<T> {
    public  Node head;
    private T t;

    class Node {

        T data;
        Node next;

        // Constructor
        Node(T d)
        {
            data = d;
            next = null;
        }
    }


    public MyLinkedList add(T data)
    {

        Node new_node = new Node(data);
        new_node.next = null;

        if (this.head == null) {
            this.head  = new_node;
        }
        else {

            Node last = this.head ;
            while (last.next != null) {
                last = last.next;
            }

            last.next = new_node;
        }


        return this;
    }

    public T get(int i){
        Node currNode = this.head;
        for (int j = 0; j < i; j++){

            currNode = currNode.next;
        }
        return currNode.data;

    }

    public void remove(){  //first
        head = head.next;
    }

    public void reverse(){
        Node previous = null;
        Node current = this.head;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        this.head = previous;

    }

    public void printList()
    {
        Node currNode = this.head ;

        System.out.print("LinkedList: ");


        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }





}