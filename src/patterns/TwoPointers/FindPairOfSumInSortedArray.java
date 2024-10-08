package patterns.TwoPointers;


/**
 * Given an array of sorted numbers and a target sum, find a pair in the array whose sum is equal to
 * the given target.
 */
public class FindPairOfSumInSortedArray {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6};
    int sum = 5;
    int[] result = findPairOfSum(arr, sum);
    System.out.println("Answer : "+result[0]+" "+result[1]);
  }

  private static int[] findPairOfSum(int[] arr, int sum) {
    int[] solArr = {-1,-1};
    int left = 0;
    int right = arr.length - 1;
    while (left < right) {
      if (arr[left] + arr[right] < sum) {
        left++;
      } else if (arr[left] + arr[right] > sum) {
        right--;
      }
      else {
        solArr[0] = arr[left];
        solArr[1] = arr[right];
        break;
      }

    }

    return solArr;
  }
}
