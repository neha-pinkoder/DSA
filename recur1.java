import java.net.Socket;

public class recur1 {

  static int x = 0;

  public static void main(String[] args) {
    x = 10;
    System.out.println(x);
    fun();
  }

  static void fun() {
    x = 100;
    System.out.println(x);
  }
}
