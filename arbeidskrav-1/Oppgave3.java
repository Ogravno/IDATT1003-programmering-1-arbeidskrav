
import java.util.Scanner;

public class Oppgave3 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Dette programmet skal beregne antall timet minutter og sekunder ut ifra totalt antall sekunder");

        System.out.print("Antall sekunder: ");
        Integer seconds = inputScanner.nextInt();

        Integer hours = seconds/3600;

        Integer secondsToMinutes = seconds%3600;
        Integer minutes = secondsToMinutes/60;

        Integer remainingSeonds = secondsToMinutes%60;

        System.out.println(seconds + " sekund(er) er " + hours + " time(r), " + minutes + " minutt(er) og " + remainingSeonds + " sekund(er)");
    }
}