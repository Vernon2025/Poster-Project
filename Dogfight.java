public class Dogfight {
    private boolean isfighting;
    private int planeCasualties;
    private int planes;
    public Dogfight(int planes) {
        this.planes = planes;
        this.fight();
    }
    public int getCasualties() {
        return planeCasualties;
    }
    public void fight() {
        this.planeCasualties = (int)(Math.random() * this.planes) + 1;
    }
}