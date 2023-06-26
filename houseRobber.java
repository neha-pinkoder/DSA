public class houseRobber {

  public static void main(String[] args) {
    int[] nums = { 4, 1, 2, 7, 5, 3, 1 };
    int n = nums.length;
    int max = 0;
    int sum = 0;
    int jump = 2;
    if (nums.length == 2) {
      if (nums[0] > nums[1]) {
        max = nums[0];
      } else max = nums[1];
    }
    for (int i = 0; i < nums.length; i++) {
      for (int k = 0; k < nums.length; k++) {
        sum = 0;
        for (int j = k; j < nums.length; j += jump) {
          sum += nums[j];
          if (sum > max) {
            max = sum;
          }
        }
      }
      jump++;
    }
    System.out.println(max);
  }
}
