package arrays.easy;

public class MajorityElementsInArray {

  public static void main(String[] args) {
    MajorityElementsInArray mea = new MajorityElementsInArray();
    int[] arr = {1, 4, 2, 4, 4, 1,4};
    System.out.println(mea.checkMajorityElement(mea.getMajorityElement(arr), arr));
  }

  private boolean checkMajorityElement(int majorityElement, int[] arr) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == majorityElement) {
        count++;
      }
    }
    if (count > arr.length / 2) {
      return true;
    }
    return false;
  }

  private int getMajorityElement(int[] arr) {
    int count = 1;
    int majIndex = 0;

    for (int i = 1; i < arr.length; i++) {
      if (arr[majIndex] == arr[i]) {
        count++;
      } else {
        count--;
        if (count == 0) {
          majIndex = i;
          count = 1;
        }
      }
    }
    return arr[majIndex];
  }

}
