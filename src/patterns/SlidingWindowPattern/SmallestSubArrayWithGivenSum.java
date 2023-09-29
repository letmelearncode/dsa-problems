package patterns.SlidingWindowPattern;

/**
 * Given an array of positive numbers and a positive number ‘S’, find the length of the smallest
 * contiguous subarray whose sum is greater than or equal to ‘S’. Return 0, if no such subarray
 * exists.
 */
public class SmallestSubArrayWithGivenSum {

  public static void main(String[] args) {
    int[] arr = {3, 4, 1, 1, 6};
    int k = 8;
    System.out.println(findSmallestSubArrayWithGivenSum(arr, k));
  }

  private static int findSmallestSubArrayWithGivenSum(int[] arr, int k) {
    int windowStart = 0;
    int windowSum = 0;
    int smallestLength = Integer.MAX_VALUE;
    for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
      windowSum += arr[windowEnd];
      while (windowSum >= k) {
        smallestLength = Math.min(windowEnd - windowStart+1, smallestLength);
        windowSum -= arr[windowStart];
        windowStart++;
      }

    }
    return smallestLength;
  }

}
