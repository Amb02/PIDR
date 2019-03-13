import java.util.ArrayList;
import java.util.List;

public class CombinationGenerator {
  private List<String> elements;

  private static List<String> combinations;

  public CombinationGenerator () {
    elements = new ArrayList<String>();
    combinations = new ArrayList<String>();
  }

  public void generatorAllCombinations () {
    // TODO : generer toutes les combinaisons à partir de l'ArrayList elements
    return ;
  }

  public void addElement(String element) {
    elements.add(element);
  }

  public String getCombination (int index) {
    return combinations.get(index);
  }
}
