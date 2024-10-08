package bitmasking.problems.hard;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Find the two non repeating elements of in an array where all the other elements repeat twice
 */
public class TwoNonRepeatingElementsInArray {

  private void findTwoNonRepeatingElements(int[] input) {

    int firstNonRepeatingNumber = Integer.MIN_VALUE;
    int secondNonRepeatingNumber = Integer.MIN_VALUE;
    int rightMostSetBitPosition = 0;

    // calculate xor of all the numbers
    int initialXOR = getXorOfNumbers(IntStream.of(input).boxed().collect(Collectors.toList()), 0);
    int tmp = initialXOR;
    //find out the position of rightmost set bit (this will tell us that in two numbers, bits would be opposite at that position as xor is 1 there)
    while (tmp != 0) {
      if ((tmp & 1) == 1) {
        break;
      }
      tmp = tmp >> 1;
      rightMostSetBitPosition++;
    }

    // divide the array in two parts based on bits are set on the above rightMostSetBitPosition or not
    List<Integer> setArray = new ArrayList<>();
    List<Integer> notSetArray = new ArrayList<>();
    int mask = 1 << rightMostSetBitPosition;

    for (Integer num : input) {
      if ((num & mask) > 0) {
        setArray.add(num);
      } else {
        notSetArray.add(num);
      }
    }

    //take xor between the initial xor and both the arrays separately to get required two numbers
    firstNonRepeatingNumber = getXorOfNumbers(setArray, initialXOR);
    secondNonRepeatingNumber = getXorOfNumbers(notSetArray, initialXOR);

    System.out.println("The two non repeating elements are : " + firstNonRepeatingNumber + ", "
        + secondNonRepeatingNumber);
  }

  private int getXorOfNumbers(List<Integer> input, int initialXOR) {
    int result = initialXOR;
    for (Integer num : input) {
      result ^= num;
    }

    return result;
  }

  public static void main(String[] args) {
    int[] input = {5, 2, 5, 3, 1, 4, 4, 2, 1, 7};
    TwoNonRepeatingElementsInArray obj = new TwoNonRepeatingElementsInArray();
    obj.findTwoNonRepeatingElements(input);
  }

}
