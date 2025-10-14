import java.util.Random;

public class Oppgave1 {
    public static void main(String[] args) {
        Random r = new Random();

        String[] arithmeticOperations = {"+", "-", "*", "/"};
        for (int i = 0; i < 4; i++) {
            System.out.println("\n");
            for (int j = 0; j < 10; j++) {
                Fraction rFraction = new Fraction(r.nextInt(50), r.nextInt(50) + 1);
                int rNumerator = r.nextInt(50) + 1;
                int rDenominator = r.nextInt(50) + 1;

                String calculation = "(" + rFraction.getNumerator() + "/" + rFraction.getDenominator() + ")" + " " + arithmeticOperations[i] + " " + "(" + rNumerator + "/" + rDenominator + ")";
                switch (i) {
                    case 0:
                        rFraction.add(rNumerator, rDenominator);
                        break;
                    case 1:
                        rFraction.subtract(rNumerator, rDenominator);
                        break;
                    case 2:
                        rFraction.multiply(rNumerator, rDenominator);
                        break;
                    case 3:
                        rFraction.divide(rNumerator, rDenominator);
                        break;
                }

                System.out.println(calculation + " = (" + rFraction.getNumerator() + "/" + rFraction.getDenominator() + ")");
            }
        }
    }
}
