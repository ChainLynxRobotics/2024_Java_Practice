public class Challenge1 {
  public static void main(String... args) {

    // Use Java and operators to convert from farenheit to Celsius.
    // Store the answer in a variable then print the answer.
    double farenheit = 212.0;

    // SOLUTION:

    double celsisus = (5.0 / 9.0) * (farenheit - 32);
    //                 ^^^^^^^^^
    //              Make sure to use the .0 to avoid integer division. 5 / 9 as integers is 0!

    System.out.println(celsisus);   // prints 100.0
  }
}
