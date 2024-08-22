package patterns;

import java.util.Arrays;

public class Test {

  public static int maxPossibleValueSum(int[] files, int[] binaryValues, int k) {
    int n = files.length;
    int[][] combinedList = new int[n][2];

    for (int i = 0; i < n; i++) {
      combinedList[i][0] = files[i];
      combinedList[i][1] = binaryValues[i];
    }

    Arrays.sort(combinedList, (a, b) -> Integer.compare(b[0], a[0]));

    int totalSum = 0;

    for (int i = 0; i < n; i++) {
      if (k > 0 && combinedList[i][1] == 1) {
        totalSum += combinedList[i][0];
        k--;
      }
    }

    return totalSum;
  }

  public static void main(String[] args) {
    int[] files = {1, 3, 5, 2, 5, 4};
    int[] binaryValues = {1, 1, 0, 1, 0, 0};
    int k = 3;

    int maxValueSum = maxPossibleValueSum(files, binaryValues, k);
    System.out.println("Maximum possible value sum: " + maxValueSum);
  }
}



