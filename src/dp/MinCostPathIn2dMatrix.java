package dp;

/**
 * Find the min cost path in a provided 2D matrix of m*n size. Allowed operations are 1) One cell
 * rightwards 2) One cell downwards
 */
public class MinCostPathIn2dMatrix {

  public static void main(String[] args) {
    MinCostPathIn2dMatrix minCostPathIn2dMatrix = new MinCostPathIn2dMatrix();
    int[][] arr = {{3, 2, 12, 15, 10}, {6, 19, 7, 11, 17}, {8, 5, 12, 32, 21}, {3, 20, 2, 9, 7}};
    int[][] ansArr = new int[4][5];
    Long now1 = System.currentTimeMillis();
    System.out.println(minCostPathIn2dMatrix.getMinCost(0, 0, arr));
    Long now2 = System.currentTimeMillis();
    System.out.println(minCostPathIn2dMatrix.getMinCostUsingMemoisation(0, 0, arr, ansArr));
    Long now3 = System.currentTimeMillis();
    Long recursiveProgramTime = now2 - now1;
    Long memoization = now3 - now2;
    System.out.println(recursiveProgramTime.toString());
    System.out.println(memoization.toString());
  }

  /**
   * Unoptimised with recursive approach with m+n-1 size of the call stack. Every problem has 2
   * sub-problems to solve. So the time complexity is 0(2^n+m-1). Space Complexity is  0(n+m)
   */
  private int getMinCost(int row, int col, int[][] arr) {
    if ((row == arr.length - 1) && (col == arr[0].length - 1)) {
      return arr[arr.length - 1][arr[0].length - 1];
    } else if (row == arr.length - 1) {
      return arr[row][col] + getMinCost(row, col + 1, arr);
    } else if (col == arr[0].length - 1) {
      return arr[row][col] + getMinCost(row + 1, col, arr);
    } else {
      return arr[row][col] + Math
          .min(getMinCost(row, col + 1, arr), getMinCost(row + 1, col, arr));

    }
  }


  /**
   * Optimised solution using top-down approach(memoisation) Time Complexity - 0(nm) Space
   * Complexity - 0(nm)
   */
  private int getMinCostUsingMemoisation(int row, int col, int[][] arr, int[][] ansArr) {
    if (ansArr[row][col] != 0) {
      return ansArr[row][col];
    }
    if ((row == arr.length - 1) && (col == arr[0].length - 1)) {
      ansArr[row][col] = arr[arr.length - 1][arr[0].length - 1];
      return ansArr[row][col];
    } else if (row == arr.length - 1) {
      ansArr[row][col] = arr[row][col] + getMinCostUsingMemoisation(row, col + 1, arr, ansArr);
      return ansArr[row][col];
    } else if (col == arr[0].length - 1) {
      ansArr[row][col] = arr[row][col] + getMinCostUsingMemoisation(row + 1, col, arr, ansArr);
      return ansArr[row][col];
    } else {
      ansArr[row][col] = arr[row][col] + Math
          .min(getMinCostUsingMemoisation(row, col + 1, arr, ansArr),
              getMinCostUsingMemoisation(row + 1, col, arr, ansArr));
      return ansArr[row][col];
    }
  }

  /**
   * Solution using bottom up approach(tabulation) Time Complexity - 0(nm) Space Complexity - 0
   * (nm)
   */

  private int getMinCostUsingTabulation() {
    return 0;
  }
}
