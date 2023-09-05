public class binarySearch {

  public static void main(String[] args) {
    int[] nums = { 6, 5, 4, 3, 2, 1, 0 };
    int target = 0;
    System.out.println(binary_search(nums, 0, nums.length - 1, target));
  }

  static int binary_search(int[] nums, int start, int end, int target) {
    for (int i = start; i <= end; i++) {
      if (nums[(start + end) / 2] == target) {
        return ((start + end) / 2);
      } else if ((nums[(start + end) / 2]) < target) {
        end = ((start + end) / 2) - 1;
        binary_search(nums, start, end, target);
      } else {
        start = ((start + end) / 2) + 1;
        binary_search(nums, start, end, target);
      }
    }
    return (nums[(start + end) / 2]);
  }
}
