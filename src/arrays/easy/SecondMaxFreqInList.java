package arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class SecondMaxFreqInList {

  public static void main(String[] args) {
   // int nums[] = {1, 2, 2, 3, 3, 3};
    int nums[] = {4, 4, 5, 5, 6, 7};
    System.out.println(secondMostFrequentElement(nums));
  }

  public static int secondMostFrequentElement(int[] nums) {

    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i],map.getOrDefault(nums[i],0)+1);
    }

    int maxFreq= 0;
    int secMaxFreq = 0;
    int secEle = -1;
    int maxEle = -1;
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      int ele = entry.getKey(); // Key
      int freq = entry.getValue();
      if (freq > maxFreq) {
        secMaxFreq = maxFreq;
        maxFreq = freq;
        secEle = maxEle;
        maxEle = ele;
      } else if (secMaxFreq < freq) {
        secMaxFreq = freq;
        secEle = ele;
      } else if (maxFreq == freq) {
        maxEle = Math.min(maxEle, ele);
      } else if (secMaxFreq == freq) {
        secEle = Math.min(secEle, ele);
      }
    }

    return secEle;


  }
}

