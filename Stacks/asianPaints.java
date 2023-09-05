import java.math.BigInteger;

public class asianPaints {

  public static void main(String[] args) {
    // System.out.println(reverseAndAdd(123));
    System.out.println(findLuckyNumber(9));
  }

  static long findLuckyNumber(long num) {
    int count = 1;
    int num_digits = 0;
    long temp = num;
    if (temp % 10 == 0) {
      return count;
    }
    while (temp > 0) {
      temp /= 10;
      num_digits++;
    }
    long sum = 0;
    temp = num;
    for (int i = 0; i < num_digits; i++) {
      sum = sum + (temp % 10);
      temp /= 10;
    }
    if (sum % 10 != 0) {
      count++;
      findLuckyNumber(sum);
    }
    return count;
  }

  static int reverseAndAdd(int num) {
    int rev = 0;
    int temp = num;
    while (temp != 0) {
      rev = rev + (temp % 10);
      temp /= 10;
    }

    return rev;
  }
}
