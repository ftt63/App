public class Skater extends Player {
    private int goals;
    private int assists;

    public Skater(String name, double salary, int careerGames, int yearsInHockey, int jerseyNumber, int careerMinutesPlayed, int goals, int assists) {
        super(name, salary, careerGames, yearsInHockey, jerseyNumber, careerMinutesPlayed);
        this.goals = goals;
        this.assists = assists;
    }

    public int getGoals() {
        return goals;
    }

    public int getAssists() {
        return assists;
    }

    public double getValue() {
        return (3 * goals + 2 * assists) / (double) goals;
    }

    public void yearlyUpdate(int gamesPlayed, int minutesPlayed, int goals, int assists) {
        super.yearlyUpdate(gamesPlayed);
        setCareerMinutesPlayed(getCareerMinutesPlayed() + minutesPlayed);
        this.goals += goals;
        this.assists += assists;
    }

    public int getPoints() {
        return goals + assists;
    }
}
