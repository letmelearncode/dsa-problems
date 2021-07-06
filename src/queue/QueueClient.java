package queue;

public class QueueClient {

  public static void main(String[] args) throws Exception {
    IQueue<Integer> myQueue = new ArrayBasedQueueImpl<>(4);

   /* myQueue.enqueue(4);
    myQueue.enqueue(2);
    myQueue.enqueue(40);
    myQueue.enqueue(9);
    // myQueue.enqueue(9);
    System.out.println(myQueue.size());
    System.out.println(myQueue.front());
    myQueue.display();
    myQueue.dequeue();
    myQueue.dequeue();
    myQueue.dequeue();
    //myQueue.dequeue();
    //myQueue.dequeue();
    myQueue.display();
    System.out.println(myQueue.front());

    IQueue<Integer> circularQueue = new CircularBasedQueue<>(5);
    circularQueue.enqueue(3);
    circularQueue.enqueue(4);
    circularQueue.enqueue(21);
    circularQueue.enqueue(30);
    circularQueue.enqueue(34);
    circularQueue.enqueue(34);
    circularQueue.display();


*/
    LinkedListBasedQueueImpl<Integer> queue = new LinkedListBasedQueueImpl<>();
    queue.enqueue(4);
    queue.enqueue(4);
    queue.enqueue(4);
    queue.enqueue(4);
    queue.enqueue(4);
    queue.display();
    queue.dequeue();
    queue.dequeue();
    queue.dequeue();
    queue.dequeue();

    queue.enqueue(3);
    System.out.println(queue.size());

  }

}
