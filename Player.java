public abstract class Player extends Employee {
    private int jerseyNumber;
    private int careerMinutesPlayed;

    public Player(String name, double salary, int careerGames, int yearsInHockey, int jerseyNumber, int careerMinutesPlayed) {
        super(name, salary, careerGames, yearsInHockey);
        this.jerseyNumber = jerseyNumber;
        this.careerMinutesPlayed = careerMinutesPlayed;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public int getCareerMinutesPlayed() {
        return careerMinutesPlayed;
    }

    public void setCareerMinutesPlayed(int careerMinutesPlayed) {
        this.careerMinutesPlayed = careerMinutesPlayed;
    }

    public abstract double getValue();

    @Override
    public void yearlyUpdate(int gamesPlayed) {
        setCareerGames(getCareerGames() + gamesPlayed);
        setYearsInHockey(getYearsInHockey() + 1);
    }
}