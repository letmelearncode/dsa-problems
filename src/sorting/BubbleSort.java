package sorting;

import java.util.Comparator;
import java.util.List;

public class BubbleSort {


  protected static <T> void bubbleSort(List<T> arr, Comparator<T> comparator) {
    for (int i = 0; i < arr.size() - 1; i++) {
      for (int j = 0; j < arr.size() - i - 1; j++) {
        if (comparator.compare(arr.get(j), arr.get(j + 1)) > 0) {
          T temp = arr.get(j);
          arr.set(j, arr.get(j + 1));
          arr.set(j + 1, temp);
        }
      }
    }
  }
}
