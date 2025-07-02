public class ReverseArray {

    // Function to reverse the array
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        // Swap elements until left < right
        while (left < right) {
            // Swap arr[left] and arr[right]
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move the pointers
            left++;
            right--;
        }
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 5};

        reverseArray(arr);

        // Print the reversed array
        for (int i=0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
