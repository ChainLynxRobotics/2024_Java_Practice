package rpg;

import java.util.Scanner;



public class Lesson7 {

    /**
   * Prompts the user until they give a yes/no answer.
   * @return true if yes, false otherwise
   */
  public static boolean prompt(String question) {
    //          ^^^^^^^        ^^^^^^^^^^^^^^^
    //        output type     inputs (parameters)
    // Taken from Lesson 4
    Scanner scanner = new Scanner(System.in);

    String input;   // We can't use ahe while loop since we won't have gotten input until the first loop.
    do {
      System.out.print(question + " (yes/no): ");  // Ask the user a question and keep asking until we get a yes/no answer.
      input = scanner.nextLine().strip().toLowerCase(); // Get the next line of input and strip the whitespace.
      // debug: System.out.println("Your input was: " + input);

    } while(!(input.equals("yes") || input.equals("no")));
    scanner.close(); // dont' forget to close!

    return input.equals("yes");
  }

  public static void main(String[] args) {
    // prints out the inputs to this program
    // java Lesson7.java arg1 would print "Input #0: arg1

    for (int i = 0; i < args.length; i++) {
      System.out.println("Input #" + i +  ": " + args[i]);
    }
    // use the constructor to create a new character
    RPGCharacter characterEmmy = new RPGCharacter(
      "Emmy",
      100,
      30,
      50,
      10,
      20,
      0
    );

    RPGCharacter characterEmmy2 = new RPGCharacter(
      "Emmy2",
      150,
      0,
      80,
      15,
      0,
      5
    );

    BattleEngine.getInstance().battle(characterEmmy, characterEmmy2);
    // System.out.println(characterEmmy);
  }
}

