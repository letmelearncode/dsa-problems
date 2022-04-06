package dp;

/**
 * Calculate sum of fibonacci series numbers of a given number f(5) = f(4)+f(3) =
 * f(3)+f(2)+f(2)+f(1) =....
 */
public class FibonacciSum {

  public static void main(String[] args) {
    FibonacciSum fs = new FibonacciSum();
    int n = 6;
    // System.out.println(fs.getFibonacciSum(n));
    int[] arr = new int[n];
    arr[0] = 0;
    arr[1] = 1;
    System.out.println(fs.getFibonacciSumUsingDP(n, arr));
  }

  private int getFibonacciSum(int num) {

    if (num == 1) {
      return 1;
    } else if (num == 0) {
      return 0;
    } else {
      return getFibonacciSum(num - 1) + getFibonacciSum(num - 2);
    }
  }

  /**
   * Optimised solution using DP with  time Complexity - O(n) and space complexity as 0(n)
   */
  private int getFibonacciSumUsingDP(int num, int[] arr) {
    if (num == 1) {
      return 1;
    } else if (num == 0) {
      return 0;
    } else {
      if (arr[num - 1] != 0) {
        return arr[num - 1];
      }
      arr[num - 1] = getFibonacciSumUsingDP(num - 1, arr) + getFibonacciSumUsingDP(num - 2, arr);
      return arr[num - 1];
    }
  }
}
