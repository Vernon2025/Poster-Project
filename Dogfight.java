public class Dogfight extends Battle {
    private boolean isfighting;
    private int planeCasualties;
    private int planes;
    public Dogfight(int planes) {
        this.planes = planes;
        this.fight();
    }
    public int getCasualties() {
        if (planeCasualties <= planes/2) {
            System.out.println("Victory");
        } else if (planeCasualties > planes/2) {
            System.out.println("Defeat");
        }
        return planeCasualties;
    }
    public void fight() {
        this.planeCasualties = (int)(Math.random() * this.planes) + 1;
    }
}
