package LinearSearch;

public class evenNumberOfDIgits {

  public static void main(String[] args) {
    int count = 0, total_count = 0;
    int[] nums = { 1, 22, 33 };
    for (int i : nums) {
      count = 0;
      while (i != 0) {
        i /= 10;
        count++;
      }
      if (count % 2 == 0) {
        total_count++;
      }
    }
    System.out.println(total_count);
  }
}
