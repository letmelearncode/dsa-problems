package recursion;

public class JosephusProblem {

  private int resolveJosephusProblem(int n, int k) {
    if (n == 1) {
      return 0;
    }
    return ((resolveJosephusProblem(n - 1, k) + k) % n);
  }

  public static void main(String[] args) {
    JosephusProblem jp = new JosephusProblem();
    System.out.println(jp.resolveJosephusProblem(5, 3));

  }
}
