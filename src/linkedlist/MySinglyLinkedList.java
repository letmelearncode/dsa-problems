package linkedlist;

public class MySinglyLinkedList<T> implements ILinkedList<T> {

  private static final int DEFAULT_CAPACITY = 10;
  private Node head;

  @Override
  public void addFirst(T item) {
    Node prevHead = this.head;
    this.head = new Node(item);
    this.head.next = prevHead;

  }

  @Override
  public void addLast(T item) {
    if (this.head == null) {
      this.addFirst(item);
    } else {
      Node head = this.head;
      while (head.next != null) {
        head = head.next;
      }
      Node last = new Node(item);
      head.next = last;
    }


  }

  @Override
  public void removeFirst(T item) {
    assert item.equals(item);
    this.head = this.head.next;

  }

  @Override
  public void removeLast(T item) {
    Node head = this.head;
    while (head != null) {
      head = head.next;
    }
  }

  @Override
  public void addAt(int index, T item) {
    if (index == 0) {
      addFirst(item);
    } else if (index == size()) {
      addLast(item);
    } else {
      Node head = this.head;
      int count = 0;
      while (count < index - 1) {
        head = head.next;
        count++;
      }
      Node nextNode = head.next;
      Node prevNode = head;
      prevNode.next = new Node(item);
      prevNode.next.next = nextNode;
    }

  }

  @Override
  public void removeAt(int index) {

  }

  @Override
  public boolean isEmpty() {
    return this.head == null;
  }

  @Override
  public int size() {
    Node head = this.head;
    int count = 0;
    while (head != null) {
      count++;
      head = head.next;
    }
    return count;
  }

  @Override
  public T get(int index) {
    return null;
  }

  @Override
  public boolean isFull() {
    return false;
  }

  @Override
  public T getFirst() {
    return this.head.data;
  }

  @Override
  public T getLast() {
    return null;
  }

  @Override
  public void display() {
    Node headNode = this.head;
    while (headNode != null) {
      System.out.print(headNode.data + " ");
      headNode = headNode.next;
    }
    System.out.println("");
  }

  @Override
  public void reverse() {
    Node prev = null;
    Node curr = this.head;
    Node next = null;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    this.head = prev;

  }

  private class Node {

    private T data;
    private Node next;

    public Node(T data) {
      this.data = data;
      this.next = null;
    }
  }
}
