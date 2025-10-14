package Oppgave2;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Oppgave2 {
    static Double userInputDouble(Integer decimals, String message) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print(message);
        
        Double inputDouble;

        while (true) {
            try {
                String inputString = inputScanner.nextLine();
                inputDouble = Double.parseDouble(inputString);

                break;
            } catch (NumberFormatException e) {
                System.out.print("Ikke gyldig desimaltall. Skriv inn et gyldig desimaltall: ");
            }
        }

        Double roundedInput = round(inputDouble, 2);

        return roundedInput;
    }

    static double round(Double value, Integer places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public static void main(String[] args) {
        Item groundBeef1 = new Item("Kjøttdeig 1");
        Item groundBeef2 = new Item("Kjøttdeig 2");

        groundBeef1.setPrice(userInputDouble(2, "Prisen på den første kjøttdeigen i NOK: "));
        groundBeef1.setweight(userInputDouble(0, "Vekten på den første kjøttdeigen i gram: "));

        groundBeef2.setPrice(userInputDouble(2, "Prisen på den andre kjøttdeigen i NOK: "));
        groundBeef2.setweight(userInputDouble(0, "Vekten på den andre kjøttdeigen i gram: "));

        if (groundBeef1.getPricePerKilogram() < groundBeef2.getPricePerKilogram()) {
            System.out.println("Kjøttdeig 1 er billigst");
        } else {
            System.out.println("Kjøttdeig 2 er billigst");
        }
    }
}
