package stack;

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
    Stack<Integer> rev = reverseStack(stack);
    for (int n : rev) {
      System.out.println(n);
    }

  }

  public static Stack<Integer> reverseStack(Stack<Integer> stack) {
    Stack<Integer> reverseStack = new Stack<>();
    while (!stack.isEmpty()) {
      reverseStack.push(stack.pop());
    }
    return reverseStack;
  }
}
