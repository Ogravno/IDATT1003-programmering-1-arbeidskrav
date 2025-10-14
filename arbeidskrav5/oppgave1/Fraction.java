public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominatro cannot be zero");
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    private int findCommonDenominator(int d1, int d2) {
        /* int i = 2;
        while ((denominator%i != 0 || this.denominator%i != 0) && (i%denominator != 0 || i%this.denominator != 0)) {
            i++;
        }

        return i; */
        return d1 * d2;
    }

    private void shorten() {
        int gcd = 1;

        for (int i = 1; i <= Math.abs(this.numerator) && i <= Math.abs(this.denominator); i++) {
            if (this.numerator % i == 0 && this.denominator % i == 0) {
                gcd = i;
            }
        }

        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    public void add(int numerator, int denominator) {
        if (denominator != this.denominator) {
            int commonDenominator = findCommonDenominator(this.denominator, denominator);

            this.numerator = this.numerator * commonDenominator / this.denominator;
            this.denominator = commonDenominator;

            numerator = numerator * commonDenominator / denominator;
            denominator = commonDenominator;
        }

        this.numerator = this.numerator + numerator;

        shorten();
    }

    public void subtract(int numerator, int denominator) {
        if (denominator != this.denominator) {
            int commonDenominator = findCommonDenominator(this.denominator, denominator);

            this.numerator = this.numerator * commonDenominator / this.denominator;
            this.denominator = commonDenominator;

            numerator = numerator * commonDenominator / denominator;
            denominator = commonDenominator;
        }

        this.numerator = this.numerator - numerator;

        shorten();
    }

    public void multiply(int numerator, int denominator) {
        this.numerator = this.numerator * numerator;
        this.denominator = this.denominator * denominator;

        shorten();
    }

    public void divide(int numerator, int denominator) {
        this.numerator = this.numerator * denominator;
        this.denominator = this.denominator * numerator;

        shorten();
    }
}
