import java.util.*;

public class RockPaperScissors {
    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }
    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) return "draw";
        if (user.equals("rock") && computer.equals("scissors")) return "user";
        if (user.equals("scissors") && computer.equals("paper")) return "user";
        if (user.equals("paper") && computer.equals("rock")) return "user";
        return "computer";
    }
    public static String[][] calculateStats(int userWins, int computerWins, int games) {
        String[][] stats = new String[2][3];
        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.valueOf((userWins * 100.0) / games);
        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.valueOf((computerWins * 100.0) / games);
        return stats;
    }
    public static void displayResults(List<String[]> results, String[][] stats) {
        System.out.println("Game\tUser\tComputer\tWinner");
        for (int i = 0; i < results.size(); i++) {
            String[] r = results.get(i);
            System.out.println((i+1) + "\t" + r[0] + "\t" + r[1] + "\t\t" + r[2]);
        }
        System.out.println("\nStats:");
        System.out.println("Player\tWins\tPercentage");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2] + "%");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();
        int userWins = 0, computerWins = 0;
        List<String[]> results = new ArrayList<>();
        for (int i = 0; i < games; i++) {
            String user = sc.next().toLowerCase();
            String computer = getComputerChoice();
            String winner = findWinner(user, computer);
            if (winner.equals("user")) userWins++;
            else if (winner.equals("computer")) computerWins++;
            results.add(new String[]{user, computer, winner});
        }
        String[][] stats = calculateStats(userWins, computerWins, games);
        displayResults(results, stats);
    }
}
