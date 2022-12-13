public class Battle {
  private boolean hasInfantry;
  private boolean hasPlane;
  private boolean hasTank;
  private String hasArmy;
  public void getBattleType() {
      hasArmy = "We all fight!";
      if (hasInfantry && hasTank && hasPlane == true) {
          System.out.println(hasArmy);
      } else if (hasInfantry == true) {
          System.out.println("INFANTRY BATTLE");
      } else if (hasPlane == true) {
          System.out.println("AIR BATTLE");
      } else if (hasTank == true) { 
          System.out.println("TANK BATTLE");
      }   
    }
  public void allOutWar() {
      hasInfantry = true;
      hasPlane= true;
      hasTank = true;
  }
  public void infantryBattle() {
      hasInfantry = true;
      hasPlane= false;
      hasTank = false;
  }
  public void planeBattle() {
      hasInfantry = false;
      hasPlane= true;
      hasTank = false;
  }
  public void tankBattle() {
      hasInfantry = false;
      hasPlane= false;
      hasTank = true;
  }
}
