public class Dogfight extends Battle {
    private boolean isfighting;
    private int planeCasualties;
    private int planes;
    public Dogfight(int planes) {
        isfighting = true;
        this.planes = planes;
        if (isfighting = true) {
            System.out.println("|Battle Begin|");
        }
        System.out.println("|You Have " + planes  + " planes in the air|");
    }
    public void myPilotCasualties() {
        isfighting = false;
        if (planeCasualties <= planes/2) {
            System.out.println("|Victory|");
        } else if (planeCasualties > planes/2) {
            System.out.println("|Defeat|");
        }
        System.out.println("|Battle Over|");
        System.out.println("|You lost " + planeCasualties + " planes in battle|");
    }
    public void fightEnemy() {
        System.out.println("|Battle in progress|");
        this.planeCasualties = (int)(Math.random() * this.planes) + 1;
    }
}
