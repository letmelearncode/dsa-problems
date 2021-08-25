package linkedlist;

public class LinkedListClient {

  public static void main(String[] args) {
    MySinglyLinkedList<Integer> mySinglyLinkedList = new MySinglyLinkedList<>();
    System.out.println(mySinglyLinkedList.isEmpty());
    mySinglyLinkedList.addFirst(4);
    mySinglyLinkedList.addFirst(5);
    mySinglyLinkedList.addLast(3);
    System.out.println(mySinglyLinkedList.getFirst());
    mySinglyLinkedList.display();
    System.out.println(mySinglyLinkedList.isEmpty());
    mySinglyLinkedList.removeFirst(4);
    mySinglyLinkedList.display();
    System.out.println(mySinglyLinkedList.isEmpty());
    System.out.println(mySinglyLinkedList.size());
    mySinglyLinkedList.addAt(1, 8);
    mySinglyLinkedList.addAt(1, 18);
    mySinglyLinkedList.display();
    mySinglyLinkedList.reverse();

  }

}
