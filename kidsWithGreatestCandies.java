import java.util.*;

public class kidsWithGreatestCandies {

  public static void main(String[] args) {
    List<Boolean> result = new ArrayList<>();
    int[] candies = { 2, 3, 5, 1, 3 };
    int extraCandies = 3;
    int max = 0;
    for (int i : candies) {
      if (i > max) {
        max = i;
      }
    }
    for (int i : candies) {
      if ((i + extraCandies) >= max) {
        result.add(true);
      } else result.add(false);
    }

    System.out.println(result);
  }
}
