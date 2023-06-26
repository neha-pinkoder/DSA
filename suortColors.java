import java.util.Arrays;

public class suortColors {

  public static void main(String[] args) {
    int[] nums = { 0, 0 };
    int zero = 0, one = 0, two = 0;
    for (int i : nums) {
      if (i == 0) {
        zero++;
      } else if (i == 1) {
        one++;
      } else if (i == 2) {
        two++;
      }
    }
    for (int i = 0; i < zero; i++) {
      nums[i] = 0;
    }
    one += zero;
    for (int i = zero; i < one; i++) {
      nums[i] = 1;
    }
    two += one;
    for (int i = one; i < two; i++) {
      nums[i] = 2;
    }
    System.out.println(Arrays.toString(nums));
  }
}
