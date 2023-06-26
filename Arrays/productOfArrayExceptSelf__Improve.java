import java.util.Arrays;

public class productOfArrayExceptSelf__Improve {

  public static void main(String[] args) {
    int[] nums = { 1, 2, 0, 0 };
    int flag = 0;
    int allProduct = 1;
    for (int i : nums) {
      if (i == 0) {
        flag++;
        continue;
      }
      allProduct *= i;
    }

    for (int i = 0; i < nums.length; i++) {
      if (flag == 0) {
        nums[i] = allProduct / nums[i];
      } else if (flag == 1) {
        if (nums[i] == 0) {
          nums[i] = allProduct;
        } else nums[i] = 0;
      } else nums[i] = 0;
    }

    System.out.println(Arrays.toString(nums));
  }
}
