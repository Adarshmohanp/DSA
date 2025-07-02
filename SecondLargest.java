public class SecondLargest {
    public static int print2largest(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return -1;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        

        
        
        for (int i=0;i<n;i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i]> second && arr[i] != first) {
                second = arr[i];
            }
        }

        if (second == Integer.MIN_VALUE) {
            return -1;
        } else {
            return second;
        }
    }

    public static void main(String[] args) {
        // Example usage
        int[] arr = {12, 35, 1, 10, 34, 1};
        int result = print2largest(arr);
        System.out.println("The second largest element is " + result);
    }
}