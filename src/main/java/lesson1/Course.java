package lesson1;

public class Course {
    private double lenghtTreadmill;
    private double lenghtPool;

    public Course(double lenghtTreadmill, double lenghtPool) {
        this.lenghtTreadmill = lenghtTreadmill;
        this.lenghtPool = lenghtPool;
    }

    public double getLenghtTreadmill() {
        return lenghtTreadmill;
    }

    public void setLenghtTreadmill(double lenghtTreadmill) {
        this.lenghtTreadmill = lenghtTreadmill;
    }

    public double getLenghtPool() {
        return lenghtPool;
    }

    public void setLenghtPool(double lenghtPool) {
        this.lenghtPool = lenghtPool;
    }

    public double doIt(Team team) {
        double timeToOvercome = team.getPower() - 10 * this.getLenghtPool() - 3 * this.getLenghtTreadmill();
        return team.setPower(timeToOvercome);
    }

}
