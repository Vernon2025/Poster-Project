public class TestClass {
    public static void main(String[] args) {
        Battle a = new Battle();
        a.planeBattle();
        a.getBattleType();
        
        Dogfight b = new Dogfight(10);
        b.fightEnemy();
        b.myPilotCasualties();
    }
}
