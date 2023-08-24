import java.io.*;
import java.util.*;

public class prison {

  public static void main(String[] args) {
    int n = 3;
    int x = 1;
    int z = 2;
    int[] arr = { 3, 2, 4 };
    int k = 5;
    long[] dp = new long[k + 1];

    for (int i = 1; i <= k; i++) {
      dp[i] = dp[i - 1] + x; // Earn x units of gold from mining

      for (int j = 0; j < n; j++) {
        if (i >= arr[j]) {
          dp[i] = Math.max(dp[i], dp[i - arr[j]] + (x + j * z));
        }
      }
    }
    for

    System.out.println(dp[k]);
  }
}
