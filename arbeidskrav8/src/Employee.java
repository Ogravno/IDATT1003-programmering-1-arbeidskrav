import java.util.UUID;

public class Employee {
    private final Person personnel;
    private final String employeeId;
    private final int yearHired;
    private int monthlySalaryOre;
    private int taxPercentage;

    public Employee(Person personnel, int yearHired, int monthlySalaryOre, int taxPercentage) {
        this.personnel = personnel;
        this.employeeId = UUID.randomUUID().toString();
        this.yearHired = yearHired;
        this.monthlySalaryOre = monthlySalaryOre;
        this.taxPercentage = taxPercentage;
    }

    public Employee(Person personnel, int yearHired, double monthlySalary, double taxPercentage) {
        this.personnel = personnel;
        this.employeeId = UUID.randomUUID().toString();
        this.yearHired = yearHired;
        this.monthlySalaryOre = (int) (monthlySalary * 100);
        this.taxPercentage = (int) (taxPercentage * 100);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public int getYearHired() {
        return yearHired;
    }

    public double getMonthlySalary() {
        return (double) monthlySalaryOre / 100;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalaryOre = (int) monthlySalary * 100;
    }

    public int getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(int taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public double getTaxPerMonth() {
        return (monthlySalaryOre * 100) * ((double) taxPercentage / 100);
    }

    public double getGrossSalary() {
        return (monthlySalaryOre * 10) * 12;
    }

    public double getTaxPerYear() {
        return this.getTaxPerMonth() * 10.5;
    }

    public String getFullName() {
        return this.personnel.getLastname() + ", " + this.personnel.getFirstname();
    }

    public int getAge() {
        java.util.GregorianCalendar kalendar = new java.util.GregorianCalendar();
        return kalendar.get(java.util.Calendar.YEAR) - this.personnel.getBirthyear();
    }

    public int getYearsHired() {
        java.util.GregorianCalendar kalendar = new java.util.GregorianCalendar();
        return kalendar.get(java.util.Calendar.YEAR) - this.yearHired;
    }

    public boolean beenHiredFor(int years) {
        return (this.getYearsHired() >= years);
    }
}
