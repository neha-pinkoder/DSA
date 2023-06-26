public class singleNumber {

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 3, 1 };
    int sum = 0;
    int ans = 0; //since XOR with 0 returns same number
    for (int i = 0; i < nums.length; i++) {
      ans ^= nums[i]; // ans = (ans) XOR (array element at i)
    }
    System.out.println(ans);
    // int count = 0;
    // for (int i = 0; i < nums.length; i++) {
    //   count = 0;
    //   for (int j = 0; j < nums.length; j++) {
    //     if (nums[i] == nums[j]) {
    //       count++;
    //     }
    //   }
    //   if (count == 1) {
    //     System.out.println(nums[i]);
    //     break;
    //   }
    // }
  }
}
