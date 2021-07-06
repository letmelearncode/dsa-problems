package stack.problems;

import java.util.Stack;

/**
 * Given an array 2,1,3,5,7,6,4, for every element in the array, give the next greater element and
 * if not exits, return -1.
 *
 * 2->-1, 1->3, 3->5, 5->7, 7->-1, 6->-1, 4->-1
 */
public class NextGreaterElement {

  public static void main(String[] args) {
    int[] arr = {2, 1, 3, 5, 7, 6, 4};
    findNextGreaterElement(arr);

  }

  private static void findNextGreaterElement(int[] arr) {
    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < arr.length; i++) {
      if (!stack.isEmpty() && arr[i] > stack.peek()) {
        int num = stack.pop();
        System.out.print(num + " -> " + arr[i] + ", ");
      }
      stack.push(arr[i]);

    }

    while (!stack.isEmpty()) {
      System.out.print(stack.pop() + " -> " + "-1, ");
    }

  }


}



