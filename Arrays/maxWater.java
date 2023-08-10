public class maxWater {

  public static void main(String[] args) {
    int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
    int max = 0;
    int calculate = 0;
    for (int i = 0; i < height.length; i++) {
      for (int j = i + 1; j < height.length; j++) {
        calculate = 0;
        if (height[i] < height[j]) {
          calculate = height[i] * (j - i);
        } else calculate = height[j] * (j - i);
        if (max < calculate) {
          max = calculate;
        }
      }
    }
    System.out.println(max);
  }
}
