package arrays.easy;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * <p>
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 */
public class ValidAnagram {

  public static void main(String[] args) {
    ValidAnagram va = new ValidAnagram();
    String s = "anagram";
    String t = "nagaram";
    System.out.println(va.isAnagram(s, t));
  }

  private boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    int[] charCount = new int[26];
    for (int i = 0; i < s.length(); i++) {
      charCount[s.charAt(i) - 'a']++;
      charCount[t.charAt(i) - 'a']--;
    }
    for (int i = 0; i < 26; i++) {
      if (charCount[i] != 0) {
        return false;
      }
    }
    return true;
  }
}
