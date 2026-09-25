package week_5.assignment_problems;

import java.util.Arrays;

class Player implements Comparable<Player> {

    private String name;
    private int matchesPlayed;
    private double battingAverage;
    private boolean injured;

    public Player(
        String name,
        int matchesPlayed,
        double battingAverage,
        boolean injured
    ) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.battingAverage = battingAverage;
        this.injured = injured;
    }

    public static boolean isDraftable(int matchesPlayed) {
        return matchesPlayed >= 10;
    }

    public static boolean isDraftable(
        int matchesPlayed,
        boolean injured
    ) {
        return matchesPlayed >= 5 && !injured;
    }

    public String getName() {
        return name;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public boolean isInjured() {
        return injured;
    }

    private double getFantasyPoints() {
        return battingAverage;
    }

    @Override
    public int compareTo(Player other) {
        return Double.compare(
            other.getFantasyPoints(),
            this.getFantasyPoints()
        );
    }
}

public class FantasyLeagueDraft {

    static String draftAndRank(Player[] players) {

        Player[] draftable = new Player[players.length];

        int count = 0;

        for (Player player : players) {

            if (
                Player.isDraftable(player.getMatchesPlayed())
                ||
                Player.isDraftable(
                    player.getMatchesPlayed(),
                    player.isInjured()
                )
            ) {
                draftable[count] = player;
                count++;
            }
        }

        Player[] finalDraftable =
            Arrays.copyOf(draftable, count);

        Arrays.sort(finalDraftable);

        String result = "";

        for (int i = 0; i < finalDraftable.length; i++) {

            if (i > 0) {
                result += " | ";
            }

            result +=
                (i + 1) + ". " +
                finalDraftable[i].getName();
        }

        return result;
    }

    public static void main(String[] args) {

        Player[] players = {

            new Player(
                "Virat",
                15,
                48.0,
                false
            ),

            new Player(
                "Rahul",
                7,
                55.0,
                false
            ),

            new Player(
                "Sameer",
                3,
                60.0,
                false
            ),

            new Player(
                "Dev",
                12,
                20.0,
                true
            )
        };

        System.out.println(
            draftAndRank(players)
        );
    }
}