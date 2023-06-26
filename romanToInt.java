public class romanToInt {

  public static void main(String[] args) {
    char[] arr_char = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
    int[] arr_int = { 1, 5, 10, 50, 100, 500, 1000 };
    int sum = 0;
    String rom = "MCMXCIV";
    int prev = 0;
    for (int i = 0; i < rom.length(); i++) {
      if (rom.charAt(rom.length() - 1) == arr_char[i]) {
        prev = arr_int[i];
      }
    }
    System.out.println(prev);
    for (int i = rom.length() - 1; i >= 0; i--) {
      System.out.println(rom.charAt(i));
      for (int j = 0; j < arr_int.length; j++) {
        if (rom.charAt(i) == arr_char[j]) {
          if (arr_int[j] >= prev) {
            sum += arr_int[j];
            break;
          } else sum -= arr_int[j];
        }
        prev = arr_int[j];
      }
    }
    System.out.println(sum);
  }
}
