import java.util.*;

public class findAllRecipes {

  public static void main(String[] args) {
    String[] recipes = { "bread" };
    List<List<String>> ingredients = new ArrayList<>();
    List<String> innerList = new ArrayList<>();
    innerList.add("yeast");
    innerList.add("flour");
    ingredients.add(innerList);
    String[] supplies = { "yeast", "flour", "corn" };
    int count = 0, recipe_count = 0;
    for (int i = 0; i < recipes.length; i++) {
      for (int j = 0; j < innerList.size(); j++) {
        String search = innerList.get(j);
        System.out.println(search);
        for (String string : supplies) {
          if (search == string) {
            count++;
          }
        }
        if (count == innerList.size()) {
          recipe_count++;
        }
      }
    }
    System.out.println(recipe_count);
  }
}
