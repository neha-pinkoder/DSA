public class checkSortRotate {

  public static void main(String[] args) {
    int[] arr = { 2, 1, 3, 4 };
    int min = 0;
    // for (int i : arr) {
    //   if (arr[min] > i) {
    //     min = i;
    //   }
    // }
    for (int i = 0; i < arr.length; i++) {
      if (arr[min] > i) {
        min = i;
      }
    }
    System.out.println(min);
    if (min == 0) {
      System.out.println(checkSorted(arr, min, arr.length - 1));
    } else {
      System.out.println(checkSorted(arr, min, arr.length - 1));
      System.out.println(checkSorted(arr, 0, min));
    }
  }

  static boolean checkSorted(int[] arr, int start, int end) {
    boolean flag = true;
    if (start == end - 1) {
      return flag;
    } else {
      for (int i = start; i < end; i++) {
        if (arr[i + 1] - arr[i] >= 0) {
          flag = true;
        } else {
          flag = false;
          break;
        }
      }
      return flag;
    }
  }
}
