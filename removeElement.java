import java.util.Arrays;

public class removeElement {

  public static void main(String[] args) {
    int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
    int n = nums.length - 1;
    int val = 2;
    int value = 0;
    int count = 0;
    for (int num : nums) {
      if (num == val) {
        count++;
      }
    }
    for (int j = 0; j < count; j++) {
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] == val) {
          value = i;
          break;
        }
      }
      swap(nums, value, n);
      n--;
    }
    System.out.println(Arrays.toString(nums));
  }

  static int[] swap(int[] nums, int value, int notValue) {
    int temp = nums[value];
    nums[value] = nums[notValue];
    nums[notValue] = temp;
    return nums;
  }
}
