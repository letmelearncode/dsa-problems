package stack.basics;

/**
 * Implements stack as array should have following properties.
 * push, pop, peek, isEmpty, size,
 * display
 */
public class StackArrayImpl {

  protected static final int DEFAULT_ARRAY_LENGTH = 10;

  protected int[] data;
  protected int top = -1;

  public StackArrayImpl() throws Exception {
    this(DEFAULT_ARRAY_LENGTH);
  }

  public StackArrayImpl(int size) throws Exception {
    if (size < 1) {
      throw new Exception("Invalid capacity!");
    }
    this.data = new int[size];
  }

  public void push(int num) throws Exception {
    if (top + 1 == data.length) {
      throw new Exception("Stack Overflow");
    }

    data[++top] = num;
  }

  public int size() {
    return top + 1;
  }

  public int pop() throws Exception {
    if (top == -1) {
      throw new Exception("Stack Underflow!");
    }
    int poppedElement = this.data[top];
    this.data[top] = 0;
    top--;
    return poppedElement;

  }

  public int peek() throws Exception {
    if (top == -1) {
      throw new Exception("Stack Underflow!");
    }
    return this.data[top];
  }

  public boolean isEmpty() {
    return top == -1;
  }

  public void display() {
    for (int i = top; i >= 0; i--) {
      System.out.print(this.data[i] + " ");
    }
    System.out.println("");
  }
}


class Driver {

  public static void main(String[] args) throws Exception {
    /*StackArrayImpl s1 = new StackArrayImpl(6);
    System.out.println(s1.isEmpty());
    //s1.peek();
    s1.push(2);
    s1.push(3);
    s1.push(4);
    s1.push(5);
    s1.push(6);
    // System.out.println(s1.peek());
    System.out.println(s1.size());
    System.out.println(s1.pop());
    System.out.println(s1.size());
    s1.display();*/

    StackArrayImpl stack = new DynamicStackImpl();
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.display();
    System.out.println(stack.peek());
    System.out.println(stack.pop());
    stack.display();
  }
}