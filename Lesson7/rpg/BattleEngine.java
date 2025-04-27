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

  private boolean m_isValidInput(String input, String[] options) {
    char firstInputChar = Character.toUpperCase(input.charAt(0));

    for (int i = 0; i < options.length; i++) {
      if (firstInputChar == Character.toUpperCase(options[i].charAt(0))) {
        return true;
      }
    }

    System.out.println("Invalid option.");
    System.out.println();
    return false;
  }

  public char promptOptions(RPGCharacter c, String[] options) {
    String input;

    do {
      System.out.println(c.name + "'s " + "turn! What will they do?");

      for (int i = 0; i < options.length; i++) {
        this.m_printOption(options[i]);
      }

      System.out.print("Your choice: "));
      input = SCANNER.nextLine();

    } while (!this.m_isValidInput(input, options));

    return Character.toLowerCase(input.charAt(0));
  }

  /**
   * Have c1 perform the action specified by option. If its an attack, the attack is performed by c1 on c2.
   * @param c1 The character to perform the action
   * @param c2 The character the action is performed on
   * @param option The option that specifies the action
   */
  private void processOption(RPGCharacter c1, RPGCharacter c2, char option) {
    switch (option) {
      case 'a':
        c1.genericAttack(c2);
        break;
      case 'm':
        c1.magicAttack(c2);
        break;
      case 'r':
        c1.rest();
        break;
      case 'h':
        c1.heal();
        break;
      default:
        System.out.println("Invalid option."); // This should never happen...
        break;
    }
  }

  /**
   * Initiate a battle between two characters.
   * @param c1 The first character. Goes first.
   * @param c2 The second character. Goes second.
   */
  public void battle(RPGCharacter c1, RPGCharacter c2) {
    String[] options = {"Attack", "Magic Attack", "Rest", "Heal"};
    System.out.println("A battle has begun! " + c1.name + " and " + c2.name + " are battling! GO!");

    while (true) {
      // C1's turn
      System.out.println(c1);
      System.out.println(c2);
      this.processOption(c1, c2, this.promptOptions(c1, options));
      if (c2.hitpoints == 0) {
        System.out.println("Battle end! " + c1.name + " has won!");
        break;  // exits the loop!
      }

      System.out.println();

      // C2's turn
      System.out.println(c1);
      System.out.println(c2);
      this.processOption(c2, c1, this.promptOptions(c2, options));
      if (c1.hitpoints == 0) {
        System.out.println("Battle end! " + c2.name + " has won!");
        break;  // exists the loop!
      }
    }

  }

}
