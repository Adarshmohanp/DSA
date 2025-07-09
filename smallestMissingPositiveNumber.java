/*Given an unsorted array arr[] with both positive and negative elements, 
find the smallest positive number missing from the array.

Examples:

Input: arr[] = [2, -3, 4, 1, 1, 7]
Output: 3
Explanation: 3 is the smallest positive number missing from the array.

Input: arr[] = [5, 3, 2, 5, 1]
Output: 4
Explanation: 4 is the smallest positive number missing from the array.

Input: arr[] = [-8, 0, -1, -4, -3]
Output: 1
Explanation: 1 is the smallest positive number missing from the array. */

import java.util.*;
public class smallestMissingPositiveNumber {
    public static void main(String args[]){
        int arr[]={-8,0,-1,-4,-3};
        int result=SmallestPositive(arr);

        System.out.println("Result is:"+result);
    }

    public static int SmallestPositive(int arr[]){
        Arrays.sort(arr);
        int length=arr.length;
        int num=1;

        for(int i=0;i<length;i++){
            if(arr[i]==num){
                num++;
            }
            if(arr[i]>num){
                break;
            }
        }
            return num;

    }
}
