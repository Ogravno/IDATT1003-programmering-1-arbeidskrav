package oppgave1;

import java.util.Scanner;

public class Oppgave1 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        Currency[] currnecies = {
            new Currency("dollar", 9.97, "USD"),
            new Currency("euro", 11.72, "EUR"),
            new Currency("svenske kroner", 1.07, "SEK")
        };
        
        Integer choiceCurrency;
        Integer choiceOperation;
        Double amount;

        while (true) {
            System.out.println("Vekg en valutta");

            for (int i = 0; i < currnecies.length; i++) {
                System.out.println((i+1) + ": " + currnecies[i].getName());
            }
            System.out.println("4: avslutt");
            System.out.print("Valg: ");

            try {
                choiceCurrency = inputScanner.nextInt();
            } catch (Exception e) {
                System.out.println("ugyldig input");
                continue;
            }

            if (choiceCurrency > (currnecies.length + 1)) {
                System.out.println("ugyldig input");
                continue;
            }

            if (choiceCurrency == (currnecies.length + 1)) {
                break;
            }

            while (true) {
                System.out.println("1: norske kroner til " + currnecies[choiceCurrency - 1].getName());
                System.out.println("2: " + currnecies[choiceCurrency - 1].getName() + " til norske kroner");
                System.out.println("3: tilbake");
            
                try {
                    choiceOperation = inputScanner.nextInt();
                } catch (Exception e) {
                    System.out.println("ugyldig input");
                    continue;
                }

                if(choiceOperation > 3) {
                    System.out.print("ugyldig input");
                    continue;
                }

                if (choiceOperation == 3) {
                    break;
                }

                while (true) {
                    System.out.print("Mengde: ");
                    try {
                        amount = inputScanner.nextDouble();
                        break;
                    } catch (Exception e) {
                        System.out.println("ugyldig input");
                        continue;
                    }
                }

                if (choiceOperation == 1) {
                    System.out.println(amount + "NOK = " + currnecies[choiceCurrency - 1].formNOK(amount) + " " + currnecies[choiceCurrency - 1].getCode());
                } else {
                    System.out.println(amount + " " + currnecies[choiceCurrency - 1].getCode() + " = " + currnecies[choiceCurrency - 1].toNOK(amount) + " NOK");
                }
            }
        }
    }
}
