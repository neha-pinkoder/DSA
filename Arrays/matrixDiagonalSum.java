public class matrixDiagonalSum {

  public static void main(String[] args) {
    int[][] matrix = {
      { 1, 1, 1, 1 },
      { 1, 1, 1, 1 },
      { 1, 1, 1, 1 },
      { 1, 1, 1, 1 },
    };
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        if (i == j) {
          System.out.println(matrix[i][j]);
          sum += matrix[i][j];
        }
      }
    }
    int j = matrix.length;
    for (int i = 0; i < matrix.length; i++) {
      j--;
      if (i != j) {
        System.out.println(matrix[i][j]);
        sum += matrix[i][j];
      }
    }
    System.out.println(sum);
  }
}
