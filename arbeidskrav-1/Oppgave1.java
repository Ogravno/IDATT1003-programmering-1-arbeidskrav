import java.util.Scanner;
public class Oppgave1 {
    public static void main(String[] args){
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Dette programmet skal regne om fra tommer til centimeter");

        System.out.println("Sriv inn antall tommer du ønsker å regne om:");
        Double tommer = Double.parseDouble(inputScanner.nextLine());

        Double centimeter = tommer * 2.54;

        System.out.println(tommer + " tommer er " + centimeter + " centimeter");
    }
}