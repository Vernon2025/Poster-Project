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
        int remain = soldiers/infantryCasualties;
        System.out.println("|You lost " + infantryCasualties + " of our soldiers and " + remain + " remain|");
        if (isVictory && canSeize == true) {
            System.out.println("|You may proceed to seize the objective|");
        }
    }
    public void canSeizeObjective() {
        if (isVictory && canSeize == true) {
            System.out.println("Our soldiers captured the objective!");
        }
    }
    public void reset() {
        soldiers = 0;
    }
}