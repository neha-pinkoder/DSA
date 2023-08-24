package Recursion;

public class printNumber {

  public static void main(String[] args) {
    print(1);
  }

  static void print(int num) {
    System.out.println(num);
    if (num == 5) {
      return;
    }
    print(num + 1);
  }
}
