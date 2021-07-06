package linkedlist.baiscs;

public class LinkedListClient {

  public static void main(String[] args) {
    MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
    System.out.println(myLinkedList.isEmpty());
    myLinkedList.addFirst(4);
    myLinkedList.addLast(5);
    myLinkedList.display();
    System.out.println(myLinkedList.isEmpty());
    java.util.LinkedList linkedList1 = new java.util.LinkedList();

  }

}
