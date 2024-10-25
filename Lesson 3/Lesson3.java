import java.util.Scanner; // Make sure to import this!

public class Lesson3 {
  public static void main(String... args) {
    // Section I: Input

    // We've seen output using System out. Now let's do input using System.in

    Scanner scanner = new Scanner(System.in);

    String input = scanner.nextLine();
    System.out.println(input); // "echoes" what you input

    scanner.close(); // Gotta close it after you're done. Just like closing a file afte you're done

    // Section II: Basic string manipulation

    // Sometimes you don't care what case the input is.
    // In that case you can convert all the characters to lower case.
    System.out.println(input.toLowerCase());

    // You can also compare Strings ignoring case
    if (input.equalsIgnoreCase("Hello")) {
      System.out.println("Hello back!");
    }

    // Sometimes you also want to get rid of leading or trailing whitespace
    String str = "           Hello            ";
    System.out.println(str.strip());  // Prints "Hello"
  }
}
