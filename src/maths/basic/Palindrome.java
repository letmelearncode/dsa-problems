package maths.basic;

public class Palindrome {

  private void checkIfPalindrome(int num) {
    System.out.println(num == getReverse(num));
  }

  private int getReverse(int num) {
    int result = 0;
    int temp = num;
    while (temp > 0) {
      int rem = temp % 10;
      temp = temp / 10;
      result = result * 10 + rem;

    }
    return result;
  }

  public static void main(String[] args) {
    Palindrome pm = new Palindrome();
    pm.checkIfPalindrome(121);
    pm.checkIfPalindrome(1);
    pm.checkIfPalindrome(1221);
    pm.checkIfPalindrome(1235);

  }

}
