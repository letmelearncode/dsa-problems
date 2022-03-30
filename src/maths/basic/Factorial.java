package maths.basic;


public class Factorial {

  /**
   * Find out the factorial of a number
   */
  private Integer getFactorial(int number) {
    int ans = 1;
    if (number == 0 || number == 1) {
      return 1;
    }
    for (int i = 1; i <= number; i++) {
      ans = ans * i;
    }
    return ans;
  }

  /**
   * FInd out trailing zero in factorial of a number
   */
  private int getTrailingZeros(int number) {
    int count = 0;
    for (int i = 5; i <= number; i *= 5) {
      count += Math.floor(number / i) ;
    }
    return count;
  }

  public static void main(String[] args) {
    int number = 10;
    Factorial factorial = new Factorial();
    System.out.println(factorial.getFactorial(number));
    System.out.println(factorial.getTrailingZeros(number));
  }

}
