package oppgave1;

public class Oppgave1 {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();

        int[] appearances = new int[10];

        int loops = 1000;
        int numberOfPossibleDigits = (int) (Math.log10(Math.abs(loops))) + 1;

        for (int i = 0; i < loops; i++) {
            int randomInt = random.nextInt(10);

            appearances[randomInt] += 1;
        }

        for (int i = 0; i < appearances.length; i++) {
            int appearancesRounded = (int) Math.round(appearances[i]/10.0);
            int numberOfDigits = (int) (Math.log10(Math.abs(appearances[i]))) + 1;
            String stars = "*".repeat(appearancesRounded);
            String spaces = " " + " ".repeat(numberOfPossibleDigits - numberOfDigits);
            System.out.println(i + ": " + appearances[i] + spaces + stars);
        }
    }
}
