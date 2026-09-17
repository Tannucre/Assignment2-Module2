import java.util.Scanner;

class Team {
    protected String name;
    protected int matchesPlayed, wins, draws;

    public Team(String name, int matchesPlayed, int wins, int draws) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.wins = wins;
        this.draws = draws;
    }

    public int calculatePoints() {
        return 0;
    }
}

class CricketTeam extends Team {
    public CricketTeam(String name, int matchesPlayed, int wins, int draws) {
        super(name, matchesPlayed, wins, draws);
    }

    @Override
    public int calculatePoints() {
        return (wins * 2) + (draws * 1);
    }

    @Override
    public String toString() {
        return "Team: " + name + " (Cricket) Points: " + calculatePoints();
    }
}

class FootballTeam extends Team {
    public FootballTeam(String name, int matchesPlayed, int wins, int draws) {
        super(name, matchesPlayed, wins, draws);
    }

    @Override
    public int calculatePoints() {
        return (wins * 3) + (draws * 1);
    }

    @Override
    public String toString() {
        return "Team: " + name + " (Football) Points: " + calculatePoints();
    }
}

public class SportsLeague {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;
            String[] p = line.split(",\\s*");
            if (p[0].equalsIgnoreCase("Cricket")) {
                System.out.println(new CricketTeam(p[1], Integer.parseInt(p[2]), Integer.parseInt(p[3]), Integer.parseInt(p[4])));
            } else {
                System.out.println(new FootballTeam(p[1], Integer.parseInt(p[2]), Integer.parseInt(p[3]), Integer.parseInt(p[4])));
            }
        }
    }
}