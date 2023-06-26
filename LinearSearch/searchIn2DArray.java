package LinearSearch;

public class searchIn2DArray {

  public static void main(String[] args) {
    int[][] matrix = { { 1, 2, 3, 4 }, { 1, 34, 5 }, { 1, 2 }, { 1, 2, 4, 5 } };
    int target = 34;
    for (int[] is : matrix) {
      for (int is2 : is) {
        if (target == is2) {
          System.out.println("Found");
        }
      }
    }
  }
}
