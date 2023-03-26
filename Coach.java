public class Coach extends Employee {
    private int careerWins;

    public Coach(String name, double salary, int careerGames, int yearsInHockey, int careerWins) {
        super(name, salary, careerGames, yearsInHockey);
        this.careerWins = careerWins;
    }

    public int getCareerWins() {
        return careerWins;
    }

    public double getWinningPercentage() {
        return (double) careerWins / getCareerGames();
    }

    @Override
    public void yearlyUpdate(int gamesPlayed) {
        setCareerGames(getCareerGames() + gamesPlayed);
        setYearsInHockey(getYearsInHockey() + 1);
    }
}
