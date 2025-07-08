import java.util.Arrays;

public class MinimizeDifference {

    public static int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);

        // Initial difference
        int res = arr[n - 1] - arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] - k < 0) {
                continue;
            }

            int minH = Math.min(arr[0] + k, arr[i] - k);
            int maxH = Math.max(arr[i - 1] + k, arr[n - 1] - k);

            res = Math.min(res, maxH - minH);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 10};
        int k = 2;

        int result = getMinDiff(arr, k);
        System.out.println("Minimum difference is " + result);
    }
}
// Output: Minimum difference is 5
// This code defines a method to minimize the difference between 
//the maximum and minimum heights of buildings after adjusting their heights
// by a given value k.