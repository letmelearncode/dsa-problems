package patterns.TwoPointers;

/**
 * Given a sorted array, create a new array containing squares of all the number of the input array
 * in the sorted order. Input: [-2, -1, 0, 2, 3] Output: [0, 1, 4, 4, 9]
 */
public class SquaringSortedArray {

  public static void main(String[] args) {
    int[] arr = {-2, -1, 0, 2, 3};
    int[] temp = getSortedSquareOfGivenArray(arr);
    for (int i = 0; i < temp.length; i++) {
      System.out.println(temp[i]);
    }


  }

  private static int[] getSortedSquareOfGivenArray(int[] arr) {
    int squareArr[] = new int[arr.length];
    int indexOfSquareArr = arr.length - 1;
    int left = 0;
    int right = arr.length - 1;

    while (left <= right) {
      if (arr[left] * arr[left]> arr[right] * arr[right]) {
        squareArr[indexOfSquareArr--] = arr[left] * arr[left];
        left++;
      } else {
        squareArr[indexOfSquareArr--] = arr[right] * arr[right];
        right--;
      }
    }
    return squareArr;
  }


}
