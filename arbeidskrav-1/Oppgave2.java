import java.util.Scanner;

public class Oppgave2 {
    static Integer calculateTotalSeconds(Integer hours, Integer minutes, Integer seconds) {
        Integer secondsFromHours = hours * 3600;
        Integer secondsFromMinutes = minutes * 60;

        Integer totalSeconds = seconds + secondsFromHours + secondsFromMinutes;
        return totalSeconds;
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Dette programmet skal regne fra timer, minutter og sekunder til totalt antall sekunder\nAntall timer: ");
        Integer hours = inputScanner.nextInt();

        System.out.print("Antall minutter: ");
        Integer minutes = inputScanner.nextInt();

        System.out.print("Antall sekunder: ");
        Integer seconds = inputScanner.nextInt();

        Integer totalSeconds = calculateTotalSeconds(hours, minutes, seconds);
        
        System.out.println("Det er totalt " + totalSeconds + " sekunder");
    }
}
