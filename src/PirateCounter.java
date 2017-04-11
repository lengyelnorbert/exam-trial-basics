import java.util.*;

public class PirateCounter {

  static PirateCounter pc = new PirateCounter();
  static ArrayList<Pirate> pirates;

  class Pirate {

    String name;
    boolean hasWoodenLeg;
    int gold;

    Pirate(String name, boolean hasWoodenLeg, int gold) {
      this.name = name;
      this.hasWoodenLeg = hasWoodenLeg;
      this.gold = gold;
    }
  }

  public static void main(String[] args) {

    pc.addPirates();
    System.out.println(piratesWithWoodenLegAndGold(pirates));
  }

  public void addPirates() {
    ArrayList<Pirate> pirates = new ArrayList<>();
    pirates.add(new Pirate("Olaf", false, 12));
    pirates.add(new Pirate("Uwe", true, 9));
    pirates.add(new Pirate("Jack", true, 16));
    pirates.add(new Pirate("Morgan", false, 17));
    pirates.add(new Pirate("Hook", true, 20));
  }

  public static List<String> piratesWithWoodenLegAndGold(List<Pirate> originalPirateList) {
    List<String> piratesNames = new ArrayList<>();
    for (Pirate p : originalPirateList) {
      if (p.hasWoodenLeg && p.gold > 15) {
        piratesNames.add(p.name);
      }
    }
    return piratesNames;
  }
}
