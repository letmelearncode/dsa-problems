package stack.problems;

import java.util.Stack;

public class StackReversal {

  public static void main(String[] args) {

    Stack<Integer> stack = new Stack<>();
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.push(6);
    stack.push(7);
    stack.push(8);
    System.out.println("Before reverse peeking " + stack.peek());
    Stack<Integer> helper = new Stack<>();
    reverseStack(stack, helper, 0);
    while (!helper.isEmpty()) {
      stack.push(helper.pop());
    }

    System.out.println("After reverse peeking " + stack.peek());
  }

  public static void reverseStack(Stack<Integer> stack, Stack<Integer> helper,
      int index) {
    if (stack.isEmpty()) {
      return;
    }
    int num = stack.pop();
    reverseStack(stack, helper, index + 1);
    helper.push(num);
  }
}
