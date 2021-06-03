package dsa;

public class Sorting {

    public static void main(String args[]) {

        int arr1[] = {2, 5, 8, 9, 13, 15};
        int arr2[] = {1, 7, 9, 11, 18, 21, 27, 78, 219};
        int arr3[] = {134, 11, 18, 23, 8, 187, 32};
       // System.out.println("Here");
        int[] mergedArray = mergeSort(arr3, 0, arr3.length-1);
        //int[] mergedArray = mergeSortedArrays(new int[]{5}, new int[]{4});
        //int[] mergedArray = mergeSortedArrays(arr1, arr2);
        for (int arr : mergedArray) {
            System.out.print(arr + " ");
        }


    }

    public static int[] mergeSort(int[] inputArr, int start, int end) {
        if (start==end) {
            int[] baseArr = new int[1];
            baseArr[0] = inputArr[start];
            return baseArr;
        }
        /*int start = 0;
        int end = inputArr.length - 1;*/
        int midIndex = (start + end) / 2;
        /*int[] leftArr = new int[midIndex +1];
        int indexOfBigArray = 0;
        System.out.println("printing left array");
        for (int i = 0; i < leftArr.length; i++) {
            leftArr[i] = inputArr[indexOfBigArray];
            indexOfBigArray++;
            System.out.print(leftArr[i] + " ");
        }
        System.out.println("");
        System.out.println("printing right array");
        int[] rightArr = new int[midIndex];
        for (int i = 0; i < rightArr.length; i++) {
            rightArr[i] = inputArr[indexOfBigArray];
            indexOfBigArray++;
            System.out.print(rightArr[i] + " ");
        }
        System.out.println("");*/
        int[] leftSortedArray = mergeSort(inputArr, start, midIndex);
        int[] rightSortedArray = mergeSort(inputArr, midIndex + 1, end);
        return mergeSortedArrays(leftSortedArray, rightSortedArray);
    }


    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int sizeOfMergedArray = arr1.length + arr2.length;
        int[] mergedArray = new int[sizeOfMergedArray];
        int indexOfArray1 = 0, indexOfArray2 = 0;
        int indexOfMergedArray = 0;
        for (int i = 0; i < sizeOfMergedArray; i++) {

            if (indexOfArray1 < arr1.length && indexOfArray2 < arr2.length) {

                if (arr1[indexOfArray1] <= arr2[indexOfArray2]) {
                    mergedArray[i] = arr1[indexOfArray1];
                    indexOfArray1++;
                } else {
                    mergedArray[i] = arr2[indexOfArray2];
                    indexOfArray2++;
                }
                indexOfMergedArray = i + 1;

            }
        }
        if (indexOfArray2 == arr2.length) {
            for (int j = indexOfArray1; j < arr1.length; j++) {
                mergedArray[indexOfMergedArray] = arr1[j];
                indexOfMergedArray++;
            }
        }
        if (indexOfArray1 == arr1.length) {
            for (int j = indexOfArray2; j < arr2.length; j++) {
                mergedArray[indexOfMergedArray] = arr2[j];
                indexOfMergedArray++;
            }
        }
//        System.out.println("Printing merged sorted array");
//        for (int i = 0; i < mergedArray.length; i++) {
//            System.out.println(mergedArray[i] + " ");
//        }
//        System.out.println("");
        return mergedArray;
    }

}


//[2,5,8,9,13]
//[1,7,9,11]