package tree.binarysearchtree;

public class BinarySearchTreeImpl {

  private static class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
    }
  }

  private Node root;
  private int size;

  public BinarySearchTreeImpl(int[] arr) {
    this.root = construct(arr, 0, arr.length - 1);
  }

  public void display() {
    this.display(this.root);
  }

  public boolean find(int item) {
    return this.find(this.root, item);
  }

  public int max() {
    return this.max(this.root);
  }

  public void add(int item) {
    this.add(this.root, item);
  }

  public boolean isBST() {
    return this.isBST(this.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  private boolean isBST(Node node, int minVal, int maxVal) {

    if(node==null){
      return true;
    }

    if (node.data > minVal && node.data < maxVal) {
      return isBST(node.left, minVal, node.data) && isBST(node.right, node.data,maxVal);
    }
    return false;
  }

  private void add(Node node, int item) {
    if (node.right == null && node.left == null) {
      if (item > node.data) {
        node.right = new Node(item);
      } else if (item < node.data) {
        node.left = new Node(item);
      }

      return;
    }
    if (item > node.data) {
      assert node.right != null;
      add(node.right, item);
    } else if (item < node.data) {
      add(node.left, item);
    }

  }

  private int max(Node node) {
    if (node.right == null) {
      return node.data;
    }
    return this.max(node.right);

  }

  private boolean find(Node node, int item) {

    //base case
    if (node == null) {
      return false;
    }

    if (node.data == item) {
      return true;
    } else if (item > node.data) {
      return find(node.right, item);
    } else {
      return find(node.left, item);
    }

  }

  private Node construct(int[] arr, int low, int high) {
    if (low > high) {
      return null;
    }
    int mid = (low + high) / 2;
    Node newNode = new Node(arr[mid]);
    newNode.left = construct(arr, low, mid - 1);
    newNode.right = construct(arr, mid + 1, high);
    return newNode;

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

class Driver {

  public static void main(String[] args) {
    int[] arr = {10, 20, 30, 45, 40, 50, 60, 70, 90};
    BinarySearchTreeImpl bst = new BinarySearchTreeImpl(arr);
    bst.display();
    System.out.println(bst.find(40));
    System.out.println(bst.max());
    bst.add(45);
    bst.display();

    System.out.println(bst.isBST());
  }

}
