import java.util.Arrays;

public class removeDuplicates {

  public static void main(String[] args) {
    int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
    if (nums == null || nums.length == 0) {
      System.out.println("Null");
    }
    int unique_number = nums[0];
    System.out.println(unique_number);
    int swap_pointer = 1;
    int check_pointer = 1;

    for (int i = 1; i < nums.length; i++) {
      if (unique_number != nums[i]) {
        unique_number = nums[i];
        swap(nums, swap_pointer, i);
        System.out.println(unique_number);
        swap_pointer++;
      }
    }
    System.out.println(Arrays.toString(nums));
  }

  public static int[] swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
    return nums;
  }
}


