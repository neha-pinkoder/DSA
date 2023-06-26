import java.util.*;

public class set_matrix_zeroes {

  public static void main(String[] args) {
    int[][] matrix = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
    // List<Integer> cols = new ArrayList<>();
    // List<Integer> rows = new ArrayList<>();
    Set<Integer> cols = new HashSet<Integer>();
    Set<Integer> rows = new HashSet<Integer>();
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == 0) {
          rows.add(i);
          cols.add(j);
        }
      }
    }
    for (Integer row : rows) {
      for (int i = 0; i < matrix[0].length; i++) {
        matrix[row][i] = 0;
      }
    }
    for (Integer col : cols) {
      for (int i = 0; i < matrix.length; i++) {
        matrix[i][col] = 0;
      }
    }
    System.out.println(cols);
    System.out.println(rows);
    for (int[] is : matrix) {
      System.out.println(Arrays.toString(is));
    }
  }
}
