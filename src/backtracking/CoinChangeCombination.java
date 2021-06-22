package backtracking;

import java.math.BigInteger;

public class CoinChangeCombination {
    static int[] denominations = {2, 3, 5, 6};
    static int totalAmount = 10;

    public static void main(String[] args) {
        int totalAmount = 10;
        boolean arr[] = new boolean[4];
        //expected solution ={[2,2,2,2,2],[2,2,3,3],[2,3,5],[2,2,6]}
        findCoinCombination(arr, totalAmount, "", 0);
    }

    private static void findCoinCombination(boolean[] arr, int totalAmount, String ans, int lastDenom) {
        if (totalAmount <= 0) {
            //CoinChangeCombination.totalAmount = 10;
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = true;
            lastDenom = denominations[i];
            // ans = ans + lastDenom + " ";
            totalAmount = totalAmount - lastDenom;
            System.out.println(totalAmount + " " + i);
            findCoinCombination(arr, totalAmount, ans + lastDenom+" ", lastDenom);
            arr[i] = false;

        }


    }
}

