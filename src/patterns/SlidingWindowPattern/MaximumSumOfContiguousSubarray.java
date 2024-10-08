package patterns.SlidingWindowPattern;

public class MaximumSumOfContiguousSubarray {

  public static void main(String[] args) {
    int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
    int k = 5;
    System.out.println(findMaximumSumOfContiguousSubarray(arr, k));
  }

  private static int findMaximumSumOfContiguousSubarray(int[] arr, int k) {
    int maxSum = 0;
    int windowStart = 0;
    int windowSum = 0;

    for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
      windowSum += arr[windowEnd];
      if (windowEnd >= k - 1) {
        if (maxSum < windowSum) {
          maxSum = windowSum;
        }
        windowSum = windowSum - arr[windowStart];
        windowStart++;
      }
    }
    return maxSum;
  }
}
