public class Goaltender extends Player {
    private int goalsAgainst;
    private int saves;
    private int wins;
    private int shutouts;
    
    public Goaltender(String name, double salary, int careerGames, int yearsInHockey, int jerseyNumber, int careerMinutesPlayed, int goalsAgainst, int saves, int wins, int shutouts) {
        super(name, salary, careerGames, yearsInHockey, jerseyNumber, careerMinutesPlayed);
        this.goalsAgainst = goalsAgainst;
        this.saves = saves;
        this.wins = wins;
        this.shutouts = shutouts;
    }
    
    public int getGoalsAgainst() {
        return goalsAgainst;
    }
    
    public int getSaves() {
        return saves;
    }
    
    public int getWins() {
        return wins;
    }
    
    public int getShutouts() {
        return shutouts;
    }
    
    public double getValue() {
        return (3 * wins + 0.2 * saves + 2 * shutouts - goalsAgainst) / (double) getYearsInHockey();
    }
    
    public void yearlyUpdate(int gamesPlayed, int minutesPlayed, int goalsAgainst, int saves, int wins, int shutouts) {
        super.yearlyUpdate(gamesPlayed);
        setCareerMinutesPlayed(getCareerMinutesPlayed() + minutesPlayed);
        this.goalsAgainst += goalsAgainst;
        this.saves += saves;
        this.wins += wins;
        this.shutouts += shutouts;
    }
    
    public double getGoalsAgainstAverage() {
        return (goalsAgainst * 60.0) / getCareerMinutesPlayed();
    }
}