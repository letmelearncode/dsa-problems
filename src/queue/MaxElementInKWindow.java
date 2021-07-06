package queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * The class contains logic to find maximum element in every sliding window of k size in sequence of
 * n integers.
 */
public class MaxElementInKWindow {

}

class Driver {

  public static void main(String[] args) {
    //Scanner s = new Scanner(System.in);
   /* int n = s.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = s.nextInt();
    }
    int k = s.nextInt();
    s.close();*/
    int[] arr = {2, 0, 3, 8, 4, 9, 10, 6};
    int k = 3;
    printMaxElementInKWindow(arr, k);
  }

  private static void printMaxElementInKWindow(int[] arr, int k) {
    //System.out.println(arr.length+" "+k);

    Deque<Integer> deque = new LinkedList<>();
    int i = 0;
    for (i = 0; i < k; i++) {
      while (!deque.isEmpty() && arr[i] > arr[deque.peekLast()]) {
        deque.removeLast();
      }
      deque.addLast(i);
    }
    for (; i < arr.length; i++) {
      System.out.print(arr[deque.getFirst()] + " ");
      while (!deque.isEmpty() && deque.getFirst() <= i - k) {
        deque.removeFirst();
      }
      while (!deque.isEmpty() && arr[i] > arr[deque.peekLast()]) {
        deque.removeLast();
      }
      deque.addLast(i);

    }
    System.out.print(arr[deque.getFirst()] + " ");
  }
}