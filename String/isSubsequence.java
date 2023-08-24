public class isSubsequence {

  public static void main(String[] args) {
    String s = "abc";
    String t = "ahbhc";
    System.out.println(isSubsequence(s, t));
  }

  public static boolean isSubsequence(String s, String t) {
    if (s.equals("")) return true;
    int index = -1;
    for (char c : s.toCharArray()) {
      index = t.indexOf(c, index + 1);
      if (index == -1) return false;
    }
    return true;
  }
}
