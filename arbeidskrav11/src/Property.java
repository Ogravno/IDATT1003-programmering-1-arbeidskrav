/**
 * This class represents a property.
 *
 * @author Odin Grav
 */
public class Property {
  private final int municipalityNumber;
  private final String municipalityName;
  private final int lotNumber;
  private final int sectionNumber;
  private String name;
  private double area;
  private String nameOfOwner;

  /**
   * Constructor initializing all attributes.
   *
   * @param municipalityNumber the municipality's number
   * @param municipalityName the municipality's name
   * @param lotNumber the lot number(norwegian: gårdsnummer(gnr))
   * @param sectionNumber the section number(norwegian: bruksnummer(bnr))
   * @param name the name of the property
   * @param area the area of the property
   * @param nameOfOwner the name of the owner of the property
   */
  public Property(int municipalityNumber, String municipalityName, int lotNumber, int sectionNumber,
                  String name, double area, String nameOfOwner) {
    this.municipalityNumber = municipalityNumber;
    this.municipalityName = municipalityName;
    this.lotNumber = lotNumber;
    this.sectionNumber = sectionNumber;
    this.name = name;
    this.area = area;
    this.nameOfOwner = nameOfOwner;
  }

  /**
   * Constructor initializing all attributes except the name of the property.
   *
   * @param municipalityNumber the municipality's number
   * @param municipalityName the municipality's name
   * @param lotNumber the lot number(norwegian: gårdsnummer(gnr))
   * @param sectionNumber the section number(norwegian: bruksnummer(bnr))
   * @param area the area of the property
   * @param nameOfOwner the name of the owner of the property
   */
  public Property(int municipalityNumber, String municipalityName, int lotNumber, int sectionNumber,
                  double area, String nameOfOwner) {
    this.municipalityNumber = municipalityNumber;
    this.municipalityName = municipalityName;
    this.lotNumber = lotNumber;
    this.sectionNumber = sectionNumber;
    this.area = area;
    this.nameOfOwner = nameOfOwner;
  }

  public int getMunicipalityNumber() {
    return municipalityNumber;
  }

  public String getMunicipalityName() {
    return municipalityName;
  }

  public int getLotNumber() {
    return lotNumber;
  }

  public int getSectionNumber() {
    return sectionNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getArea() {
    return area;
  }

  public void setArea(double area) {
    this.area = area;
  }

  public String getNameOfOwner() {
    return nameOfOwner;
  }

  public void setNameOfOwner(String nameOfOwner) {
    nameOfOwner = nameOfOwner;
  }

  /**
   * Returns a unique identifier for the property in the format
   * municipalityNumber-lotNumber/sectionNumber.
   *
   * @return a unique identifier for the property as a string
   */
  public String getPropertyId() {
    return Integer.toString(municipalityNumber) + "-" + Integer.toString(lotNumber) + "/"
        + Integer.toString(sectionNumber);
  }
}
