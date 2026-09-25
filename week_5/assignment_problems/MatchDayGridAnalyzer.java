package week_5.assignment_problems;

public class MatchDayGridAnalyzer {

    private static double rowAverage(int[] row) {

        int sum = 0;

        for (int i = 0; i < row.length; i++) {
            sum += row[i];
        }

        return (double) sum / row.length;
    }

    static String classifyMatches(
        int[][] runsPerOver,
        int threshold
    ) {

        String result = "";

        for (int i = 0; i < runsPerOver.length; i++) {

            double average =
                rowAverage(runsPerOver[i]);

            String classification;

            if (average >= threshold) {
                classification = "Power Surge";
            } else {
                classification = "Normal";
            }

            if (i > 0) {
                result += " | ";
            }

            result +=
                "Match " + i + ": " + classification;
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] runsPerOver = {
            {4, 6, 8},
            {10, 12, 14},
            {2, 3, 1}
        };

        int threshold = 8;

        System.out.println(
            classifyMatches(
                runsPerOver,
                threshold
            )
        );
    }
}