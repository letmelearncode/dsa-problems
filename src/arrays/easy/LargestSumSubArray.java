package arrays.easy;

/**
 * 53. Maximum Subarray Tag : Easy (LeetCode)
 *
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which
 * has the largest sum and return its sum. A subarray is a contiguous part of an array.
 *
 * Example 1:
 *
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4] Output: 6 Explanation: [4,-1,2,1] has the largest sum = 6.
 *
 * Example 2:
 *
 * Input: nums = [1] Output: 1
 *
 * Example 3:
 *
 * Input: nums = [5,4,-1,7,8] Output: 23
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105 -104 <= nums[i] <= 104
 *
 * Follow up: If you have figured out the O(n) solution, try coding another solution using the
 * divide and conquer approach, which is more subtle.
 */
public class LargestSumSubArray {

  /**Brute-Force approach**/
  private int getLargestSumOfContiguousSubArray(int[] nums) {

    int maxSum = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      int sum = 0;
      for (int j = i; j < nums.length; j++) {
        sum += nums[j];
        if (sum > maxSum) {
          maxSum = sum;
        }
      }
    }

    return maxSum;
  }

  /**Optimised using Kaden's Algo with O(N)**/
  private int maxSubArray(int[] nums) {

    int currentSum = 0;
    int maxSum = Integer.MIN_VALUE;
    for (int num : nums) {
      currentSum += num;
      if (currentSum > maxSum) {
        maxSum = currentSum;
      }
      if (currentSum < 0) {
        currentSum = 0;
      }
    }
    return maxSum;

  }

  public static void main(String[] args) {
    int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    LargestSumSubArray ls = new LargestSumSubArray();
    System.out.println(ls.getLargestSumOfContiguousSubArray(arr));
    System.out.println(ls.maxSubArray(arr));
  }
}
