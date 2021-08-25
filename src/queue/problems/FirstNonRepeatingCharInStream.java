package queue.problems;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * Find out first non repeating character in a stream of characters
 *
 * Input  - c b a b c a  d b  d x Output - c c c c a -1 d d -1 x
 */
public class FirstNonRepeatingCharInStream {

  public static void main(String[] args) {
    char[] sequence = {'c', 'b', 'a', 'b', 'c', 'a', 'd', 'b', 'd', 'x'};

    //printFirstNonRepeatingChar(sequence);
    printOutput(sequence);


  }

  /**
   * Queue based approach with time complexity as 0(n);
   */
  private static void printOutput(char[] sequence) {
    Queue<Character> queue = new LinkedList<>();
    Map<Character, Integer> map = new HashMap<>();
    for (Character character : sequence) {
      queue.add(character);
      if (map.containsKey(character)) {
        map.put(character, map.get(character) + 1);
      } else {
        map.put(character, 1);
      }

      while (!queue.isEmpty()) {
        char characterAtHead = queue.peek();
        if (map.get(characterAtHead) == 1) {
          System.out.print(queue.peek() + " ");
          break;
        } else {
          queue.remove();
        }
      }
      if (queue.isEmpty()) {
        System.out.print("-1 ");
      }
    }

  }

  /**
   * Brute force approach with time complexity is 0(n^2) due to while loop
   */
  private static void printFirstNonRepeatingChar(char[] sequence) {
    Map<Character, Integer> map = new HashMap<>();
    StringBuilder stream = new StringBuilder();

    for (char character : sequence) {
      stream.append(character);
      if (map.containsKey(character)) {
        map.put(character, map.get(character) + 1);
      } else {
        map.put(character, 1);
      }
      int i = 0;
      while (i < stream.length()) {
        if (map.get(stream.charAt(i)) == 1) {
          System.out.print(stream.charAt(i));
          break;
        } else if (map.get(stream.charAt(i)) > 1) {
          i++;
          if (i == stream.length()) {
            System.out.print("-1");
          }
        }
      }
    }
  }
}



