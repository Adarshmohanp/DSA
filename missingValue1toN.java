/*find the missing value from 1 to n */
import java.util.*;

public class missingValue1toN {
    public static void main(String args[]){

        int n=5;
        int a[]=new int[]{1,5}; // Example array with a missing value
        int length=a.length;

        int missing=n-length;
        int k=0;

        int m=1;

        for(int i=0;i<n;i++){
            if(a[i]!=m){
                System.out.println(m);
                k++;
                --i; // Decrement i to check the same index again
                if(k==missing){
                    break;
                }
            }
            m++;
        }

    }
}