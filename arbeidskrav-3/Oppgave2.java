import java.util.Scanner;

public class Oppgave2 {
    static String userInput(String message) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print(message);
        
        String input;

        while (true) {
            try {
                input = inputScanner.nextLine();

                break;
            } catch (NumberFormatException e) {
                System.out.print("Ikke gyldig input");
            }
        }

        return input;
    }

    static Boolean checkPrime(Integer number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.err.println("Dette programmet skal finne ut om et tall er et primtall");

        while (true) {
            String userInputString = userInput("Tall som skal sjekkes (exit for å avslutte programmet): ");

            Integer numberToCheck;

            try {
                numberToCheck = Integer.parseInt(userInputString);
            } catch (NumberFormatException e) {
                if (userInputString.equals("exit")) {
                    break;
                }
                else {
                    System.err.println("Ikke gyldig input");
                    continue;
                }
            }

            System.out.println((checkPrime(numberToCheck) ? numberToCheck + " er et primtall" : numberToCheck + " er ikke et primtall"));
        }
    }
}
