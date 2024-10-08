package recursion;

public class WaysToTraverseNMMatrix {

  private int findWaysOfTraversal(int a, int b) {
    if (a == 1 || b == 1) {
      return 1;
    }
    return findWaysOfTraversal(a - 1, b) + findWaysOfTraversal(a, b - 1);
  }

  public static void main(String[] args) {
    WaysToTraverseNMMatrix wt = new WaysToTraverseNMMatrix();
    System.out.println(wt.findWaysOfTraversal(4, 3));
  }

}
