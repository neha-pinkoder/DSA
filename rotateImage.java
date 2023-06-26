import java.util.Arrays;

public class rotateImage {

  public static void main(String[] args) {
    int[][] matrix = { { 1, -1, 1 }, { 2, 1, 0 }, { 1, 2, 3 } };
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        if (i != 0) {
          if (matrix[i][j] < 0) {
            matrix[i][j] += ((-matrix[j][i]) % 1000) * 1000;
            matrix[i][j] *= -1;
          } else matrix[i][j] += ((matrix[j][i]) % 1000) * 1000;
        } else {
          if (matrix[i][j] < 0) {
            matrix[i][j] += (-matrix[j][i]) * 1000;
            matrix[i][j] *= -1;
          } else matrix[i][j] += (matrix[j][i]) * 1000;
        }
      }
    }

    for (int[] is : matrix) {
      int j = matrix.length - 1;
      for (int i = 0; i < is.length; i++) {
        is[i] /= 1000;
      }
      for (int i = 0; i < is.length / 2; i++) {
        int temp = is[i];
        is[i] = is[j];
        is[j] = temp;
        j--;
      }
    }
    for (int[] is : matrix) {
      System.out.println(Arrays.toString(is));
    }
  }
}
