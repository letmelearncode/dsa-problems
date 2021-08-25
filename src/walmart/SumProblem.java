package walmart;

// {3, 5, 8, 9, 10, 19, 21}

import java.util.List;

//sum =10, {3,5}
public class SumProblem {

  public static void main(String[] args) {
    int[] arr = {1, 3, 7, 8, 9, 10, 19, 21};
    //{12, 15, 19,21,30,35, 57, 100}//55
    int sum = 12;
    calculateSumPair(arr, sum);
  }

  public static void getSumOfSqaure(List<Integer> integers) {
   /* integers.stream()
        .filter(s-> s%2!=0)
        .map(s-> s*s);*/
  }

  private static void calculateSumPair(int[] arr, int sum) {
    int front = 0;
    int end = arr.length - 1;
    //int total = arr[front]+arr[end];
    //int i=0;
    int minDiff = 0;

    int min = 0;
    while (front < end) {
      int total = arr[front] + arr[end];
      int diffFromSum = total - sum;
      if (total > sum) {
        //total = front+end;
        if (front < end - 1) {
          break;
        }
        end--;


      } else if (total == sum) {
        break;
      } else {
        if (front + 1 < end) {
          break;
        }
        front++;

      }

    }
    System.out.println("Pair is " + arr[front] + " : " + arr[end]);
  }


}
