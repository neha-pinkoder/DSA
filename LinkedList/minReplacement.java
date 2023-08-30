public class minReplacement {

  public static void main(String[] args) {
    int[] nums = { 3, 9, 3 };
    System.out.println(minimumReplacement(nums));
  }

  static long minimumReplacement(int[] nums) {
    int n = nums.length;
    long ans = 0;
    int prev = nums[n - 1];
    for (int i = n - 2; i >= 0; i--) {
      if (nums[i] > prev) {
        int k = (int) Math.ceil(nums[i] / (double) prev);
        ans += (k - 1);
        prev = nums[i] / k;
      } else {
        prev = nums[i];
      }
    }
    return ans;
  }
}
