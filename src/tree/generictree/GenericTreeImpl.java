package tree.generictree;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericTreeImpl {

  private Node root;
  private int size;

  GenericTreeImpl() {
    Scanner sc = new Scanner(System.in);
    this.root = takeInput(sc, null, 0);
  }

  //tree construction
  public Node takeInput(Scanner sc, Node parent, int ithChild) {
    if (this.root == null) {
      System.out.println("Enter the root element data ");
      this.root = new Node(sc.nextInt());
      takeInput(sc, this.root, 0);
    } else {
      System.out.println("Enter the size of children of the node with data " + parent.data);
      int noOfChildren = sc.nextInt();
      for (int j = 0; j < noOfChildren; j++) {
        System.out.println("Enter the " + j + "th child of node with data " + parent.data);
        int data = sc.nextInt();
        parent.children.add(new Node(data));
        takeInput(sc, parent.children.get(j), j);
      }
    }
    this.size++;
    return this.root;
  }

  //returns size
  public int size() {
    return this.size;
  }

  private void display(Node node) {
    String str = .node.data + " -> ";
    for (int i = 0; i < node.children.size(); i++) {
      str = str + this.children.get(i) + ", ";
    }
    str += "END";
    System.out.println(str);
    for (int i = 0; i < node.children.size(); i++) {
      this.display(node.children.get(i));
    }

  }

  public void display() {
    this.display(this.root);
  }

}


class Node {

  int data;
  ArrayList<Node> children;

  Node(int data) {
    this.data = data;
    this.children = new ArrayList<>();
  }
}


class Driver {

  public static void main(String[] args) {
    GenericTreeImpl tree = new GenericTreeImpl();
    System.out.println(tree.size());
    tree.display();

  }
}