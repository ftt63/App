import java.util.ArrayList;

public abstract class Employee {
    private String name;
    private double salary;
    private int careerGames;
    private int yearsInHockey;

    public Employee(String name, double salary, int careerGames, int yearsInHockey, int careerMinutesPlayed) {
        this.name = name;
        this.salary = salary;
        this.careerGames = careerGames;
        this.yearsInHockey = yearsInHockey;
        this.careerMinutesPlayed = careerMinutesPlayed;
    }
    

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getCareerGames() {
        return careerGames;
    }

    public int getYearsInHockey() {
        return yearsInHockey;
    }

    public abstract void yearlyUpdate(int gamesPlayed);
}

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