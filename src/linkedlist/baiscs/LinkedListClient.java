package linkedlist.baiscs;

public class LinkedListClient {

  public static void main(String[] args) {
    LinkedList<Integer> linkedList = new LinkedList<>();
    System.out.println(linkedList.isEmpty());
    linkedList.addFirst(4);
    linkedList.addLast(5);
    linkedList.display();
    System.out.println(linkedList.isEmpty());
    java.util.LinkedList linkedList1 = new java.util.LinkedList();

  }

}
