/*You are given an integer array arr[]. You need to find the maximum sum of a subarray (containing at least one element) in the array arr[].

Note : A subarray is a continuous part of an array.

Examples:

Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
Output: 11
Explanation: The subarray [7, -1, 2, 3] has the largest sum 11. */

import java.util.*;
public class maxSumSubArray {
    public static void main(String args[]){
        int arr[]={5,4,1,7,8};
        int result=maxSum(arr);

        System.out.println("Sum is "+result);
    }

    public static int maxSum(int arr[]){
        int length=arr.length;
        int sum=arr[0];
        int res=arr[0];

        for(int i=1;i<length;i++){
            sum+=arr[i];
            if(sum<arr[i]){
                sum=arr[i];
            }
            res=Math.max(res,sum);
        
        }
        return res;
    }
}
