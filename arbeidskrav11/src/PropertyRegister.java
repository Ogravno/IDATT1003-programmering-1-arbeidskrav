import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

/**
 * This class represents the property register.
 *
 * @author Odin Grav
 */
public class PropertyRegister {
  List<Property> properties = new ArrayList<Property>();

  public List<Property> getProperties() {
    return properties;
  }

  /**
   * Registers a new property with every attribute.
   *
   * @param municipalityNumber the municipality's number
   * @param municipalityName the municipality's name
   * @param lotNumber the lot number(norwegian: gårdsnummer(gnr))
   * @param sectionNumber the section number(norwegian: bruksnummer(bnr))
   * @param name the name of the property
   * @param area the area of the property
   * @param nameOfOwner the name of the owner of the property
   */
  public void registerProperty(int municipalityNumber, String municipalityName, int lotNumber,
                               int sectionNumber, String name, double area, String nameOfOwner) {
    properties.add(new Property(municipalityNumber, municipalityName, lotNumber, sectionNumber,
        name, area, nameOfOwner));
  }

  /**
   * Registers a new property with every attribute except the name of the property.
   *
   * @param municipalityNumber the municipality's number
   * @param municipalityName the municipality's name
   * @param lotNumber the lot number(norwegian: gårdsnummer(gnr))
   * @param sectionNumber the section number(norwegian: bruksnummer(bnr))
   * @param area the area of the property
   * @param nameOfOwner the name of the owner of the property
   */
  public void registerProperty(int municipalityNumber, String municipalityName, int lotNumber,
                               int sectionNumber, double area, String nameOfOwner) {
    properties.add(new Property(municipalityNumber, municipalityName, lotNumber, sectionNumber,
        area, nameOfOwner));
  }

  /**
   * Deletes specified property.
   *
   * @param property property to be deleted
   */
  public void deleteProperty(Property property) {
    properties.remove(property);
  }

  public int getNumberOfProperties() {
    return properties.size();
  }

  /**
   * gets a property by the municipalityNumber, lotNumber and sectionNumber.
   *
   * @param municipalityNumber the municipality's number
   * @param lotNumber the lot number(norwegian: gårdsnummer(gnr))
   * @param sectionNumber the section number(norwegian: bruksnummer(bnr))
   *
   * @return the property with the specified municipalityNumber, lotNumber and sectionNumber
   */
  public Property getProperty(int municipalityNumber, int lotNumber, int sectionNumber) {
    return properties
        .stream()
        .filter(property -> property.getMunicipalityNumber() == municipalityNumber)
        .filter(property -> property.getLotNumber() == lotNumber)
        .filter(property -> property.getSectionNumber() == sectionNumber)
        .toList()
        .getFirst();
  }

  public OptionalDouble getAverageArea() {
    return properties.stream().mapToDouble(Property::getArea).average();
  }

  /**
   * Returns a list of the properties registered with the specified lot number.
   *
   * @param lotNumber the lot number(norwegian: gårdsnummer(gnr))
   *
   * @return a list of properties as an ArrayList
   */
  public List<Property> getPropertiesByLotNumber(int lotNumber) {
    return properties
        .stream()
        .filter(property -> property.getLotNumber() == lotNumber)
        .collect(Collectors.toList());
  }
}
