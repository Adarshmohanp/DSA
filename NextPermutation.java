import java.util.Arrays;

public class NextPermutation {
    public static void nextPermutation(int[] arr) {
        int n = arr.length;

        // Step 1: Find the pivot index
        int pivot = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                pivot = i;
                break;
            }
        }

        // Step 2: If no pivot, reverse the entire array
        if (pivot == -1) {
            reverse(arr, 0, n - 1);
            return;
        }

        // Step 3: Find the rightmost element greater than the pivot
        for (int i = n - 1; i > pivot; i--) {
            if (arr[i] > arr[pivot]) {
                // Swap with pivot
                int temp = arr[i];
                arr[i] = arr[pivot];
                arr[pivot] = temp;
                break;
            }
        }

        // Step 4: Reverse the suffix starting right after the pivot
        reverse(arr, pivot + 1, n - 1);
    }

    // Utility function to reverse elements in an array from index start to end
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Test method
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));  // Output: [1, 3, 2]
    }
}
