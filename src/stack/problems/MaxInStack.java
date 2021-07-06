package stack.problems;

import java.util.Stack;

public class MaxInStack {


  private Stack<Integer> data;
  private Stack<Integer> maxStack;

  public MaxInStack() {
    this.data = new Stack<>();
    this.maxStack = new Stack<>();
  }

  public void push(Integer item) {
    this.data.push(item);
    if (this.maxStack.isEmpty()) {
      this.maxStack.push(item);
    } else if (this.maxStack.peek() > item) {
      this.maxStack.push(this.maxStack.peek());
    } else {
      this.maxStack.push(item);
    }
  }

  public void pop() {
    this.data.pop();
    this.maxStack.pop();
  }

  public int getMax() {
    return this.maxStack.peek();
  }
}

class MaxStackDriver {

  public static void main(String[] args) {
    MaxInStack maxInStack = new MaxInStack();
    maxInStack.push(-2);
    maxInStack.push(3);
    maxInStack.push(6);
    System.out.println(maxInStack.getMax());
    maxInStack.pop();
    System.out.println(maxInStack.getMax());
    maxInStack.push(16);
    System.out.println(maxInStack.getMax());
  }
}
