package LinearSearch;

public class searchInString {

  public static void main(String[] args) {
    String name = "Neha";
    char target = 'e';
    if (name.length() == 0) {
      System.out.println("Empty");
    }
    for (int i = 0; i < name.length(); i++) {
      if (target == name.charAt(i)) {
        System.out.println(i);
      }
    }
    for (char ch : name.toCharArray()) {
      System.out.println(ch);
    }
    for (int i = 1; i < args.length; i++) {}
  }
}
