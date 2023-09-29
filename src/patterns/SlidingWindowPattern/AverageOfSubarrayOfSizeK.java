package patterns.SlidingWindowPattern;

public class AverageOfSubarrayOfSizeK {

  public static void main(String[] args) {
    int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
    int k = 5;
    findAverageOfSubArray(arr, k);
  }

  private static void findAverageOfSubArray(int[] arr, int k) {
    Double[] averageArr = new Double[k];
    int windowStart = 0;
    double windowSum = 0.0;
    //int i = 0;

    for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
      windowSum += arr[windowEnd];
      if (windowEnd >= k - 1) {
        averageArr[windowStart] = windowSum / k;
        windowSum = windowSum - arr[windowStart];
        windowStart++;
      }
    }
    for (double j : averageArr) {
      System.out.print(j + " ");
    }
  }


}
