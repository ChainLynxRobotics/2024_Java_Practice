public class Challenge2 {
  public static void main(String... args) {
    int numPeople = 10;
    int numPizzaSlices = 32;

    // Determine how many whole number of pizza slices people get after evenly dividing the best we can.
    // Store the answer as a variable and then print it.

    // SOLUTION:

    // Use integer division! 32 / 10 = 3 R 2
    int slicesPerPerson = numPizzaSlices / numPeople;
    System.out.println(slicesPerPerson);  // Prints 3

  }
}
