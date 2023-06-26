public class checkIfSorted {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 10, 5 };
    int flag = 0;
    for (var i = 0; i < arr.length - 1; i++) {
      if (arr[i] - arr[i + 1] == 1) {
        flag = 0;
      } else {
        flag = 1;
        break;
      }
    }
    if (flag == 0) {
      System.out.println("Sorted");
    } else System.out.println("Not sorted");
  }
}
