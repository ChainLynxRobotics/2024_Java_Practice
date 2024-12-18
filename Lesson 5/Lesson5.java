public class Lesson5 {
  public static void main(String... args) {
    int[] arr = {1, 2, 3, 4, 5};
    int[] arr2 = new int[6];


    System.out.println(arr[0]); // gets the 0th element of the array

    int j = 0;
    while (j < arr.length) {
      System.out.println(arr[j]); // get the ith element in the list
      j++;
    }

    // arr = [0, 1, 2, 3, 4]
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }


    j = 0;
    while (j < arr2.length) {
      System.out.println(arr2[j]); // get the ith element in the list
      j++;
    }

  }
}
