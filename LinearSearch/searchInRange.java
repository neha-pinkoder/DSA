package LinearSearch;

public class searchInRange {

  public static void main(String[] args) {
    int[] nums = { 18, 12, -7, 3, 14, 28 };
    int target = 3;
    for (int i = 1; i < 5; i++) {
      if (target == nums[i]) {
        System.out.println("Found");
      }
    }
  }
}
