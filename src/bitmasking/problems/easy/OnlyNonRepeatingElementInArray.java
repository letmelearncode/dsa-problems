package bitmasking.problems.easy;

/**
 * Find the only non - repeating element in an array where every element repeats twice.
 */
public class OnlyNonRepeatingElementInArray {

  private Integer findOnlyNonRepeatingElementInArray(int[] input) {

    int result = 0;
    for (Integer num : input) {
      result ^= num;
    }
    return result;
  }

  public static void main(String[] args) {
    int[] input = {5, 2, 5, 3, 1, 4, 4, 2, 1, 7};
    OnlyNonRepeatingElementInArray obj = new OnlyNonRepeatingElementInArray();
    System.out.println(obj.findOnlyNonRepeatingElementInArray(input));
  }

}
