import javax.print.attribute.standard.Sides;

public class ceilingOfANumber {

  public static void main(String[] args) {
    int[] arr = { 2, 3, 5, 9, 14, 16, 19 };
    int target = 5;
    int answer = binary_search(arr, 0, arr.length - 1, target);
    System.out.println(answer);
  }

  static int binary_search(int[] nums, int start, int end, int target) {
    for (int i = start; i <= end; i++) {
      if (nums[(start + end) / 2] == target) {
        return nums[(start + end) / 2];
      } else if ((nums[(start + end) / 2]) < target) {
        start = ((start + end) / 2) + 1;
        binary_search(nums, start, end, target);
      } else {
        end = ((start + end) / 2) - 1;
        binary_search(nums, start, end, target);
      }
    }
    return nums[(start + end) / 2 + 1];
  }
}
