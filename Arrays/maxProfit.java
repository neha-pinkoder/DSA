public class maxProfit {

  public static void main(String[] args) {
    int[] prices = { 2, 4, 1 };
    int min = prices[0];
    int temp = 0;
    int profit = 0, profit_temp = 0;

    for (int i = 0; i < prices.length; i++) {
      if (prices[i] <= min) {
        min = prices[i];
        temp = i;
      }
    }
    if (temp == prices.length - 1) {
      System.out.println(0);
    }
    profit = min;
    for (int i = temp + 1; i < prices.length; i++) {
      if (prices[i] > min) {
        profit_temp = prices[i] - min;
      }
      if (profit_temp > profit) {
        profit = profit_temp;
      }
    }
    System.out.println(profit);
  }
}
