import java.util.Scanner;


class ImABadClassName {
    // TODO: Understand what this code does and rename the class name.
    // TODO: Understand what this code does. Document the functions.
    // TODO: Make changes to this code to make it the most readable (No abbreviations and good variable names).
    // TODO: Test it - test the individual functions, Be as pedantic as you can with your tests.
	
    public static void main(String[] args) {
        int n, c, d, swap;
        Scanner in = new Scanner(System.in);

        System.out.println("Input number of integers to sort");
        n = in.nextInt();

        int[] array = new int[n];

        System.out.println("Enter " + n + " integers");

        for (c = 0; c < n; c++)
            array[c] = in.nextInt();

        for (c = 0; c < (n - 1); c++) {
            for (d = 0; d < n - c - 1; d++) {
                if (array[d] > array[d + 1]) /* For descending order use < */ {
                    swap = array[d];
                    array[d] = array[d + 1];
                    array[d + 1] = swap;
                }
            }
        }

        System.out.println("Sorted list of numbers");

        for (c = 0; c < n; c++)
            System.out.println(array[c]);
    }
}
