import java.util.Arrays;

public class firstAndLastPosition {

  public static void main(String[] args) {
    int[] nums = { 2, 2 };
    int target = 2;
    System.out.println((binary_search_first(nums, 0, nums.length - 1, target)));
    System.out.println((binary_search_last(nums, 0, nums.length - 1, target)));
  }

  static int binary_search_first(int[] nums, int start, int end, int target) {
    int ans = -1;
    while (start < end) {
      if (nums[(start + end) / 2] == target) {
        int occurence = (start + end) / 2;
        ans = occurence;
        for (int j = occurence; j >= start; j--) {
          if (nums[j] == target) {
            ans = j;
          }
        }
        return ans;
      } else if ((nums[(start + end) / 2]) < target) {
        start = ((start + end) / 2) + 1;
      } else {
        end = ((start + end) / 2) - 1;
      }
    }
    return ans;
  }

  static int binary_search_last(int[] nums, int start, int end, int target) {
    int ans = -1;
    while (start < end) {
      if (nums[(start + end) / 2] == target) {
        int occurence = (start + end) / 2;
        ans = occurence;
        for (int j = occurence; j <= end; j++) {
          if (nums[j] == target) {
            ans = j;
          }
        }
        return ans;
      } else if ((nums[(start + end) / 2]) < target) {
        start = ((start + end) / 2) + 1;
      } else {
        end = ((start + end) / 2) - 1;
      }
    }
    return ans;
  }
}
