import java.lang.reflect.Array;
import java.util.Arrays;

public class arraySwap {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    System.out.println(Arrays.toString(arr));
    swap(arr, 0, 4);
    System.out.println(Arrays.toString(arr));
  }

  static int[] swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    return arr;
  }
}
