public class TestClass {
    public static void main(String[] args) {
        Battle a = new Battle();
        a.planeBattle();
        a.getBattleType();
        
        Dogfight b = new Dogfight(10);
        b.fightEnemy();
        b.myPilotCasualties();
        
        Battle a2 = new Battle();
        a2.tankBattle();
        a2.getBattleType();
        
        Destroy d = new Destroy();
        
        Battle a1 = new Battle();
        a1.infantryBattle();
        a1.getBattleType();
        
        Capture c = new Capture();
        c.soldiersFightBattlefield(10);
        c.getSoldierCasualties();
        c.canSeizeObjective();
    }
}
