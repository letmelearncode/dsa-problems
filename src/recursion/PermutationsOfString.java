package recursion;

public class PermutationsOfString {

  public static void main(String[] args) {
    PermutationsOfString ps = new PermutationsOfString();
    ps.getPermutations("abc", 0, 2);
  }

  private void getPermutations(String str, int left, int right) {
    if (left >= right) {
      System.out.println(str);
      return;
    }
    for (int i = left; i < right; i++) {
      str = swap(str, left, i);
      getPermutations(str, left + 1, right);
      str = swap(str, left, i);
    }
  }

  private String swap(String str, int left, int i) {

    StringBuffer sf = new StringBuffer(str);
    Character leftChar = str.charAt(left);
    Character rightChar = str.charAt(i);
    sf = sf.insert(left, rightChar);
    sf = sf.insert(i, leftChar);
    return sf.toString();
  }
}
