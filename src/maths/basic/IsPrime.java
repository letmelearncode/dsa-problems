package maths.basic;

import java.util.Arrays;

public class IsPrime {

  /**
   * returns all the prime numbers between 1 to given number Using Sieve of Eratosthenes
   */
  private boolean[] isPrime(int input) {

    boolean[] arr = new boolean[input + 1];
    Arrays.fill(arr, true);
    arr[0] = false;
    arr[1] = false;

    for (int i = 2; i * i <= input; i++) {
      for (int j = 2 * i; j <= input; j += i) {
        arr[j] = false;
      }
    }
    return arr;
  }

  public static void main(String[] args) {
    IsPrime ip = new IsPrime();
    boolean[] arr = ip.isPrime(20);

    for (int i = 1; i < arr.length; i++) {
      if (arr[i]) {
        System.out.print(i + " ");
      }

    }
    System.out.println("");
  }

}
