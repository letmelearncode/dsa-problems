package recursion;

public class PowerSetOfString {

  public static void main(String[] args) {
    PowerSetOfString ps = new PowerSetOfString();
    ps.getPowerSet("abcd", 0, "a");
  }

  private void getPowerSet(String string, int index, String curr) {
    if (index == string.length()) {
      System.out.println(curr);
      return;
    }

    // call this to get the other char printed as well
    getPowerSet(string, index + 1, curr + string.charAt(index));
    // call this to just print the current char
    getPowerSet(string, index + 1, curr);
  }
}
