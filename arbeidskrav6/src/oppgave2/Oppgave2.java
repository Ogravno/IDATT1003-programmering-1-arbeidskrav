package oppgave2;

import java.util.Scanner;

public class Oppgave2 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        while (true) {
            System.out.print("Tekst: ");
            String inpuString = inputScanner.nextLine();
            TextAnalysis myString = new TextAnalysis(inpuString);
            System.out.println(myString.getNumberOfDifferentLetters());
            System.out.println(myString.getTotalNumbetOfLetters());
            System.out.println(myString.getPercentageOfNonLetters());
            System.out.println(myString.getNumberOfAppearances('c'));
            System.out.println(myString.getMostCommonLetters());
        }
    }
}
