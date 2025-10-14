import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Oppgave1 {
    static Integer userInputInteger(String message) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print(message);
        
        Integer inputInteger;

        while (true) {
            try {
                String inputString = inputScanner.nextLine();
                inputInteger = Integer.parseInt(inputString);

                break;
            } catch (NumberFormatException e) {
                System.out.print("Ikke gyldig tall. Skriv inn et gyldig tall: ");
            }
        }

        return inputInteger;
    }

    public static void main(String[] args) {
        System.out.println("Programmet skal vise en del av gnagetabellen");

        Integer start = userInputInteger("Hvor skal programmet starte?: ");
        Integer end = userInputInteger("Hvor skal programmet slutte?: ");

        for (int i = 0; i <= end-start; i++) {
            System.out.println("\n" + (start + i) + "-gamngen:");
            for (int j = 0; j <= 10; j++) {
                System.out.println(start + i + " x " + j + " = " + (start + i) * j);
            }
        }
    }
}
