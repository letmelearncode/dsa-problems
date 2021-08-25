package queue.basics;

public class ArrayBasedQueueImpl<T> implements IQueue<T> {

  private static final int DEFAULT_QUEUE_SIZE = 10;
  private int front;
  private int rear;
  private int countSize;
  private int maxSize;
  private T[] data;


  public ArrayBasedQueueImpl() {
    this(DEFAULT_QUEUE_SIZE);
  }


  @SuppressWarnings("unchecked")
  public ArrayBasedQueueImpl(int size) {

    this.data = (T[]) new Object[size];
    this.maxSize = size;

  }

  @Override
  public void enqueue(T item) throws Exception {
    if (rear > maxSize - 1) {
      throw new Exception("Overflow Occured!");
    }
    this.data[rear++] = item;
    this.countSize++;
  }

  @Override
  public T dequeue() throws Exception {
    if (front < 0) {
      throw new Exception("Queue is already empty!");
    }
    T item = this.data[front];
    this.data[front++] = null;
    this.countSize--;
    return item;
  }

  @Override
  public int size() {
    return this.countSize;
  }

  @Override
  public T front() {
    return this.data[front];
  }

  @Override
  public void display() {
    for (int i = this.front; i < this.rear; i++) {
      System.out.print(this.data[i] + " ");
    }
    System.out.println("");
  }

  @Override
  public boolean isEmpty() {
    return this.countSize == 0;
  }

  public int getFront() {
    return front;
  }

  protected void setFront(int front) {
    this.front = front;
  }

  public int getRear() {
    return rear;
  }

  protected void setRear(int rear) {
    this.rear = rear;
  }

  public int getCountSize() {
    return countSize;
  }

  protected void setCountSize(int countSize) {
    this.countSize = countSize;
  }

  public int getMaxSize() {
    return maxSize;
  }

  public T[] getData() {
    return data;
  }
}
