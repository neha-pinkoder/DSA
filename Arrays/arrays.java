import java.util.Arrays;
import java.util.Scanner;

public class arrays {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] arr2D = new int[3][3];
    for (int i = 0; i < arr2D.length; i++) {
      for (int j = 0; j < arr2D[i].length; j++) {
        arr2D[i][j] = sc.nextInt();
      }
    }

    // for (int i = 0; i < arr2D.length; i++) {
    //   System.out.println(Arrays.toString(arr2D[i]));
    // }

    for (int[] i : arr2D) {
      System.out.println(Arrays.toString(i));
    }
  }
}
