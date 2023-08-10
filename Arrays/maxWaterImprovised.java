public class maxWaterImprovised {

  public static void main(String[] args) {
    int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
    int max = 0;
    int start = 0;
    int end = height.length - 1;
    while (start < end) {
      int w = end - start;
      int h = Math.min(height[start], height[end]);
      int area = w * h;
      max = Math.max(max, area);
      if (height[start] < height[end]) {
        start++;
      } else end--;
    }
    System.out.println(max);
  }
}
