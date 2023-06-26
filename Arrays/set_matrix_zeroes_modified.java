import java.util.Arrays;

public class set_matrix_zeroes_modified {

  public static void main(String[] args) {
    int x = 1;
    int y = 1;
    int[][] matrix = { { 1, 0 } };
    int rows = matrix[0].length;
    int cols = matrix.length;
    for (int i = 0; i < rows; i++) {
      if (matrix[0][i] == 0) {
        x = 0;
      }
    }
    for (int i = 0; i < cols; i++) {
      if (matrix[i][0] == 0) {
        y = 0;
      }
    }
    for (int i = 1; i < matrix.length; i++) {
      for (int j = 1; j < matrix.length; j++) {
        if (matrix[i][j] == 0) {
          matrix[0][j] = 0;
          matrix[i][0] = 0;
        }
      }
    }
    for (int[] is : matrix) {
      System.out.println(Arrays.toString(is));
    }
    for (int i = 1; i < matrix.length; i++) {
      for (int j = 1; j < matrix[0].length; j++) {
        if (matrix[0][j] == 0) {
          matrix[i][j] = 0;
        }
        if (matrix[i][0] == 0) {
          matrix[i][j] = 0;
        }
      }
    }
    for (int[] is : matrix) {
      System.out.println(Arrays.toString(is));
    }
    for (int i = 0; i < matrix.length; i++) {
      if (x == 0) {
        matrix[0][i] = 0;
      }
      if (y == 0) {
        matrix[i][0] = 0;
      }
    }
    for (int[] is : matrix) {
      System.out.println(Arrays.toString(is));
    }
  }
}
