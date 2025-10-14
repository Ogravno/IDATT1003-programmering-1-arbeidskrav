import java.util.Scanner;

public class Oppgave1 {
    static Boolean checkLeapYear(Integer year) {
        if (year%100 == 0) {
            if (year%400 == 0) {
                return true;
            }
        } else if (year%4 == 0) {
            return true;
        }

        return false;
    }
    

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        Integer year;

        System.out.print("Årstall: ");
        while (true) {
            try {
                String yearString = inputScanner.nextLine();
                year = Integer.parseInt(yearString);

                break;
            } catch (NumberFormatException e) {
                System.out.print("Skriv inn et gyldig årstall: ");
            }
        }

        if (checkLeapYear(year)) {
            System.out.println("År " + year + " er et skuddår");
        } else {
            System.out.println("År " + year +  " er ikke et skuddår");
        }
    }
}