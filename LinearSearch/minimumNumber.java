package LinearSearch;

public class minimumNumber {

  public static void main(String[] args) {
    int[] nums = { 18, 12, -7, 3, 14, 100 };
    int max = nums[0];
    int min = nums[0];
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
      } else if (nums[i] < min) {
        min = nums[i];
      }
    }
    System.out.println("Minimum" + min);
    System.out.println("Maximum" + max);
  }
}
