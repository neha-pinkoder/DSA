import java.util.Arrays;

public class twoSum {

  public static void main(String[] args) {
    int[] nums = { 3, 2, 4 };
    int target = 5;
    int sum = 0;
    int[] ans = new int[2];
    for (int i = 0; i < nums.length; i++) {
      sum = 0;
      for (int j = 0; j < nums.length; j++) {
        if (i != j) {
          sum = nums[i] + nums[j];
        }
        if (sum == target) {
          ans[0] = i;
          ans[1] = j;
          break;
        }
      }
    }
    System.out.println(Arrays.toString(ans));
  }
}
