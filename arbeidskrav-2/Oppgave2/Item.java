package Oppgave2;

public class Item {
    private String name;
    private Double price;
    private Double weight;

    public Item(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Item(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setweight(Double weight) {
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }

    public Double getPricePerKilogram() {
        return price / (weight / 1000);
    }
}
