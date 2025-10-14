package oppgave2;
import java.util.Random;

public class Player {
    private String name;
    private Integer score;
    private Random random = new Random();

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return this.name;
    }

    public Integer getScore() {
        return this.score;
    }

    public Integer throwDice() {
        Integer randomScore = this.random.nextInt(5) + 1;

        if (randomScore == 1) {
            this.score = 0;
        } else {
            this.score += randomScore;
        }

        if (score >= 100) {
            isFinished();
        }

        return randomScore;
    }

    private void isFinished() {
        System.out.println(this.name + ": Jeg har 100 poeng!!!");
    }
}
