package rpg;
// A class is a custom type that groups variables together

/**
 * A representation of a character in a fighting game.
 */
public class Character {
  // properties of a character
  public String name;
  public int hitpoints;
  public int atk;
  public int def;

  public Character(String name, int hitpoints, int atk, int def) {
    this.name = name;
    this.hitpoints = hitpoints;
    this.atk = atk;
    this.def = def;
  }
}
