package arrays.easy;

public class IntersectionOfTwoArrays {

  //brute-force with 0(n^2)
  public int[] intersect(int[] nums1, int[] nums2) {

    int[] result = new int[nums1.length + nums2.length];
    int q = 0;
    for (int i = 0; i < nums1.length; i++) {
      for (int j = 0; j < nums2.length; j++) {
        if (nums1[i] == nums2[j]) {
          result[q++] = nums1[i];
          nums2[j] = Integer.MIN_VALUE;
          break;
        }
      }
    }
    return result;
  }



    public static void main(String[] args) {
      int[] arr1 = {4,9,9,4};
      int[] arr2 ={9,4,9,8};
      IntersectionOfTwoArrays is = new IntersectionOfTwoArrays();
     int[] result =  is.intersect(arr1,arr2 );
      for (Integer i:result) {
        System.out.print(i+" ");
      }

  }

}
