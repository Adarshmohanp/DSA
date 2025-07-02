import java.util.*;

public class majorityElement{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);

        System.out.println("Enter the number of elements");
        int n =sc.nextInt();

        System.out.println("Enter the elements one by one");

        int a[]= new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int frequent=majority(a,n);
        if (frequent==1){
            System.out.println("There is no majority element");
            return;
        }
        System.out.println("The majority element is:"+frequent);

    }

    public static int majority(int a[],int n){
        int count=0;
        int candidate=0;
        for(int i=0;i<n;i++){
            if(count==0){
                candidate=a[i];
            }
            if(a[i]==candidate){
                count++;
            }else{
                count--;
            }
        }
        if (count==1){
            return 1;
        }
        else{
            return candidate;
        }
    }
}