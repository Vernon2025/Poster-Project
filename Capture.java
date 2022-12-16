public class Capture extends Battle {
    private int infantryCasualties;
    private int soldiers;
    private boolean isFighting;
    private boolean canSeize;
    private boolean isVictory;
    public void soldiersFightBattlefield(int soldiers) {
        isFighting = true;
        this.soldiers = soldiers;
        if (isFighting = true) {
            System.out.println("|Battle begin|");
            System.out.println("|Battle in progress|");
            this.infantryCasualties = (int)(Math.random() * this.soldiers) + 1;
        }
        if (infantryCasualties <= soldiers/2) {
            canSeize = true;
        } else if (infantryCasualties > soldiers/2) {
            canSeize = false;
        }
    }
    public void getSoldierCasualties() {
        System.out.println("|You lost " + infantryCasualties + " of our soldiers in battle|");
        if (canSeize == true) {
            System.out.println("|You may proceed to seize the objective|");
        } else if (canSeize == false) {
            System.out.println("|Cannot proceed the assualt|");
            System.out.println("|Defeat|");
        } 
    }
    public void canSeizeObjective() {
        String seizeProgress[] = {"25%", "50%", "75%", "100%"};
        if (canSeize == true) {
            System.out.println("|Seize in progress|");
            for (int i = 0; i < seizeProgress.length;i++) {
                try {
                Thread.sleep(3000);
                } catch (InterruptedException ie) {
                ie.printStackTrace();
                }
                System.out.println(seizeProgress[i]);
            }
            System.out.println("|Our soldiers captured the objective!|");
            System.out.println("|Victory|");
        } else if (canSeize == false) {
            System.out.println("|Can't seize objective|");
        }
        if (isFighting == false) {
            System.out.println("|Battle Over|");
        }
    }
}