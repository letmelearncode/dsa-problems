package queue.problems;

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

    int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
    int k = 3;
    printMaxElementInKWindow(arr, k);
  }

  private static void printMaxElementInKWindow(int[] arr, int k) {
    //System.out.println(arr.length+" "+k);

    Deque<Integer> deque = new LinkedList<>();
    int i = 0;
    /**
     * this loop is for first window and it adds the maximum value in the deque.
     * After the for loop is over, deque contains only one element which is the max of the window.
     */
    for (i = 0; i < k; i++) {
      while (!deque.isEmpty() && arr[i] > arr[deque.peekLast()]) {
        deque.removeLast();
      }
      deque.addLast(i);
    }
    /**
     *  the following loop executes for subsequent windows
     *  1. It firstly removes all the elements which do not fall in the current window.
     *  2. It again iterates in the current window and finds max element and gets rid of the other elements
     *  */
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