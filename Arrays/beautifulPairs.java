public class beautifulPairs {

  public static void main(String[] args) {
    int[] nums = { 31, 25, 72, 79, 74 };
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      int first = nums[i];
      while (first > 9) {
        first /= 10;
      }
      for (int j = i + 1; j < nums.length; j++) {
        if (gcd(first, nums[j] % 10) == 1) {
          count++;
        }
      }
    }
    System.out.println(count);
  }

  static int gcd(int x, int y) {
    int gcd_number = 0;
    for (int i = Math.max(x, y); i > 0; i--) {
      if (x % i == 0 && y % i == 0) {
        gcd_number++;
      }
    }
    return gcd_number;
  }
}
