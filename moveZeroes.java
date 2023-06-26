import java.util.Arrays;

public class moveZeroes {

  public static void main(String[] args) {
    int[] nums = { 0, 1, 3, 4 };
    int sum = 0;
    int n = nums.length;
    int total_sum = ((n * (n + 1)) / 2);
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
    }
    System.out.println(total_sum);
    System.out.println(sum);
    System.out.println(total_sum - sum);
    // for (int i = 1; i < nums.length; i++) {
    //   int temp = nums[i];
    //   nums[i] = nums[i - 1];
    //   nums[i - 1] = temp;
    // }
    System.out.println(Arrays.toString(nums));
  }
}
