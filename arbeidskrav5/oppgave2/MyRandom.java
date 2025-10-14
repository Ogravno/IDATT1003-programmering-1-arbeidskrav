import java.util.Random;

public class MyRandom {
    private Random random = new Random();

    public int nextInteger(int lowerLimiit, int upperLimit) {
        int difference = upperLimit - lowerLimiit;
        int randomInt = random.nextInt(difference);

        return randomInt + lowerLimiit;
    }

    public double nextDouble(double lowerLimit, double upperLimit) {
        double randomDouble = random.nextDouble();
        
        double difference = upperLimit - lowerLimit;
        double result = difference * randomDouble + lowerLimit;

        return result;
    }
}
