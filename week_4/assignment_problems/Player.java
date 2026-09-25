package week_4.assignment_problems;

class Batsman extends Player {

    Batsman(String name) {
        super(name);
    }

    @Override
    void play() {
        System.out.println(
            name + " is batting"
        );
    }

    void scoreRuns(int runs) {
        System.out.println(
            name + " scored " + runs + " runs"
        );
    }
}

class Bowler extends Player {

    Bowler(String name) {
        super(name);
    }

    @Override
    void play() {
        System.out.println(
            name + " is bowling"
        );
    }

    void takeWicket() {
        System.out.println(
            name + " took a wicket"
        );
    }
}

public abstract class Player {

    String name;

    Player(String name) {
        this.name = name;
    }

    abstract void play();

    public static void main(String[] args) {

        Player[] players = {
            new Batsman("Virat"),
            new Bowler("Bumrah")
        };

        for (Player player : players) {

            player.play();

            if (player instanceof Batsman) {

                Batsman batsman =
                    (Batsman) player;

                batsman.scoreRuns(50);

            } else if (player instanceof Bowler) {

                Bowler bowler =
                    (Bowler) player;

                bowler.takeWicket();
            }
        }
    }
} 