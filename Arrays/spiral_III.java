import java.util.Arrays;

public class spiral_III {

  public static void main(String[] args) {
    int[][] matrix = { { 7, 8, 9 }, { 6, 1, 2 }, { 5, 4, 3 } };
    int rows = 3;
    int cols = 3;
    int rStart = 1;
    int cStart = 1;
    int[][] ans = new int[rows * cols][2];
    ans[0][0] = rStart;
    ans[0][1] = cStart;
    // cStart++;
    // ans[1][0] = rStart;
    // ans[1][1] = cStart;
    // rStart++;
    // ans[2][0] = rStart;
    // ans[2][1] = cStart;
    // cStart--;
    // ans[3][0] = rStart;
    // ans[3][1] = cStart;
    // cStart--;
    // ans[4][0] = rStart;
    // ans[4][1] = cStart;
    // rStart--;
    // ans[5][0] = rStart;
    // ans[5][1] = cStart;
    // rStart--;
    // ans[6][0] = rStart;
    // ans[6][1] = cStart;
    // cStart++;
    // ans[7][0] = rStart;
    // ans[7][1] = cStart;
    // cStart++;
    // ans[8][0] = rStart;
    // ans[8][1] = cStart;
    int left = 0;
    int right = cols - 1;
    int top = 0;
    int bottom = rows - 1;
    while (left < right && top < bottom) {
      for (int i = bottom; i < right; i++) {}
    }
    for (int[] is : ans) {
      System.out.println(Arrays.toString(is));
    }
  }
}
