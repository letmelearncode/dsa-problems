package maths.basic;

/**
 * Euclidean GCD between a and b ie HCF of a and b
 */
public class GCD {

  private int getGCD(int a, int b) {
    if (b == 0) {
      return a;
    }
    return getGCD(b, a % b);
  }

  public static void main(String[] args) {
    GCD gcd = new GCD();
    System.out.println(gcd.getGCD(27, 27));
  }
}
