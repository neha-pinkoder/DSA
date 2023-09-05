public class countingBits {

  public static void main(String[] args) {
    int[] ans = countBits(2);
    for (int n : ans) {
      System.out.println(n);
    }
  }

  static int[] countBits(int n) {
    int[] ans = new int[n + 1];
    for (int i = 0; i <= n; i++) {
      int count = 0;
      String bin = Integer.toBinaryString(i);
      for (char ch : bin.toCharArray()) {
        if (ch == '1') {
          count++;
        }
      }
      ans[i] = count;
    }
    return ans;
  }
}
