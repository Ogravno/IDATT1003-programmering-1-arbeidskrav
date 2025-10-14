package oppgave1;

public class Currency {
    private String name;
    private Double rate;
    private String code;

    public Currency(String name, Double rate, String code) {
        this.name = name;
        this.rate = rate;
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRate() {
        return this.rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double toNOK(Double amount) {
        return amount * this.rate;
    }

    public Double formNOK(Double amount) {
        return amount / this.rate;
    }
}
