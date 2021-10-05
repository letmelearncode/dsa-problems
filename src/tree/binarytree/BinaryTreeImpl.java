package tree.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class BinaryTreeImpl {

  private Node root;
  private int size;

  private class Node {

    int data;
    Node left;
    Node right;

    public Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public BinaryTreeImpl() {
    Scanner sc = new Scanner(System.in);
    this.root = takeInput(sc, null, false);
  }

  private Node takeInput(Scanner sc, Node parent, boolean isLeftOrRight) {
    if (parent == null) {
      System.out.println("Enter the data of the root node");
    } else {
      if (isLeftOrRight) {
        System.out.println("Enter the data for left Node with parent node as " + parent.data);
      } else {
        System.out.println("Enter the data for right node with parent node as " + parent.data);
      }
    }

    Node node = new Node(sc.nextInt(), null, null);
    this.size++;
    boolean choice = false;
    System.out.println("Enter true if the node " + node.data + " has left node");
    choice = sc.nextBoolean();
    if (choice) {
      node.left = takeInput(sc, node, true);
    }

    choice = false;
    System.out.println("Enter true if the node " + node.data + " has right node");
    choice = sc.nextBoolean();
    if (choice) {
      node.right = takeInput(sc, node, false);
    }

    return node;
  }

  public int size() {
    return this.size;
  }

  public void display() {
    this.display(this.root);

  }

  public int height() {
    return this.height(this.root);
  }

  public void preOrderTraversal() {
    this.preOrderTraversal(this.root);
  }

  public void inOrderTraversal() {
    this.inOrderTraversal(this.root);
  }

  public void postOrderTraversal() {
    this.postOrderTraversal(this.root);
  }

  public void levelOrderTraversal() {
    this.levelOrderTraversal(this.root);
  }

  public void iterativeInOrderTraversal() {
    this.iterativeInOrderTraversal(this.root);
  }

  public int sumOfLeafNodes() {
    return this.sumOfLeafNodes(this.root);
  }

  private int sumOfLeafNodes(Node node) {

    Stack<Node> nodeStack = new Stack<>();
    int sum = 0;

    while (true) {
      if (node != null) {
        nodeStack.push(node);
        node = node.left;
      } else {
        if (nodeStack.isEmpty()) {
          break;
        }
        node = nodeStack.pop();
        if (node.right == null && node.left == null) {
          sum += node.data;
        }

        node = node.right;
      }
    }
    return sum;
  }


  public void inOrderIterativeTraversal() {
    this.inOrderIterativeTraversal(this.root);
  }

  private void inOrderIterativeTraversal(Node node) {
    Node currentNode = this.root;
    Stack<Node> nodeStack = new Stack<>();
    List<Integer> numbers = new ArrayList<>();
    nodeStack.push(currentNode);
    while (!nodeStack.isEmpty()) {

      if (currentNode.left != null) {
        currentNode = currentNode.left;
        nodeStack.push(currentNode);
      } else if (currentNode.right != null) {
        currentNode = currentNode.right;
        nodeStack.push(currentNode);
      } else {
        Node lastVisitedNode = nodeStack.pop();
        numbers.add(lastVisitedNode.data);
        currentNode = lastVisitedNode;
      }
    }
  }


  private void iterativeInOrderTraversal(Node node) {

    Stack<Node> nodeStack = new Stack<>();
    String output = "";

    while (true) {
      if (node != null) {
        nodeStack.push(node);
        node = node.left;
      } else {
        if (!nodeStack.isEmpty()) {
          node = nodeStack.pop();
          output = output + " " + node.data;
          node = node.right;
        } else {
          break;
        }
      }

    }
    System.out.println(output);
  }


  private void levelOrderTraversal(Node node) {
    LinkedList<Node> nodes = new LinkedList<>();
    nodes.add(node);

    while (!nodes.isEmpty()) {
      Node removedNode = nodes.removeFirst();
      System.out.print(removedNode.data + " ");
      if (removedNode.left != null) {
        nodes.addLast(removedNode.left);
      }
      if (removedNode.right != null) {
        nodes.addLast(removedNode.right);
      }
    }
    System.out.println("");
  }

  public boolean find(int data) {
    return this.find(this.root, data);
  }

  private boolean find(Node node, int data) {

    if (node == null) {
      return false;
    }
    System.out.println(node.data);
    if (node.data == data) {
      return true;
    }

    return (find(node.left, data) || find(node.right, data));

  }


  private void postOrderTraversal(Node node) {
    if (node == null) {
      return;
    }
    this.postOrderTraversal(node.left);
    this.postOrderTraversal(node.right);
    System.out.print(node.data + " ");

  }

  private void inOrderTraversal(Node node) {
    if (node == null) {
      return;
    }
    this.inOrderTraversal(node.left);
    System.out.print(node.data + " ");
    this.inOrderTraversal(node.right);
  }

  private void preOrderTraversal(Node node) {
    if (node == null) {
      return;
    }
    System.out.print(node.data + " ");

    preOrderTraversal(node.left);
    preOrderTraversal(node.right);
  }

  private int height(Node node) {
    if (node == null) {
      return -1;
    }
    int leftTreeHeight = height(node.left);
    int rightTreeHeight = height(node.right);
    if (leftTreeHeight >= rightTreeHeight) {
      return leftTreeHeight + 1;
    } else {
      return rightTreeHeight + 1;
    }
  }

  private void display(Node root) {
    String str = "";

    if (root != null) {
      str += root.data;

      if (root.left != null) {
        str = root.left.data + "=>" + str;
      } else {
        str = "END" + "=>" + str;
      }
      if (root.right != null) {
        str = str + "<=" + root.right.data;
      } else {
        str = str + "<=" + "END";
      }
      System.out.println(str);
      this.display(root.left);
      this.display(root.right);
    }
  }


}

// 50 true 24 false false true 67 true 44 false false false
// 50 true 25 true 38 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false
// Pre Order =  50 25 38 48 18 45 85 60
// In Order =   38 25 18 48 50 85 45 60
// post Order = 38 18 48 25 85 60 45 50
// level order = 50 25 45 38 48 85 60 18
class Driver {

  public static void main(String[] args) {
    BinaryTreeImpl tree = new BinaryTreeImpl();
    System.out.println(tree.size());
    tree.display();
    System.out.println(tree.height());
    tree.preOrderTraversal();
    System.out.println("");
    System.out.println(tree.find(70));
    tree.inOrderTraversal();
    System.out.println("");
    tree.postOrderTraversal();
    System.out.println("");
    tree.levelOrderTraversal();
    System.out.println("");
    tree.iterativeInOrderTraversal();
    System.out.println(tree.sumOfLeafNodes());

  }
}
