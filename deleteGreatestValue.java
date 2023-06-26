import java.util.Arrays;

public class deleteGreatestValue {

  public static void main(String[] args) {
    int[][] grid = { { 1, 2, 4 }, { 3, 3, 1 } };
    int n = grid[0].length;
    int max = 0, final_max = 0;
    int save_i = 0, save_j = 0;
    for (int k = 0; k < n; k++) {
      max = 0;
      final_max = 0;
      for (int i = k; i < grid.length; i++) {
        max = 0;
        for (int j = 0; j < n; j++) {
          if (grid[i][j] > max) {
            max = grid[i][j];
            save_i = i;
            save_j = j;
          }
        }
        grid[save_i][save_j] = 0;
        if (max > final_max) {
          final_max = max;
        }
        System.out.println(final_max);
      }
    }
    for (int[] is : grid) {
      System.out.println(Arrays.toString(is));
    }
  }
}
