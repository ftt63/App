public class Main {
    public static void main(String[] args) {
        Coach coach = new Coach("Mike Babcock", 5000000, 1500, 20, 1000);
        Goaltender goaltender = new Goaltender("Carey Price", 10000000, 700, 15, 31, 40000, 1500, 21000, 350, 45);

        Team team = new Team(coach, goaltender);

        Skater skater1 = new Skater("Sidney Crosby", 9000000, 980, 16, 87, 20000, 450, 700);
        Skater skater2 = new Skater("Alex Ovechkin", 9500000, 1100, 17, 8, 22000, 700, 550);

        team.addSkater(skater1);
        team.addSkater(skater2);

        System.out.println("Coach: " + team.getCoach().getName());
        System.out.println("Goaltender: " + team.getGoaltender().getName());
        System.out.println("Skaters: ");
        for (Skater skater : team.skaters) {
            System.out.println("  " + skater.getName());
        }
    }
}