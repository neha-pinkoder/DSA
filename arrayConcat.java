import java.util.Arrays;

public class arrayConcat {

  public static void main(String[] args) {
    int[] nums = { 1, 2, 1 };
    int[] ans = new int[(nums.length * 2)];
    System.out.println(ans.length);
    for (int i = 0; i < nums.length; i++) {
      ans[i] = nums[i];
      ans[i + nums.length] = nums[i];
    }
    System.out.println(Arrays.toString(ans));
  }
}
