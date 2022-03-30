package arrays.easy;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two
 * integers m and n, representing the number of elements in nums1 and nums2 respectively.
 *
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 *
 * The final sorted array should not be returned by the function, but instead be stored inside the
 * array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote
 * the elements that should be merged, and the last n elements are set to 0 and should be ignored.
 * nums2 has a length of n.
 */
public class MergeTwoSortedArrays {


  public int[] merge(int[] nums1, int m, int[] nums2, int n) {

    int[] newArr = new int[m + n];
    int firstPtr = 0;
    int secondPtr = 0;
    int thirdPtr = 0;

    while (firstPtr < m & secondPtr < n) {

      if (nums1[firstPtr] < nums2[secondPtr]) {
        newArr[thirdPtr] = nums1[firstPtr];
        firstPtr++;
      } else if (nums1[firstPtr] > nums2[secondPtr]) {
        newArr[thirdPtr] = nums2[secondPtr];
        secondPtr++;
      } else {
        newArr[thirdPtr] = nums1[firstPtr];
        firstPtr++;
        thirdPtr++;
        newArr[thirdPtr] = nums2[secondPtr];
        secondPtr++;
      }
      thirdPtr++;
    }
    if (firstPtr > secondPtr) {
      while (secondPtr < n) {
        newArr[thirdPtr++] = nums2[secondPtr++];
      }
    } else {
      while (firstPtr < m) {
        newArr[thirdPtr++] = nums1[firstPtr++];
      }
    }

    return newArr;

  }

  private int[] mergeTwoArraysFromBack(int[] firstArr, int firstArrLength, int[] secArr,
      int secArrLenth) {

    int i = firstArrLength-1;
    int j = secArrLenth-1;
    int q = firstArr.length-1;

    while(i>=0 & j>=0){
      if(firstArr[i]<=secArr[j]){
        firstArr[q--]= secArr[j--];
      }
      else
        firstArr[q--] = firstArr[i--];
    }
    if(i<0){
      for (int k = q; k >= 0; k--) {
          firstArr[k] = secArr[j--];
      }
    }
  /*  else
      for (int k = q; k >= 0; k--) {
        firstArr[k] = firstArr[i--];
      }*/

    return firstArr;
  }

  public static void main(String[] args) {
    int[] nums1 = {1, 2, 3, 0, 0, 0};
    int nums2[] = {2,5,6};
    MergeTwoSortedArrays ms = new MergeTwoSortedArrays();
    //int[] result = ms.merge(nums1, 3, nums2, 3);
    int[] result = ms.mergeTwoArraysFromBack(nums1, 3, nums2, 3);
    for (Integer i : result) {
      System.out.print(i + ", ");
    }
  }
}


