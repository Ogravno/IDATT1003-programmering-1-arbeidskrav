package oppgave2;

public class Dish {
  private String name;
  private String type;
  private double price;
  private String recipe;

  public Dish(String name, String type, double price, String recipe) {
    this.name = name;
    this.type = type;
    this.price = price;
    this.recipe = recipe;
  }

  public String getName() {
    return this.name;
  }

  public String getType() {
    return this.type;
  }

  public Double getPrice() {
    return this.price;
  }

  public String getRecipe() {
    return this.recipe;
  }
}
