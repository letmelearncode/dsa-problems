package linkedlist.baiscs;

public class LinkedList<T> implements ILinkedList<T> {

  private static final int DEFAULT_CAPACITY = 10;
  private Node head;
  private Node tail;

  @Override
  public void addFirst(T item) {
    this.head = new Node(item);

  }

  @Override
  public void addLast(T item) {
    this.tail = new Node(item);

  }

  @Override
  public void removeFirst(T item) {

  }

  @Override
  public void removeLast(T item) {

  }

  @Override
  public void addAt(int index, T item) {

  }

  @Override
  public void removeAt(int index) {

  }

  @Override
  public boolean isEmpty() {
    return this.head == this.tail;
  }

  @Override
  public int size() {
    return 0;
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
    return null;
  }

  @Override
  public T getLast() {
    return null;
  }

  @Override
  public void display() {
    while (this.head != null) {
      System.out.println(this.head.data);
      this.head = this.head.next;
    }
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
