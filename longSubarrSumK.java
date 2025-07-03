/*An array of positive integers

A target sum K

You need to find the length of the longest continuous subarray (i.e., a sequence of consecutive elements) whose sum is exactly equal to K
 */
import java.util.*;

public class longSubarrSumK {
   public static  void main(String args[]){
    int arr[]={2,1,1,1,1,1,1};
    int k=6;
    int result=longestSubarray(arr,k);
    System.out.println("The longest subarray with sum "+k+" is "+result+".");
}

   public static int longestSubarray(int arr[],int k){
    int length=arr.length;
    int sum=0;
    int start=0;
    int len=0;

    for(int i=0;i<length;i++){
        sum+=arr[i];
        while(sum>k){
            sum-=arr[start];
            start++;
        }
        if(sum==k){
            len=Math.max(len,i-start+1);
        }
    }
    return len;
   }
}
