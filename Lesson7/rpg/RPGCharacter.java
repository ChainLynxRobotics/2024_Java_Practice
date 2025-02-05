package rpg;
// A class is a custom type that groups variables together

/**
 * A representation of a character in a fighting game.
 */
public class RPGCharacter {
  public static final int MAGIC_ATK_REQUIRED_STAMINA = 10;
  private static final int MAX_BARS = 20;

  // properties of a character
  public String name;
  public int maxMana;
  public int mana;

  public int maxStamina;
  public int stamina;

  public int maxHitpoints;
  public int hitpoints;

  public int atk;
  public int magicAtk;
  public int def;

  public RPGCharacter(
      String name,
      int maxHitpoints,
      int maxMana,
      int maxStamina,
      int atk,
      int magicAtk,
      int def
    ) {
    this.name = name;

    this.maxMana = maxMana;
    this.mana = maxMana;

    this.maxStamina = maxStamina;
    this.stamina = maxStamina;

    this.maxHitpoints = maxHitpoints;
    this.hitpoints = maxHitpoints;

    this.atk = atk;
    this.magicAtk = magicAtk;
    this.def = def;
  }


  /**
   * @param requiredStamina
   * @return True if the character has greater than requiredStamina, False otherwise.
   */
  private boolean m_checkStamina(int requiredStamina) {
    if (this.stamina < requiredStamina) {
      System.out.println("But it failed! Not enough stamina! Need at least " + requiredStamina + "!");
      return false;
    }
    return true;
  }

  /**
   * @param requiredMana
   * @return True if the character has greater than requiredStamina, False otherwise.
   */
  private boolean m_checkMana(int requiredMana) {
    if (this.mana < requiredMana) {
      System.out.println("But it failed! Not enough mana! Need at least " + requiredMana + "!");
      return false;
    }

    return true;
  }

  /**
   * Perform a magical attack on the specified character.
   * This attack requires 10 stamina and 10 mana to complete.
   * Magical attacks ignore defense.
   *
   * @param c - The character to attack.
   */
  public void magicAttack(RPGCharacter c) {
    System.out.println(this.name + " used magic attack!");

    // guards!
    if (!this.m_checkStamina(10)) {
      return;
    }

    if (!this.m_checkMana(10)) {
      return;
    }

    this.stamina -= 10;
    this.mana -= 10;
    c.hitpoints = Math.max(c.hitpoints - this.magicAtk, 0);
  }

  /**
   * Perform a generic attack on the specified character.
   * This attack requires 10 stamina.
   *
   * @param c - The character to attack.
   */
  public void genericAttack(RPGCharacter c) {
    System.out.println(this.name + " used generic attack!");

    if (!this.m_checkStamina(10)) {
      return;
    }

    this.stamina -= 10;
    c.hitpoints = Math.max(c.hitpoints - Math.max(this.atk - c.def, 0), 0);
  }

  /**
   * Recover 20 stamina.
   */
  public void rest() {
    // this.stamina += 20;
    this.stamina = Math.min(this.stamina + 20, this.maxStamina);

  }

  /**
   * Heal 25 HP at the cost of 10 stamina.
   */
  public void heal() {
    if (!this.m_checkStamina(10)) {
      return;
    }

    this.hitpoints = Math.min(this.hitpoints + 25, this.maxHitpoints);

    /*
    if (this.hitpoints > this.maxHitpoints) {
      this.hitpoints = this.maxHitpoints;
    }
    */
  }

  public String createBar(int current, int total) {
    // [====================] 10/100
    double percentage = (double)current / (double)total;
    int numBars = (int)(MAX_BARS * percentage);
    int numSpaces = MAX_BARS - numBars;

    int r = 0, g = 0, b = 0;

    if (percentage > .5) {
      r = 0;
      g = 114;
      b = 24;
    }
    else if (percentage > .2 && percentage <= .5) {
      r = 237;
      g = 229;
      b = 0;
    }
    else if (percentage <= .2) {
      r = 255;
      g = 0;
      b = 0;
    }

    String bar = String.format("|\033[48;2;%d;%d;%dm", r, g, b);


    for (int i = 0; i < numBars; i++) {
      bar += " ";
    }

    bar += "\033[0m";

    for (int i = 0; i < numSpaces; i++) {
      bar += " ";
    }

    bar += "| (" + current + "/" + total + ")";
    return bar;
  }

  public String toString() {

    String str = this.name + " Stats: \n\n";
    str += "Stamina: " + this.createBar(this.stamina, this.maxStamina) + "\n";
    str += "Hitpoints: " + this.createBar(this.hitpoints, this.maxHitpoints) + "\n";
    str += "Mana: " + this.createBar(this.mana, this.maxMana) + "\n";
    str += "Magic Atk: " + this.magicAtk + "\n";
    str += "Atk: " + this.atk + "\n";
    str += "Def: " + this.def + "\n";


    return str;
    /*
    return String.format("""
        %s Stats:

        Stamina: %s
        Hitpoints: %s
        Mana: %s
        Magic Atk:
        Atk: %d
        Def: %d
        """,
        this.name,
        this.createBar(this.stamina, this.maxStamina),
        this.createBar(this.hitpoints, this.maxHitpoints),
        this.createBar(this.mana, this.maxMana),
        this.magicAtk,
        this.atk,
        this.def);
    */
  }
}
