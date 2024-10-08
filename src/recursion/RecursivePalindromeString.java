package recursion;

public class RecursivePalindromeString {

  private boolean checkIfPalindrome(String s, int start, int end) {
    if (start >= end) {
      return true;
    }
    if (s.charAt(start) != s.charAt(end)) {
      return false;
    }
    return checkIfPalindrome(s, start + 1, end - 1);
  }

  public static void main(String[] args) {
    RecursivePalindromeString rm = new RecursivePalindromeString();
    System.out.println(rm.checkIfPalindrome("racecar", 0, 6));
    System.out.println(rm.checkIfPalindrome("avon", 0, 3));
    System.out.println(rm.checkIfPalindrome("malayalam", 0, 8));
    System.out.println(rm.checkIfPalindrome("abba", 0, 3));
  }
}
