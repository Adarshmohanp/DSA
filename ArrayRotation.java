public class ArrayRotation {

    // Main function to rotate the array
    public static void rotateArr(int[] arr, int d) {
        int n = arr.length;

        // Handle the case where d > size of array
        d = d % n;

        // Reverse the first d elements
        reverse(arr,0, d - 1);

        // Reverse the remaining n - d elements
        reverse(arr, d, n - 1);

        // Reverse the entire array
        reverse(arr, 0, n - 1);
    }

    // Function to reverse a portion of the array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    // Test the method
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;

        rotateArr(arr, d);

        // Print the rotated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
