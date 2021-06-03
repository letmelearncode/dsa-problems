package sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] inputArray = {24, 1, 90, 8, 2, 1, 7, 3};
        quickSort(inputArray, 0, inputArray.length - 1);
        for (int i : inputArray) {
            System.out.print(i + " ");
        }
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int left = low;
        int right = high;
        int mid = (low + high) / 2;
        int pivot = arr[mid];
        while (low <= high) {
            while (pivot > arr[low]) {
                low++;
            }
            while (pivot < arr[high]) {
                high--;
            }
            if (low <= high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                high--;
                low++;
            }

            quickSort(arr, low, right);
            quickSort(arr, left, high);
        }
    }
}
