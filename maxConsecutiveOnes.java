public class maxConsecutiveOnes {

  public static void main(String[] args) {
    int[] nums = { 1, 1, 0, 1, 1, 1 };
    int max = 0;
    int counter = 0;
    for (int i : nums) {
      if (i == 1) {
        counter++;
      } else counter = 0;
      if (counter > max) {
        max = counter;
      }
    }
    System.out.println(max);
  }
}
