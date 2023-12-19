package lesson1;

public class Team {
    protected String teamName;
    private double power;

    public Team(String teamName, double power) {
        this.teamName = teamName;
        this.power = power;

    }

    @Override
    public String toString() {
        return "{" +
                "name='" + teamName + ", power = " + power +
                '}';
    }

    public double getPower() {
        return power;
    }

    public double setPower(double power) {
        this.power = power;
        return power;
    }

    public String getTeam() {
        return teamName;
    }

    public void setTeam(String team) {
        this.teamName = teamName;
    }

    public void showResults() {

        if (power >= 0) {
            System.out.print("Участник прошел полосу препятствий: ");
            printInfo();
        }
    }

    public void printInfo() {

        System.out.printf("Имя - %s с силами %s %n", teamName, power);
    }

}
