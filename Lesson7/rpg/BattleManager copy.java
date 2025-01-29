package rpg;

import java.util.Scanner;

public class BattleManager {
  private static final BattleManager INSTANCE = new BattleManager();
  public RPGCharacter activePlayer;

  private BattleManager() {

  }


  private void m_printOption(String option) {
    System.out.print("[" + option.charAt(0) + "]");

    for (int i = 1; i < option.length(); i++) {
      System.out.print(option.charAt(i));
    }

    System.out.println();
  }

  private boolean checkInput(String input, String[] options) {

    char inputChar = Character.toUpperCase(input.charAt(0));

    for (int i = 0; i < options.length; i++) {
      char optionsChar = Character.toUpperCase(options[i].charAt(0));

      if (inputChar == optionsChar)  {
        return true; // Found a match!
      }
    }

    System.out.println("Invalid option.");
    System.out.println();
    // Oop. The first character of the input didn't match any of the first characters' of the options.
    return false;
  }

  private char promptOption(RPGCharacter c, String[] options) {
    Scanner scanner = new Scanner(System.in);
    String input;

    do {
      System.out.println(c.name + "'s " + "turn! What will they do?");
      for (int i = 0; i < options.length; i++) {
        // "recover" -> [r]ecover
        this.m_printOption(options[i]);
      }

      System.out.print("Your choice: ");
      input = scanner.nextLine();
    } while (!this.checkInput(input, options));

    scanner.close();

    return input.charAt(0);
  }

  private void processOption(RPGCharacter c1, RPGCharacter c2, char option) {

  }

  public void battle(RPGCharacter c1, RPGCharacter c2) {
    // System.out.println(String.format("A battle has begun! %s and %s are battling! GO!", c1.name, c2.name))
    System.out.println("A battle has begun! " + c1.name + " and " + c2.name + " are battling! GO!");
    String[] options = {"Attack", "Magic Attack", "Rest", "Heal"};
    char chosenOption;

    while(true) {
      System.out.println(c1);
      this.processOption(c1, c2, this.promptOption(c1, options));

      System.out.println(c2);
      this.processOption(c2, c1, this.promptOption(c2, options));

    }
  }


  public static BattleManager getInstance() {
    return INSTANCE;
  }
}
