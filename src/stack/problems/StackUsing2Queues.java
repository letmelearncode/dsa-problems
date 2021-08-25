package stack.problems;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queues {

  private Queue<Integer> primary;
  private Queue<Integer> secondary;

  public StackUsing2Queues() {
    this.primary = new LinkedList<>();
    this.secondary = new LinkedList<>();
  }

  public void push(Integer item) {
    this.primary.add(item);
  }

  public void pop() {
    while (this.primary.size() > 1) {
      this.secondary.add(this.primary.remove());
    }

    this.primary = this.secondary;
    this.secondary = new LinkedList<>();
  }

  public int peek() {
    while (this.primary.size() > 1) {
      this.secondary.add(this.primary.remove());
    }
    int top = this.primary.peek();
    this.primary = this.secondary;
    this.secondary = new LinkedList<>();
    return top;
  }

  public void display() {
    for (Integer item : this.primary) {
      System.out.print(item + " ");
    }
    System.out.println("");
  }
}

class Client {

  public static void main(String[] args) {
    StackUsing2Queues stack = new StackUsing2Queues();
    stack.push(3);
//    stack.push(4);
//    stack.push(13);
//    stack.push(14);
//    stack.display();
//    System.out.println(stack.peek());
//   // System.out.println(stack.peek());
//    stack.pop();
//    stack.display();
//    stack.pop();
//    stack.display();
//    stack.pop();
//    stack.display();
//    System.out.println(stack.peek());
    //System.out.println(stack.peek());

    try {
      System.out.println("A");
      int x = 9 / 0;
      System.out.println("B");
    } catch (Exception e) {
      System.out.println("C");
    } finally {
      throw new NullPointerException();
      //  System.out.println("D");
    }
  }
}
