public class arrayMax {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 100, 4, 5 };

    System.out.println("Maximum element is " + max(arr));
  }

  static int max(int[] arr) {
    int max = 0;
    for (int i : arr) {
      if (arr[max] < i) {
        max = i;
      }
    }
    return arr[max];
  }
}
