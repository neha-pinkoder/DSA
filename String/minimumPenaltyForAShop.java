public class minimumPenaltyForAShop {

  public static void main(String[] args) {
    String customers = "YYNY";
    System.out.println(minimumPenalty(customers));
  }

  static int minimumPenalty(String customers) {
    int counterY = 0;
    int index = 0;
    int penalty = counterY;
    for (int i = 0; i < customers.length(); i++) {
      if (customers.charAt(i) == 'Y') {
        counterY--;
      } else counterY++;
      if (counterY < penalty) {
        penalty = counterY;
        index = i + 1;
      }
    }
    return index;
  }

  static int minimumPenaltyBrute(String customers) {
    int length = customers.length();

    int counterY = 0, counterN = 0;
    for (char ch : customers.toCharArray()) {
      if (ch == 'Y') {
        counterY++;
      } else counterN++;
    }
    if (counterN == length) {
      return 0;
    } else if (counterY == length) return length;

    int index = 0;
    int penalty = counterY;
    for (int i = 0; i < length; i++) {
      if (customers.charAt(i) == 'Y') {
        counterY--;
      } else counterY++;
      if (counterY < penalty) {
        penalty = counterY;
        index = i + 1;
      }
    }
    return index;
  }
}
