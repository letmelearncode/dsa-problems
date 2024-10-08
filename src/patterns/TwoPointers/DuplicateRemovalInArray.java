package patterns.TwoPointers;

/**
 * Given an array of sorted numbers, remove all duplicates from it. You should not use any extra
 * space; after removing the duplicates in-place return the new length of the array.
 */


public class DuplicateRemovalInArray {

  public static void main(String[] args) {
    int[] arr = {2, 3, 3, 3, 6, 9, 9};
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
    System.out.println("");
    deDuplicateInPlace(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
    //System.out.println(deDuplicateInPlace(arr));

  }

  private static int deDuplicateInPlace(int[] arr) {
    int nonDuplicateAtIndex =0;

    for(int i=0;i<arr.length;i++){
      if(arr[nonDuplicateAtIndex]!=arr[i]){
        nonDuplicateAtIndex++;
        arr[nonDuplicateAtIndex]= arr[i];
      }
    }
    return nonDuplicateAtIndex+1;
  }


  private static int deDuplicate(int[] arr){
    int lengthOfArr = arr.length;
    int[] temp = new int[lengthOfArr];
    int nonDuplicateAtIndex =0;
    temp[nonDuplicateAtIndex] = arr[0];

    for(int i=0;i<arr.length;i++){
      if(temp[nonDuplicateAtIndex]!=arr[i]){
        nonDuplicateAtIndex++;
        temp[nonDuplicateAtIndex]= arr[i];
      }
    }
    return nonDuplicateAtIndex+1;
  }

}
