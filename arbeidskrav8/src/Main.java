import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        Person person;
        String firstname;
        String lastname;
        int birthYear;

        System.out.print("Firstname: ");
        firstname = inputScanner.nextLine();
        System.out.print("Lastname: ");
        lastname = inputScanner.nextLine();
        System.out.print("Birth year: ");
        birthYear = inputScanner.nextInt();

        person = new Person(firstname, lastname, birthYear);

        Employee employee;
        int yearHired;
        double monthlySalary;
        int taxPercentage;

        System.out.print("Year hired: ");
        yearHired = inputScanner.nextInt();
        System.out.print("Monthly salary: ");
        monthlySalary = inputScanner.nextDouble();
        System.out.print("Tax percentage: ");
        taxPercentage = inputScanner.nextInt();

        employee = new Employee(person, yearHired, monthlySalary, taxPercentage);

        while (true) {
            System.out.println("Handlinger:\n1: Sett månedslønn\n2: Sett skatteprosent\n3: Sjekk om ansatt i x antall år");
            int choice = inputScanner.nextInt();
            String result;

            switch (choice) {
                case 1:
                    System.out.print("Månedslønn: ");
                    double salaryInput = inputScanner.nextDouble();
                    employee.setMonthlySalary(salaryInput);
                    System.out.println(Double.toString(employee.getTaxPerMonth()));
                    break;
                case 2:
                    System.out.print("Skatteprosent");
                    int taxPercentageInput = inputScanner.nextInt();
                    employee.setTaxPercentage(taxPercentageInput);
                    System.out.println(Integer.toString(employee.getTaxPercentage()));
                    System.out.println(Double.toString(employee.getTaxPerMonth()));
                    break;
                case 3:
                    System.out.print("År: ");
                    int yearsInput = inputScanner.nextInt();
                    System.out.println(Boolean.toString(employee.beenHiredFor(yearsInput)));
                    break;
                default:
                    System.out.println("not a valid input");
            }
        }
    }
}
