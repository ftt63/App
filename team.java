import java.util.ArrayList;

public class Team {
    private Coach coach;
    private Goaltender goaltender;
    private ArrayList<Skater> skaters;

    public Team(Coach coach, Goaltender goaltender) {
        this.coach = coach;
        this.goaltender = goaltender;
        this.skaters = new ArrayList<>();
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public Goaltender getGoaltender() {
        return goaltender;
    }

    public void setGoaltender(Goaltender goaltender) {
        this.goaltender = goaltender;
    }

    public int getNumSkaters() {
        return skaters.size();
    }

    public Skater getSkater(String name) {
        for (Skater skater : skaters) {
            if (skater.getName().equals(name)) {
                return skater;
            }
        }
        return null;
    }

    public void addSkater(Skater skater) {
        skaters.add(skater);
    }

    public void removeSkater(String name) {
        for (int i = 0; i < skaters.size(); i++) {
            if (skaters.get(i).getName().equals(name)) {
                skaters.remove(i);
                break;
            }
        }
    }

    public void replaceCoach(Coach newCoach) {
        coach = newCoach;
    }

    public void replaceGoaltender(Goaltender newGoaltender) {
        goaltender = newGoaltender;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Team:\n");
        sb.append("Coach: ").append(coach).append("\n");
        sb.append("Goaltender: ").append(goaltender).append("\n");
        sb.append("Skaters: ").append(skaters.size()).append("\n");
        return sb.toString();
    }
}
