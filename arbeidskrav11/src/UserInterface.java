import java.util.Scanner;

public class UserInterface {
  Scanner sc = new Scanner(System.in);
  PropertyRegister propertyRegister = new PropertyRegister();

  // Constants representing the different menu choices
  private final int ADD_PROPERTY = 1;
  private final int LIST_ALL_PROPERTIES = 2;
  private final int FIND_PROPERTY = 3;
  private final int CALCULATE_AVERAGE_AREA = 4;
  private final int EXIT = 9;

  private void printProperty(Property property) {
    System.out.println("\n");
    System.out.println("Municipality number: " + property.getMunicipalityNumber());
    System.out.println("Municipality name: " + property.getMunicipalityName());
    System.out.println("Lot number:" + property.getLotNumber());
    System.out.println("Section number:" + property.getSectionNumber());
    System.out.println("Name: " + property.getName());
    System.out.println("Area: " + property.getArea());
    System.out.println("Name of owner: " + property.getNameOfOwner());

  }

  private void registerProperty() {
    System.out.print("Municipality number: ");
    int municipalyNumber = sc.nextInt();
    sc.nextLine();

    System.out.print("Municipality name: ");
    String municipalyName = sc.nextLine();

    System.out.print("Lot number: ");
    int lotNumber = sc.nextInt();
    sc.nextLine();

    System.out.print("Section number: ");
    int sectionNumber = sc.nextInt();
    sc.nextLine();

    System.out.print("Name (press enter if no name): ");
    String name = sc.nextLine();

    System.out.print("Area: ");
    double area = sc.nextDouble();
    sc.nextLine();

    System.out.print("Name of owner: ");
    String nameOfOwner = sc.nextLine();

    propertyRegister.registerProperty(municipalyNumber, municipalyName, lotNumber, sectionNumber,
        name, area, nameOfOwner);
  }

  private void findProperty() {
    System.out.print("Municipality number: ");
    int municipalyNumber = sc.nextInt();
    sc.nextLine();

    System.out.print("Lot number: ");
    int lotNumber = sc.nextInt();
    sc.nextLine();

    System.out.print("Section number: ");
    int sectionNumber = sc.nextInt();
    sc.nextLine();

    printProperty(propertyRegister.getProperty(municipalyNumber, lotNumber, sectionNumber));
  }

  /**
   * Presents the menu for the user, and awaits input from the user. The menu
   * choice selected by the user is being returned.
   *
   * @return the menu choice by the user as a positive number starting from 1.
   * If 0 is returned, the user has entered a wrong value
   */
  private int showMenu() {
    int menuChoice = 0;
    System.out.println("\n***** Property Register Application v0.1 *****\n");
    System.out.println("1. Add property");
    System.out.println("2. List all properties");
    System.out.println("3. Search property");
    System.out.println("4. Calculate average area");
    //TODO: Add more menus
    System.out.println("9. Quit");
    System.out.println("\nPlease enter a number between 1 and 9.\n");
    if (sc.hasNextInt()) {
      menuChoice = sc.nextInt();
      sc.nextLine();
    } else {
      System.out.println("You must enter a number, not text");
    }
    return menuChoice;
  }

  /**
   * Starts the application. This is the main loop of the application,
   * presenting the menu, retrieving the selected menu choice from the user,
   * and executing the selected functionality.
   */
  public void start() {
    boolean finished = false;
    // The while-loop will run as long as the user has not selected
    // to quit the application
    while (!finished) {
      int menuChoice = this.showMenu();
      switch (menuChoice)
      {
        case ADD_PROPERTY:
          registerProperty();
          break;
        case LIST_ALL_PROPERTIES:
          propertyRegister.getProperties().forEach(property -> printProperty(property));
          break;
        case FIND_PROPERTY:
          findProperty();
          break;
        case CALCULATE_AVERAGE_AREA:
          System.out.println(propertyRegister.getAverageArea());
          break;
        case EXIT:
          System.out.println("Thank you for using the Properties app!\n");
          finished = true;
          break;
        default:
          System.out.println("Unrecognized menu selected..");
          break;
      }
    }
  }
}
