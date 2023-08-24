public class findInMountain {

  public static void main(String[] args) {
    int[] mountainArray = { 1, 2, 3, 4, 5, 3, 1 };
    int target = 3;
    System.out.println(findInMountainArray(target, mountainArray));
  }

  public static int findInMountainArray(int target, int[] mountainArr) {
    int ans = -1;
    int peak = findPeak(mountainArr, 0, mountainArr.length - 1);
    int left = binary_search(mountainArr, 0, peak, target);
    if (left != -1) {
      left = mountainArr[left];
    }
    int right = binary_search(
      mountainArr,
      peak + 1,
      mountainArr.length - 1,
      target
    );
    if (right != -1) {
      right = mountainArr[right];
    }
    if (left == -1 && right == -1) {
      return -1;
    }
    if (left < right && left != -1) {
      return left;
    } else if (right < left && right != -1) return right;
    return ans;
  }

  public static int findPeak(int[] nums, int start, int end) {
    while (start < end) {
      int mid = (start + end) / 2;
      if (nums[mid] < nums[mid + 1]) {
        start = mid + 1;
      } else {
        end = mid;
      }
    }
    return start;
  }

  public static int binary_search(int[] nums, int start, int end, int target) {
    while (start < end) {
      if (nums[(start + end) / 2] == target) {
        return (start + end) / 2;
      } else if ((nums[(start + end) / 2]) < target) {
        start = ((start + end) / 2) + 1;
      } else {
        end = ((start + end) / 2) - 1;
      }
    }
    return (start + end) / 2;
  }
}
