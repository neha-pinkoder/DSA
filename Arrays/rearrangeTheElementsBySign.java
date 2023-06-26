import java.util.Arrays;

public class rearrangeTheElementsBySign {

  public static void main(String[] args) {
    int[] nums = { -1, 1 };
    int[] result = new int[nums.length];
    int positive = 0, negative = 1;
    for (int i = 0; i < result.length; i++) {
      if (nums[i] > 0) {
        result[positive] = nums[i];
        positive += 2;
      } else {
        result[negative] = nums[i];
        negative += 2;
      }
    }
    System.out.println(Arrays.toString(result));
  }
}
