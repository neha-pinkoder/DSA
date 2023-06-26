public class majorityElement {

  public static void main(String[] args) {
    int[] nums = { 3, 3, 4 };
    int major_element = 0;
    int majority = 0;
    int temp = 0;
    for (int i = 0; i < nums.length; i++) {
      int count = 0;
      for (int j = 0; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          count++;
          temp = nums[j];
        }
      }
      if (majority < count) {
        majority = count;
        major_element = temp;
      }
    }
    System.out.println(major_element);
  }
}
