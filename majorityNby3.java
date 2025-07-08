/*Given an array arr[] consisting of n integers, the task is to find all the array elements which occurs more than floor(n/3) times.
Note: The returned array of majority elements should be sorted.

Examples:

Input: arr[] = {2, 2, 3, 1, 3, 2, 1, 1}
Output: {1, 2}
Explanation: The frequency of 1 and 2 is 3, which is more than floor n/3 (8/3 = 2).

Input: arr[] = {-5, 3, -5}
Output: {-5}
Explanation: The frequency of -5 is 2, which is more than floor n/3 (3/3 = 1).

Input: arr[] = {3, 2, 2, 4, 1, 4}
Output: { }
Explanation: There is no majority element. */

// Java program for finding the majority element in an array
// using Moore’s Voting algorithm

import java.util.*;

public class majorityNby3{

    // Function to find elements appearing more than ⌊n/3⌋ times
    static List<Integer> findMajority(int[] nums) {
        int n = nums.length;

        // Step 1: Find two potential candidates using Moore’s Voting Algorithm
        int candidate1 = -1, candidate2 = -1;
        int count1 = 0, count2 = 0;

        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Step 2: Count actual occurrences of the two candidates
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == candidate1) count1++;
            else if (num == candidate2) count2++;
        }

        // Step 3: Add valid majority elements (more than ⌊n/3⌋ times) to result
        List<Integer> result = new ArrayList<>();
        if (count1 > n / 3) result.add(candidate1);
        if (count2 > n / 3) result.add(candidate2);

        // Optional: Sort result in ascending order if exactly two elements
        if (result.size() == 2 && result.get(0) > result.get(1)) {
            int temp = result.get(0);
            result.set(0, result.get(1));
            result.set(1, temp);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] inputArray = {2, 2, 3, 1, 3, 2, 1, 1};
        List<Integer> majorityElements = findMajority(inputArray);

        System.out.print("Majority elements (> n/3): ");
        for (int num : majorityElements) {
            System.out.print(num + " ");
        }
    }
}
