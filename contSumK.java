/*Given an array of positive integers and a target sum k, 
return True if a continuous subarray sums to k. */


import java.util.*;
public class contSumK {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the no of elements ");
        int n=sc.nextInt();

        int a[]=new int[n];
        System.out.println("Enter the elements one by one");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Enter the K value(sum value)");
        int k=sc.nextInt();

        int total=0;
        int start=0;

        for(int i=0;i<n;i++){
            total+=a[i];
            if(total>k){
                total-=a[start];
                start++;
            }
            if(total==k){
                System.out.println("True");
                break;
            }

        }
        if(total!=k){
            System.out.println("False");
        }
    }
}
