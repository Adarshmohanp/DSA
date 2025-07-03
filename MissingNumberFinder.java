/*find the missing value from 1 to n */
import java.util.*;
public class MissingNumberFinder {
    public static int findMissingNumber(int[] arr, int n) {
        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return total - sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};  // Example: missing 3
        int n = 6; // numbers from 1 to 6
        int missing = findMissingNumber(arr, n);
        System.out.println("Missing number is: " + missing);
    }
}

