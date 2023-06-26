import java.util.Arrays;

public class spiralMatrix_II {

  public static void main(String[] args) {
    int n = 4;
    int[][] matrix = new int[n][n];
    // int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int left = 0;
    int top = 0;
    int bottom = matrix.length - 1;
    int right = matrix[0].length - 1;
    int target = n * n;
    int num = 1;
    while (left <= right && top <= bottom && num <= target) {
      for (int i = left; i <= right; i++) {
        matrix[top][i] = num;
        num++;
      }
      top++;
      if (num <= target) {
        for (int i = top; i <= bottom; i++) {
          matrix[i][right] = num;
          num++;
        }
      }
      right--;
      if (left <= right && num <= target) {
        for (int i = right; i >= left; i--) {
          matrix[bottom][i] = num;
          num++;
        }
      }
      bottom--;
      if (top <= bottom && num <= target) {
        for (int i = bottom; i >= top; i--) {
          matrix[i][left] = num;
          num++;
        }
      }
      left++;
    }
    for (int j = 0; j < matrix.length; j++) {
      System.out.println(Arrays.toString(matrix[j]));
    }
  }
}
