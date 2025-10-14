package oppgave2;
import java.util.Scanner;

public class Oppgave2 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        String tempName;

        System.out.print("Navnet til den første spilleren: ");
        tempName = inputScanner.nextLine();
        Player player1 = new Player(tempName);

        System.out.print("Navnet til den andre spilleren: ");
        tempName = inputScanner.nextLine();
        Player player2 = new Player(tempName);

        Player currentPlayer;
        Integer nextPlayer = 1;
        Integer throwScore;

        while (true) {
            if (player1.getScore() >= 100) {
                System.out.println(player1.getName() + "vant spillet med " + player1.getScore() + " poeng!");
                break;
            } else if (player2.getScore() >= 100) {
                System.out.println(player2.getName() + "vant spillet med " + player2.getScore() + " poeng!");
                break;
            }

            currentPlayer = (nextPlayer == 1) ? player1 : player2;

            System.out.println(currentPlayer.getName() + ", trykk på enter for å kasste tærningen");
            

            throwScore = currentPlayer.throwDice();
            System.out.println(currentPlayer.getName() + " kastetet: " + throwScore);
            System.out.println("Scoreboard:");
            System.out.println(player1.getName() + ": " + player1.getScore());
            System.out.println(player2.getName() + ": " + player2.getScore() + "\n");

            if (currentPlayer.getScore() >= 100) {
                System.out.println(currentPlayer.getName() + "vant spillet med, " + currentPlayer.getScore() + " poeng!");
                break;
            }

            nextPlayer *= -1;
        }
    }

}
