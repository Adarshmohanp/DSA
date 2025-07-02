public class MoveZerosToEnd {

    // Function to push all zeros to the end
    public static void pushZerosToEnd(int[] arr) {
        int count = 0; // Count of non-zero elements

        // Traverse the array. If element is non-zero, then
        // replace the element at index 'count' with this element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }

        // Now all non-zero elements have been shifted to front
        // and 'count' is set as index of first 0. Make all
        // elements 0 from count to end
        while (count < arr.length) {
            arr[count] = 0;
            count++;
        }
    }

    // Main method to test the code
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        pushZerosToEnd(arr);

        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
