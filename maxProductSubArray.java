/*Given an array arr[] that contains positive and negative integers 
(may contain 0 as well). Find the maximum product that we can get in 
a subarray of arr[].

Note: It is guaranteed that the answer fits in a 32-bit integer.

Examples

Input: arr[] = [-2, 6, -3, -10, 0, 2]
Output: 180
Explanation: The subarray with maximum product is [6, -3, -10] with 
product = 6 * (-3) * (-10) = 180. */

import java.util.*;
public class maxProductSubArray {
    public static void main(String[] args){
        int arr[]={-2, 6, -3, -10, 0, 2};
        int result=maxProduct(arr);
        System.out.println("MaxProduct is "+result);

    }

    public static int maxProduct(int arr[]){
        int max=arr[0];
        int min=arr[0];
        int product=arr[0];
        int n=arr.length;
        int min1;
        int max1;

        for(int i=1;i<n;i++){
           min1=Math.min(arr[i],min*arr[i]);
           max1=Math.max(arr[i],min*arr[i]);

           min=Math.min(max*arr[i],min1);
           max=Math.max(max1,max*arr[i]);
           //above is the code to find the current max and current min from arr[i] and
           // the previous max*arr[i] and min*arr[i]

           product=Math.max(product,max);

        }
        return product;
    }
}
