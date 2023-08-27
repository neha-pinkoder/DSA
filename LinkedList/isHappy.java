public class isHappy {

  public static void main(String[] args) {}

  static boolean isHappyOrNot(int n) {
    int slow = n;
    int fast = n;

    do {
      slow = findSquare(slow);
      fast = findSquare(findSquare(fast));
    } while (fast != slow);

    if (slow == 1) {
      return true;
    }
    return false;
  }

  private static int findSquare(int num) {
    int ans = 0;
    while (num > 0) {
      int rem = num % 10;
      ans += rem * rem;
      num = num / 10;
    }
    return ans;
  }
}
