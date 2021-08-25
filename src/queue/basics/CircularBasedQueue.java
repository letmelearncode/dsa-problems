package queue.basics;

public class CircularBasedQueue<T> extends ArrayBasedQueueImpl<T> {

  public CircularBasedQueue() {
    super();
  }

  public CircularBasedQueue(int size) {
    super(size);
    this.setRear(size - 1);
  }

  @Override
  public void enqueue(T item) throws Exception {
    if (this.getRear() > this.getMaxSize() - 1) {
      throw new Exception("Overflow Occured!");
    }
    System.out.println(this.getRear());
    this.getData()[this.getRear()] = item;
    this.setCountSize(this.getCountSize() + 1);
    this.setRear((this.getRear() + 1) % this.getMaxSize());

  }

  @Override
  public T dequeue() {
    T item = this.getData()[this.getFront()];
    this.getData()[this.getFront()] = null;
    this.setCountSize(this.getCountSize() - 1);
    this.setFront((this.getFront() + 1) % this.getMaxSize());
    return item;
  }
}
