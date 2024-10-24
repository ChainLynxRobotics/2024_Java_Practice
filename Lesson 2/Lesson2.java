public class Lesson2 {
  public static void main(String... args) {
    // Section I: The Boolean Type

    boolean b = true; // Booleans represent either true or false.
    // They're named after George Boole, who invented the concept of booleans

    // We typically name a boolean starting with "is" or "has" so it's like a question
    boolean isRaining = false;
    boolean isWindy = true;
    boolean hasUmbrella = true;

    // We typically using camelCase to name variables where the first letter is always lowercase
    // And the first letter of each following word is uppercase

    // Section II: Logical "and", "not", and "or"

    // We can combine boolean values using logical operators
    boolean isRainingAndIsCloudy = isRaining && isWindy;   // false because both aren't true
    boolean isRainingOrIsCloudy = isRaining || isWindy;   // true because at least one is true
    boolean isNotRaining = !isRaining; // false because isRaining is true
    boolean isNotWindy = !isWindy; // false because isWindy is true

    /*
     * && (and) is true if both operands are true, false otherwise.
     * || (or) is true if at least one of the operands are true and false otherwise
     * ! (not) is true if the operand is false
     */

    // We can also combine them. Stuff in parentheses happen first. otherwise they're computed left to right
    // If you're unsure just add parentheses!
    boolean hasRaincoat = false;
    boolean isPreparedForWeather = isRaining && (hasUmbrella || hasRaincoat);

    // Section III: Comparing Numbers
    int x = 1, y = 2, z = 2;

    System.out.println("x < y: " + (x < y)); // true because x is less than y
    System.out.println("x >= y: " + (x >= y)); // false because x is  not greater than or equal to y
    System.out.println("x > y: " + (x > y)); // false because x is not greater than y
    System.out.println("x <= y: " + (x <= y)); // true because x is less than or equal to y
    System.out.println("x == y: " + (y == z)); // true because y is equal to z
    System.out.println("x != y: " + (x != y)); // true because x is not equal y

    // Be careful when comparing floats/doubles for equality.
    // Rounding can occur since computers don't have infinite accuracy.

    double u = 0.1, v = 0.2;

    System.out.println("0.1 + 0.2 = " + (u + v));  // 0.1 + 0.2 = 0.30000000000000004...? round-off error
    System.out.println("u + v == 0.3: " + ((u + v) == 0.3)); // false because of round off

    // Properly compare two floats/doubles by checking if they're close to each other.
    // You can do this in general by checking if the absolute value of the difference is less than a tolerance

    double tolerance = 0.001;
    boolean isUCloseToV = Math.abs((u + v) - 0.3) < 0.001; // Check if u + v is within 0.001 of 0.3
    System.out.println("u + v ~ 0.3: " + isUCloseToV); // true!

    // Section IV: Comparing Strings

    String str1 = "hello", str2 = "Hello";

    // Comparing strings is a bit unique (we'll see why later).
    System.out.println(str1.equals(str2)); // Will be false since it's case sensitive.

    // Section V: If statements

    // Ideally we'd like to be able to make decisions in our program. Let's see how to do that.

    x = 0;
    y = 1;
    if (x < y) {
      // ^^^^
      // This is called the condition. The part inside the braces below will run
      // When the condition is true.

      System.out.println("x < y"); // This will print since x < y is true.
    }

    String order = "burger";

    // Will check order to see if it is burger, hot dog, or fries in that order.
    if (order.equals("burger")) {
      System.out.println("Your order was a burger");
    }
    else if (order.equals("hot dog")) { // else if is checked only if everything above it is false.
      System.out.println("Your order was a hot dog");

    }
    else if (order.equals("fries")) {
      System.out.println("Your order was fries");

    }
    else { // Runs only if none of the above were true
      System.out.println("Unknown order");
    }


    // It's important to remember that the first
    // condition that is true will be executed. Let's see an example

    x = 0;
    y = 0;

    if (x < y) {
      System.out.println("x < y");
    }
    else if (x <= y) {
      System.out.println("x <= y"); // This prints
    }
    else if (x == y) {
      System.out.println("x == y");  // This doesn't
    }

    // If you're comparing with a bunch of constants you also have another option
    // switch case!

    if (x == 0) {

    }
    else if (x == 1) {

    }
    else if (x == 2) {

    }
    else {

    }


    // Same as:
    // Why use switch case? Can be easier to read...
    // Also it's faster than if. If has to check each else if above it
    // Case switch can jump to the case even if you have lots of them.
    switch (x) {
      case 0:
        break;  // Don't forget these...

      case 1:
        break;

      case 2:
        break;

      default:
        break;
    }

    // What happens if we don't break?

    x = 0;

    // You "fall through" to the next case. All of them print!
    switch (x) {
      case 0:
        System.out.println("0");

      case 1:
        System.out.println("1");

      case 2:
        System.out.println("2");

      default:
        break;
    }

  }
}
