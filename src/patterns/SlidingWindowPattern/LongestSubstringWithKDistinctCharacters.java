package patterns.SlidingWindowPattern;

import java.util.HashMap;

/**
 * Given a string, find the length of the longest substring in it with no more than K distinct
 * characters. 1. input = "araaci", K=2, result = "araa" 2. input = "araaci", K=1, result = "aa" 3.
 * input = "cbbebi", K=3, result = "bbebi", "cbbeb"
 */
public class LongestSubstringWithKDistinctCharacters {

  public static void main(String[] args) {

    String inputString = "araaci";
    int noOfDistinctCharacter = 2;
    System.out.println(
        findLengthOfLongestSubstringWithNoMoreKDistinctChar(inputString, noOfDistinctCharacter));

  }

  private static int findLengthOfLongestSubstringWithNoMoreKDistinctChar(String inputString,
      int noOfDistinctCharacter) {

    int windowStart = 0;
    int result =Integer.MIN_VALUE;
    HashMap<Character, Integer> charCountMap = new HashMap<>();

    for (int windowEnd = 0; windowEnd < inputString.length(); windowEnd++) {
      if (charCountMap.get(inputString.charAt(windowEnd)) != null) {
        charCountMap.put(inputString.charAt(windowEnd),
            charCountMap.get(inputString.charAt(windowEnd)) + 1);
      } else {
        charCountMap.put(inputString.charAt(windowEnd),
            charCountMap.get(inputString.charAt(windowEnd)));
      }
      while(charCountMap.size()>noOfDistinctCharacter){
        result = Math.max(result, windowEnd-windowStart+1);
        if(charCountMap.get(inputString.charAt(windowStart))!=null && charCountMap.get(inputString.charAt(windowStart))>0){
          charCountMap.put(inputString.charAt(windowStart), charCountMap.get(inputString.charAt(windowStart)-1));
        }
        windowStart++;
      }
    }
    return result;
  }

}
