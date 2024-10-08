package arrays.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array, and
 * return false if every element is distinct.
 */
public class ContainsDuplicate {

  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 12,12};
    System.out.printf(containsDuplicate2(nums) ? "true" : "false");
  }


  private static boolean containsDuplicate2(int[] nums) {
    Set<Integer> seen = new HashSet<>();
    for (int num : nums) {
      if(!seen.add(num)) {
        return true;
      }
    }
    return false;
  }


}
