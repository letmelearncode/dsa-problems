package linkedlist.baiscs;

public interface ILinkedList<T> {

  void addFirst(T item);

  void addLast(T item);

  void removeFirst(T item);

  void removeLast(T item);

  void addAt(int index, T item);

  void removeAt(int index);

  boolean isEmpty();

  int size();

  T get(int index);

  boolean isFull();

  T getFirst();

  T getLast();

  void display();

}
