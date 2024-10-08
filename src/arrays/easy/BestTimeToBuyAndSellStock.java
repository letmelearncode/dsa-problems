package arrays.easy;
/**
Calculate Best time to buy or sell stock
**/
public class BestTimeToBuyAndSellStock {

  public static void main(String[] args) {
    int[] prices = {7, 6, 4, 3, 1};
    BestTimeToBuyAndSellStock bs = new BestTimeToBuyAndSellStock();
    System.out.println(bs.getMaxProfit(prices));

  }

  // Brute Force
  private int getMaxProfit(int[] prices) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < prices.length; i++) {
      for (int j = i + 1; j < prices.length; j++) {
        if (prices[j] - prices[i] > max) {
          max = prices[j] - prices[i];
        }
      }
    }
    if (max < 0) {
      return 0;
    }
    return max;
  }

  //Optimal Approach : Time Complexity - O(N), Space Complexity - O(N)
  private int getMaxProfitOptimal(int[] prices) {
    return 0;
  }

  //Optimal Approach 2 : Time Complexity - O(N), Space Complexity - O(1)
  private int getMaxProfitSuperOptimal(int[] prices) {
    int minSoFar = Integer.MAX_VALUE;
    int maxProfit = Integer.MIN_VALUE;
    for (int i = 0; i < prices.length; i++) {
      if (minSoFar > prices[i]) {
        minSoFar = prices[i];
      }
      if(maxProfit > prices[i]- minSoFar)
        maxProfit = prices[i]- minSoFar;
    }

    return maxProfit;
  }
}
