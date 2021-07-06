package queue.basics;


import java.util.LinkedList;

public class LinkedListBasedQueueImpl<T> implements IQueue<T> {

  private LinkedList<T> data;


  LinkedListBasedQueueImpl() {
    this.data = new LinkedList<T>();
  }

  @Override
  public void enqueue(T item) throws Exception {
    this.data.addLast(item);
  }

  @Override
  public T dequeue() throws Exception {
    // if(!this.data.isEmpty())
    return this.data.removeFirst();
  }

  @Override
  public int size() {
    return this.data.size();
  }

  @Override
  public T front() {
    return this.data.getFirst();
  }

  @Override
  public void display() {

    for (T item : this.data) {
      System.out.print(item + ", ");
    }
    System.out.println("");
  }

  @Override
  public boolean isEmpty() {
    return this.data.isEmpty();
  }
}
