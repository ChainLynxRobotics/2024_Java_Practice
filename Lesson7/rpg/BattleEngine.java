package rpg;

import java.util.Scanner;

public class BattleEngine {
  private static final BattleEngine INSTANCE = new BattleEngine();
  private static final Scanner SCANNER = new Scanner(System.in);

  private BattleEngine() {}

  public static final BattleEngine getInstance() {
    return
    INSTANCE;
  }

  private void m_printOption(String option) {
    System.out.print("[" + option.charAt(0) + "]");
    for (int i = 1; i < option.length(); i++) {
      System.out.print(option.charAt(i));
    }
    System.out.println();
  }

  public char promptOptions(RPGCharacter c, String[] options) {
    String input;
    do {
      System.out.println(c.name + "'s " + "turn! What will they do?");

      for (int i = 0; i < options.length; i++) {
        this.m_printOption(options[i]);
      }

      System.out.print("Your choice: ");
      input = SCANNER.nextLine();

    } while (true);
  }

  /**
   * Initiate a battle between two characters.
   * @param c1 The first character. Goes first.
   * @param c2 The second character. Goes second.
   */
  public void battle(RPGCharacter c1, RPGCharacter c2) {
    String[] options = {"Attack", "Magic Attack", "Rest", "Heal"};
    System.out.println("A battle has begun! " + c1.name + " and " + c2.name + " are battling! GO!");
    System.out.println(c1);
    this.promptOptions(c1, options);

  }

}
