public class infiniteArray {

  public static void main(String[] args) {
    int[] nums = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int target = 8;
    System.out.println(binary_search(nums, 0, 1, target));
  }

  static int binary_search(int[] nums, int start, int end, int target) {
    while (start < end) {
      if (nums[(start + end) / 2] == target) {
        return (nums[(start + end) / 2]);
      } else if ((nums[(start + end) / 2]) < target) {
        start = ((start + end) / 2) + 1;
      } else {
        end = ((start + end) / 2) - 1;
      }
    }
    return nums[(start + end) / 2];
  }
}
