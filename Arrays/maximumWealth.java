public class maximumWealth {

  public static void main(String[] args) {
    int[][] accounts = { { 1, 2, 3 }, { 3, 2, 1 } };
    int maxWealth = 0;
    for (int i = 0; i < accounts.length; i++) {
      int total = 0;
      for (int j : accounts[i]) {
        total += j;
      }
      if (total > maxWealth) {
        maxWealth = total;
      }
    }
    System.out.println(maxWealth);
  }
}
