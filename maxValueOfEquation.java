public class maxValueOfEquation {

  public static void main(String[] args) {
    int[][] matrix = { { -19, 9 }, { -15, -19 }, { -5, -8 } };
    int k = 10;
    int temp = 0;
    int max, min;
    int equation = 0;
    int final_max = -1000;
    for (int i = 0; i < matrix.length - 1; i++) {
      //   System.out.println(matrix[temp][0]);
      //   System.out.println(matrix[i + 1][0]);
      if (matrix[temp][0] > matrix[i + 1][0]) {
        max = matrix[temp][0];
        min = matrix[i + 1][0];
      } else {
        min = matrix[temp][0];
        max = matrix[i + 1][0];
      }
      if ((max - min) <= k) {
        equation = matrix[temp][1] + matrix[i + 1][1] + (max - min);
        if (equation > final_max) {
          final_max = equation;
        }
      }
      temp = i + 1;
    }
    System.out.println(final_max);
  }
}
