import java.util.Scanner;

public class InputInteger {
    private Integer input;

    public void setInteger(Integer input) {
        this.input = input;
    }

    public Integer getInteger() {
        return this.input;
    }

    public InputInteger(String message) {
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

        this.input = inputInteger;
    }
}
