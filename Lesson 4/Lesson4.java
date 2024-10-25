import java.util.Scanner;

public class Lesson4 {
  public static void main(String... args) {
    /*
     * Up until now we've told the computer to do one off instructions
     * But sometimes it's useful to tell it to repeat something.
     *
     * Enter loops!
     */

    // Let's count to 10!
    int i = 0;
    while (i < 10) {  // This get's checked every loop cycle.
      //  ^^^^^^^^
      //  This is the condition. They're the same as we saw in if statements.

      // The computer will repeat the action here until the condition is false.

      System.out.println("while i: " + i);
      i++;  // Add 1 to i
    }

    // The loop stops repeating when i hits 10 since 10 is not less than 10.
    System.out.println("while i last: " + i);   // This prints 10.

    // Another kind of loop is the do while loop.
    // How are they different?  While checks the condition before you start.
    // Do while runs it once and then checks the condition.
    // You can think about it checking "at the top" vs. "at the bottom."

    // Below is an example.

    i = 10;
    while (i < 10) {
      System.out.println("while ran!");  // This doesn't print
      i++;
    }


    do {
      System.out.println("do while ran!");  // This does print.
      i++;
    } while(i < 10);
    //             ^ Don't forget that semicolon! It's a fairly common mistake!

    // Do while can be useful for lots of things. Let's see an example
    // where we ask the user a yes/no question and keep asking until
    // they say yes or no (case insensitive, whitespace insensitive)

    Scanner scanner = new Scanner(System.in);
    Stirng input;   // We can't use ahe while loop since we won't have gotten input until the first loop.
    do {
      System.out.println("Yes or no: ");  // Ask the user a question and keep asking until we get a yes/no answer.
      input = scanner.nextLine().strip(); // Get the next line of input and strip the whitespace.

      /*
       * Note: the above is a shorter way to write:
       * input = scanner.nextLine();
       * input = input.strip();
       */
    } while(input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("no"));
    scanner.close();  // Don't forget to close!
  }
}
