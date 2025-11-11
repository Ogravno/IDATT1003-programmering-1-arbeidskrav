package oppgave2;

import java.util.*;
import java.util.stream.Collectors;

public class MenuRegister {
  private Map<String, Dish> dishes;
  private Map<String, List<Dish>> menus;

  public MenuRegister() {
    this.dishes = new HashMap<>();
    this.menus = new HashMap<>();
  }

  public void addDish(String name, String type, double price, String recipe) {
    this.dishes.put(name, new Dish(name, type, price, recipe));
  }

  public Dish getDish(String name) {
    return dishes.get(name);
  }

  public List<Dish> getDishesOfType(String type) {
    return dishes.values().stream().filter(dish -> Objects.equals(dish.getType(), type)).collect(Collectors.toList());
  }

  public void addMenu(String name, List<String> dishesNames) {
    List<Dish> newMenu = new ArrayList<>();
    dishesNames.forEach(dishName -> newMenu.add(dishes.get(dishName)));

    menus.put(name, newMenu);
  }

  public List<List<Dish>> getMenusInPriceRange(double fromPrice, double toPrice) {
    return menus
            .values()
            .stream().
            filter(menu -> {
              double totalMenuPrice = getTotalPrice(menu);
              return (totalMenuPrice >= fromPrice && totalMenuPrice < toPrice);
            })
            .collect(Collectors.toList());
  }

  private double getTotalPrice(List<Dish> dishes) {
    return dishes.stream().mapToDouble(Dish::getPrice).sum();
  }
}
