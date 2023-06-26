import java.util.Arrays;

public class shuffle {

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 4, 3, 2, 1 };
    int n = 4;
    int j = 0;
    int[] ans = new int[nums.length];
    if (nums.length == 0) {
      System.out.println(ans);
    }
    // ans[0] = nums[0];
    // ans[0 + 1] = nums[0 + 3];
    // ans[2] = nums[1];
    // ans[2 + 1] = nums[1 + 3];
    // ans[4] = nums[2];
    // ans[4 + 1] = nums[2 + 3];
    for (int i = 0; i < nums.length; i = i + 2) {
      ans[i] = nums[j];
      ans[i + 1] = nums[j + n];
      j++;
    }
    // for (int i = 0; i < n; i++) {
    //   ans[i] = nums[i];
    //   ans[i + 1] = nums[i + 3];
    // }

    System.out.println(Arrays.toString(ans));
  }
}
