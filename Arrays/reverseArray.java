import java.util.Arrays;

public class reverseArray {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    reverseInPlace(arr);
  }

  static void reverse(int[] arr) {
    int[] temp = new int[arr.length];
    for (int i = 0; i < temp.length; i++) {
      temp[i] = arr[temp.length - 1 - i];
    }

    System.out.println(Arrays.toString(temp));
  }

  static void reverseInPlace(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
    System.out.println(Arrays.toString(arr));
  }
}
