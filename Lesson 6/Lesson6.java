import java.util.Scanner;

public class Lesson6 {

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

  /**
   * Counts the number of times a number shows up in an array.
   * @param arr The array to search
   * @param num The number to count
   */
  public static int count(int[] arr, int num) {
    //          ^^^       ^^^^^^^^^^^^^^^^^^
    //    input type          inputs! (parameters)
    int count = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == num) {
        count++;
      }
    }

    return count; // output of the function
  }

  public static void main(String[] args) {
    // boolean isYes = promptYesOrNo();
    Character myCharacter = new Character("Emmy", 100);

    if (prompt("Are you satisfied with your character " + myCharacter.name + "?")) {
      System.out.println("You said yes! YAY!");
    }

    int[] arr = {1, 1, 2, 2, 3, 3, 3, 4};
    int numToSearch = 1;
    int count = count(arr, numToSearch);
    System.out.println("Number of " + numToSearch + "'s is: " + count);


  }
}
