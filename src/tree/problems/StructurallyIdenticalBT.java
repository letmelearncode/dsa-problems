package tree.problems;

import java.util.Scanner;

/**
 * The class contains method for identifying if given two Binary Trees are structurally identical or
 * not. Structurally Identical BTs should have identical structure but data may not be the same.
 */
public class StructurallyIdenticalBT {

  private Node root;
  private int size;

  public StructurallyIdenticalBT() {
    Scanner sc = new Scanner(System.in);
    this.root = takeInput(sc, null, false);
  }

  public int size() {
    return this.size;
  }

  private class Node {

    private Node left;
    private Node right;
    private int data;

    public Node(Node left, Node right, int data) {
      this.left = left;
      this.right = right;
      this.data = data;
    }
  }


  boolean ifStructurallyIdenticalBT(StructurallyIdenticalBT sibt) {
    return false;
  }

  private Node takeInput(Scanner sc, Node parent, boolean isLeft) {
    if (parent == null) {
      System.out.println("Enter the data of the root node");
    } else {
      if (isLeft) {
        System.out.println("Enter the data of the left node for parent node as : " + parent.data);
      } else {
        System.out.println("Enter the data of the right node for parent node as : " + parent.data);
      }
    }
    Node node = new Node(null, null, sc.nextInt());
    this.size++;
    boolean choice = false;
    System.out.println("Enter true if node " + node.data + " has left child");
    choice = sc.nextBoolean();
    if (choice) {
      node.left = takeInput(sc, node, true);
    }

    choice = false;
    System.out.println("Enter true if node " + node.data + " has right child");
    choice = sc.nextBoolean();
    if (choice) {
      node.right = takeInput(sc, node, false);
    }
    return node;
  }

}

class Driver {

  public static void main(String[] args) {
    StructurallyIdenticalBT sibt1 = new StructurallyIdenticalBT();
    StructurallyIdenticalBT sibt2 = new StructurallyIdenticalBT();
    System.out.println(sibt1.size());
    System.out.println(sibt2.size());
    System.out.println(sibt1.ifStructurallyIdenticalBT(sibt2));

  }
}
