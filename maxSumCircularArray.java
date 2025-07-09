/*You are given a circular array arr[] of integers,
find the maximum possible sum of a non-empty subarray.
In a circular array, the subarray can start at the end and 
wrap around to the beginning. Return the maximum non-empty subarray sum,
 considering both non-wrapping and wrapping cases.

Examples:

Input: arr[] = [8, -8, 9, -9, 10, -11, 12]
Output: 22
Explanation: Starting from the last element of the array, i.e, 12, 
and moving in a circular fashion, we have max subarray as 
12, 8, -8, 9, -9, 10, which gives maximum sum as 22. */

import java.util.*;
/* 
public class maxSumCircularArray {
    public static void main(String[] args){
        int arr[]={8,-8,9,-9,10,-11,12};
        int result=maxSum(arr);
        System.out.println("Result is "+result);

    }

    public static int maxSum(int arr[]){
        int length=arr.length;
        int totalSum=arr[0];
        int minSum=arr[0];
        int res=arr[0];

        for(int i=1;i<length;i++){
            minSum+=arr[i];
            totalSum+=arr[i];
            minSum=Math.min(minSum,arr[i]);
            res=Math.min(minSum,res);

        }
        int maxSum=totalSum-res;
        return maxSum;
    }
    
}
*/


import java.util.*;

class maxSumCircularArray{
    
   static int maxCircularSum(int[] arr) {
        
        int totalSum = 0;    
        int currMaxSum = 0, currMinSum = 0;
        int maxSum = arr[0], minSum = arr[0];
        
        for(int i = 0; i < arr.length; i++) {
          
            // Kadane's to find maximum sum subarray
            currMaxSum = Math.max(currMaxSum + arr[i], arr[i]);
            maxSum = Math.max(maxSum, currMaxSum); 
          
            // Kadane's to find minimum sum subarray
            currMinSum = Math.min(currMinSum + arr[i], arr[i]);
            minSum = Math.min(minSum, currMinSum);
            
            // Sum of all the elements of input array
            totalSum += arr[i];
        }
        
        int normalSum = maxSum;
        int circularSum = totalSum - minSum;
        
        // If the minimum subarray is equal to total Sum
        // then we just need to return normalSum
        if(minSum == totalSum)
            return normalSum;
        
        return Math.max(normalSum, circularSum);
    }

    public static void main(String[] args) {
        int[] arr = {8, -8, 9, -9, 10, -11, 12};
        System.out.println(maxCircularSum(arr));
    }
}
