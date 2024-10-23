// A comment! Comments are good for writing notes about your code

/*
 * Multiline
 * comment
 * example
 */


// Make sure the name of your class matches the file name exactly!
// We will learn more about what classes are later...
public class Lesson1 {
  //         ^^^^^^^
  //       name of class

  // Needed to make your program run!
  public static void main(String... args) {
    //                    ^^^^^^^^^^^^^^
    //          Older versions use "String[] args" here. Both work in Java 17!

    // Section I: Variables

    // Like boxes, variables store data. In Java, there are different TYPES of data.
    // To declare a variable you write [type] variableName = [value];
    //                                                              ^
    //                                             Don't forget that semi-colon!
    //                                           They're like periods in English for Java.

    // Section I.1: Integers


    int anInteger = 1; // Integers store whole numbers (positive or negative)
    int aLargeInteger = 1_000_000; // Java ignores underscores in numbers. Convienent for grouping digits!

    // Related friends that have larger or smaller capacities: byte, short, long
    byte b = 127; // goes from -128 to 127 (2^8 possible numbers)
    short s = 32_767; // goes from -32,768 to 32,767 (2^16 possible numbers)
    int i = 2_147_483_647; // goes from -2,147,483,648 to 2_147_483_647 (2^32 possible numbers)
    long l = 9_223_372_036_854_755_807l; // goes from -9,223,372,036,854,755,808 to 9,223,372,036,854,755,807 (2^64 possible numbers)

    // By default any number you'll type in is of type int.
    // long l = 9_223_372_036_854_755_807; too big for ints. You need to put an "l" at the end to tell Java it's a long.

    // Section I.2: Decimals

    double a = 3.0; // Doubles store decimals! Stores them in scientific notation
    // Like a float, but has twice as many significant figures.

    // Like ints, by default all decimals are doubles.
    // float f = 3.0; Error! You need to put and f at the end.
    float f_proper = 3.0f;

    // Section I.3: Characters and Strings

    String str = "Hi!"; // Strings are text! Write them in double quotes.
    char c = 'h'; // Characters represent one character.  Write them with single quotes

    // I like to remember that strings have more in them than characters so they need double quotes.
    // It can be tricky to spot to see if you're missing them in a lage chunk of code so look out...

    // A couple bad examples (commented out so the code runs.)
    // String strWrong = 'hi';  WRONG! You need double quotes!
    // char cWrong = "h2"; WRONG! You need single quotes

    // Section II: Output

    System.out.println("Hello, world!"); // "prints" a message to the screen and then a new line

    // Prints "blah blah"
    System.out.print("blah"); // Doesn't add a new line. Subsequent prints continue on the same line.
    System.out.println(" blah");

    // Section II: Operations

    // Section II.1: Addition, subtraction, multiplication, division

    // These work mostly like you'd expect...

    int exampleInt1 = 3;
    int exampleInt2 = 2;

    double exampleDouble1 = 0.5;
    double exampleDouble2 = 6.0;

    System.out.println(exampleInt1 * exampleInt2); // Prints 6
    System.out.println(exampleDouble1 * exampleDouble2);  // Prints 3.0

    // You can also store the result
    // It's useful to remember that "=" in Java doesn't mean equals in math, but means to "store a value"
    // We call it "assignin" a variable a value to be technical.
    exampleInt1 = exampleInt1 + 2; // This says "add 1 to example int and then store the result in the exampleInt variable"
    System.out.println(exampleInt1); // Will now be 5

    System.out.println((1 + 2)  + 4 / 2); // Java follows PEMDAS. This will print 5

    // What about mixing types?
    // In general when you mix and int and a double, you get a double.
    System.out.println(exampleInt1 * exampleDouble1); // Prints 2.5

    // What about dividing integers?
    System.out.println(exampleInt1 / exampleInt2); // Prints 2.
    // Why 2? Because 5 / 2 = 2 R 1. This is called floor division or truncated division.
    // You can think about it as "rounding down".\

    // Section II.2: Compound Assignment Operators

    int anotherInt = 0;
    double anotherDouble = 1.0;

    // Same as:
    // anotherInt = anotherInt + 1;
    // anotherDouble = anotherDouble + 1.0;
    anotherInt += 1;
    anotherDouble += 1.0;

    System.out.println(anotherInt); // Prints 1
    System.out.println(anotherDouble); // Prints 2.0

    // *=, /= are similar. Be careful with division with integers...
    anotherDouble *= 2;
    anotherInt *= 3;
    System.out.println(anotherDouble); // Prints 4.0
    System.out.println(anotherInt); // Prints 3

    anotherDouble /= 4;
    anotherInt /= 4;
    System.out.println(anotherDouble); // Prints 1.0
    System.out.println(anotherInt); // Prints 0 since 3 / 4 = 0 R 3

    // If you're just wanting to add 1 to an integer, there's a useful shortcut
    anotherInt++; // Adds 1
    ++anotherInt; //...Also adds 1? What's the difference?

    // Well you can use them inside statements.
    // anotherInt++ adds 1, but gives you the old value.
    anotherInt = 0;
    System.out.println(anotherInt++); // Prints 0
    System.out.println(anotherInt); // Prints 1

    // ++anotherInt adds 1 and gives you the new value.
    anotherInt = 0;
    System.out.println(++anotherInt); // Prints 1
    System.out.println(anotherInt); // Pr"ints 1

    // Section II.3: String concatentation.

    // Sometimes it's useful to combine strings. This is called "concatentation"
    // Sorta like "adding" them so we use the + to combine them.

    String str1 = "Hello, ";
    String str2 = "world!";

    System.out.println(str1 + str2); // prints "Hello, world!"

    // You can also add other things to strings

    System.out.println("Hey " + "look " + 1 + " " + 2 + " " + 3); // prings Hey look 1 2 3
  }
}
