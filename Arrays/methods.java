import java.util.Scanner;

public class methods {

  public static void main(String[] args) {
    for (int i = 100; i < 1000; i++) {
      if (armStrongNumber(i)) {
        System.out.println(i);
      }
    }
    // System.out.println(armStrongNumber(100));
    // int num = 153;
    // if (armStrongNumber(num)) {
    //   System.out.println(num);
    // }
  }

  static boolean armStrongNumber(int num) {
    int sum = 0;
    while (num > 0) {
      int digit = num % 10;
      sum = sum + (digit * digit * digit);
      num /= 10;
    }
    return num == sum;
  }
}
