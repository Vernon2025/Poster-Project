public class Capture extends Battle {
    private int infantryCasualties;
    private int soldiers;
    private boolean isFighting;
    private boolean canSeize;
    private boolean isVictory;
    public void soldiersFightBattlefield(int soldiers) {
        isFighting = true;
        if (isFighting = true) {
            System.out.println("|Battle begin|");
        } 
        System.out.println("|Battle in progress|");
        this.infantryCasualties = (int)(Math.random() * this.soldiers) + 1;
        if (infantryCasualties <= soldiers/2) {
            isVictory = true;
            canSeize = true;
        } else if (infantryCasualties <= soldiers/2) {
            isVictory = false;
            canSeize = false;
        }
    }
    public void getSoldierCasualties() {
        System.out.println("|You lost " + infantryCasualties + " of our soldiers in battle|");
        if (isVictory && canSeize == true) {
            System.out.println("|You may proceed to seize the objective|");
        } else if (isVictory && canSeize == false) {
            System.out.println("|Cannot proceed the assualt|");
            System.out.println("|Defeat|");
        } 
    }
    public void canSeizeObjective() {
        String seizeProgress[] = {"25%", "50%", "75%", "100%"};
        System.out.println("|Seize in progress|");
        for (int i = 0; i < seizeProgress.length;i++) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            System.out.println(seizeProgress[i]);
        }
        if (isVictory && canSeize == true) {
            System.out.println("|Our soldiers captured the objective!|");
            System.out.println("|Victory|");
        }
    }
}