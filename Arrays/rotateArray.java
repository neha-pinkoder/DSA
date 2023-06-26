import java.util.Arrays;

public class rotateArray {

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
    int k = 3;
    int end_value = k;
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, (k - 1));
    reverse(nums, k, nums.length - 1);
    System.out.println(Arrays.toString(nums));
  }

  public static int[] reverse(int[] nums, int start, int end) {
    // int j = nums.length - 1;
    // for (int i = start; i <= end / 2; i++) {
    //   swap(nums, i, j);
    //   j--;
    // }
    while (end > start) {
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
      start++;
      end--;
    }
    return nums;
  }

  public static int[] swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
    return nums;
  }
}
