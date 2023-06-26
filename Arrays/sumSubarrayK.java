public class sumSubarrayK {

  public static void main(String[] args) {
    int[] nums = { -1, 2, 3 };
    int k = 5;
    int sum = 0;
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        sum += j;
        if (sum == k) {
          if (count > count) count = j - 1;
        }
      }
    }
    System.out.println(count);
  }
}
