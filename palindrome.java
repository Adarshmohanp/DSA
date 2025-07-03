import java.util.*;

public class palindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the string");
        String original=sc.nextLine();

        boolean isPalindrome=isPalindromeOrNot(original);

        if(isPalindrome){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }

    public static boolean isPalindromeOrNot(String original){
        int length=original.length();

        for(int i=0;i<length/2;i++){
            if(original.charAt(i)!=original.charAt(length-1-i)){
                return false;
            }
        }
        return true;
    }
}
