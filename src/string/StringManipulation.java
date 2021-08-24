//Input- aabbcccaaabb
//Output- a2b2c3a3b2
package string;

public class StringManipulation {

  public static void main(String[] args) {
    String input = "aabbcccaaabb";
    resultString(input);

  }

  public static void resultString(String input) {
    String output = "";
    //input.charAt(0);
    int count = 1;

    for (int i = 0; i < input.length() - 1; i++) {
      if (input.charAt(i) == input.charAt(i + 1)) {
        count++;
        //output = output + count
      } else {
        output = output + input.charAt(i) + count;
        count = 1;
      }


    }

    System.out.println(output);
  }
}