public class Dogfight extends Battle {
    private boolean isFighting;
    private int planeCasualties;
    private int planes;
    public Dogfight(int planes) {
        isFighting = true;
        this.planes = planes;
        if (isFighting = true) {
            System.out.println("|Battle Begin|");
        }
        System.out.println("|You Have " + planes  + " of our planes in the air|");
    }
    public void myPilotCasualties() {
        if (planeCasualties <= planes/2) {
            System.out.println("|Victory|");
        } else if (planeCasualties > planes/2) {
            isFighting = false;
            System.out.println("|Defeat|");
        }
        System.out.println("|Battle Over|");
        System.out.println("|You lost " + planeCasualties + " of our planes in battle|");
    }
    public void fightEnemy() {
        if (isFighting == true) {
            System.out.println("|Battle in progress|");
            this.planeCasualties = (int)(Math.random() * this.planes) + 1;
        } else if (isFighting == false) {
            System.out.println("|Reset to battle again|");
        }
    }
}
