/*You're given a list of numbers (nums) and a target sum (target).

The goal is to find two indices i and j such that:

nums[i]+nums[j]=target */

public class TwoSumTarget {
    public static void main(String[]args){
        int[] nums={3, 7, 11, 15};
        int target=18;
        int result[]=twoSum(nums,target);
        System.out.println("indices"+result[0]+","+result[1]);
    }

    public static int[] twoSum(int nums[],int target){
        int n=nums.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n-1;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
