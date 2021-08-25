package queue.basics;

/**
 * FIFO based Generics based Queue Interface containing various methods for operations 1.
 * Add(enqeue) 2. Delete(dequeue) 3. size 4. front element 5. display 6. iteration
 */
public interface IQueue<T> {

  /**
   * method adds the item at the end of the queue
   */
  void enqueue(T item) throws Exception;

  /**
   * method deletes the item present at front of the queueu
   */
  T dequeue() throws Exception;

  /**
   * method gives the size of the queue
   *
   * @return integer size
   */
  int size();

  /*
   * method returns the
   * @return the front element
   */
  T front();

  /**
   * iterates and display the elements of queue
   */
  void display();

  /**
   * return true if queue is empty
   */
  boolean isEmpty();

}
