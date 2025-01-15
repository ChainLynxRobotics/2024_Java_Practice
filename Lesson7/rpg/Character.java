package rpg;
// A class is a custom type that groups variables together

/**
 * A representation of a character in a fighting game.
 */
public class Character {
  // properties of a character
  public String name;
  public int mana;
  public int stamina;
  public int hitpoints;
  public int atk;
  public int def;

  public Character(String name, int hitpoints, int mana, int stamina, int atk, int def) {
    this.name = name;

    this.mana = mana;
    this.stamina = stamina;

    this.hitpoints = hitpoints;

    this.atk = atk;
    this.def = def;
  }

  public void magicAttack(Character c) {
    System.out.println(this.name + " used magic attack!");

    if (this.stamina < 10) {
      System.out.println("But it failed! Not enough stamina! Need at least 10!");
      return; // exits the function immediately.
    }

    if (this.mana < 10) {
      System.out.println("But it failed! Not enough mana! Need at least 10!");
      return; // exits the function immediately.
    }

    this.stamina -= 10;
    this.mana -= 10;
    c.hitpoints -= this.atk * 2;
  }

  public void genericAttack(Character c) {
    System.out.println(this.name + " used generic attack!");

    if (this.stamina < 10) {
      System.out.println("But it failed! Not enough stamina! Need at least 10!");
      return; // exits the function immediately.
    }

    this.stamina -= 10;
    c.hitpoints -= Math.max(this.atk - c.def, 0);

  }

  public String toString() {
    return String.format("""
        %s Stats:

        Hitpoints: %d
        Atk: %d
        Def: %d
        """, this.name, this.hitpoints, this.atk, this.def);
  }
}
