public class searchInRotatedPractice {

  public static void main(String[] args) {
    int[] nums = { 0, 1, 2, 3 };
    System.out.println(pivot(nums));
  }

  static int pivot(int[] nums) {
    int start = 0;
    int end = nums.length - 1;
    while (start < end) {
      int mid = (start + end) / 2;
      if (nums[mid] > nums[mid + 1]) {
        return nums[mid];
      } else if (nums[mid] < nums[mid + 1] && nums[mid] < nums[mid - 1]) {
        end = mid - 1;
      } else if (nums[mid] < nums[mid + 1] && nums[mid] > nums[mid - 1]) {
        start = mid + 1;
      }
    }
    return nums[start];
  }
}
