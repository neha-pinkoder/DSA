public class peakIndexInMountainArray {

  public static void main(String[] args) {
    int[] arr = { 0, 1, 2, 3, 4, 5, 6, 5, 3, 2, 1 };
    System.out.println(binary_search(arr, 0, arr.length - 1));
  }

  static int binary_search(int[] nums, int start, int end) {
    while (start < end) {
      int mid = (start + end) / 2;
      if (nums[mid] < nums[mid + 1]) {
        start = mid + 1;
      } else {
        end = mid;
      }
    }
    return start;
  }
}
