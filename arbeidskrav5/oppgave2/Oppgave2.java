public class Oppgave2 {
    public static void main(String[] args) {
        MyRandom r = new MyRandom();

        System.out.println("Random int:");
        for (int i = 0; i < 20; i++) {
            int randomInt = r.nextInteger(5, 30);
            System.out.println(randomInt);
        }

        System.out.println("\nRandom double:");
        for (int i = 1; i < 20; i++) {
            double randomDouble = r.nextDouble(5, 20);
            System.out.println(randomDouble);
        }
    }
    
}
