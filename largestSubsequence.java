/*We are given two strings:

S: A string of length N consisting of lowercase Latin letters.

T: A string of length M consisting of lowercase Latin letters.

We need to find the maximum possible length of a string K that satisfies the following conditions:

K is a subsequence of S: This means K can be obtained by deleting zero or more characters from S without changing the order of the remaining characters.

T is a substring of K: This means T must appear as a contiguous sequence of characters within K.

Key Definitions:
Subsequence: A sequence that can be derived from another sequence by deleting zero or more elements without changing the order of the remaining elements. For example, "ace" is a subsequence of "abcde".

Substring: A contiguous sequence of characters within a string. For example, "bcd" is a substring of "abcde".

Example Provided:
S: "abcde"

T: "bd"

Possible Subsequences of S that include T as a substring:
"abcde" (T = "bd" is a substring)

Length: 5

"abde" (T = "bd" is a substring)

Length: 4

"abcd" (T = "bd" is a substring)

Length: 4

"acde" (T = "bd" is not a substring)

Invalid

"bde" (T = "bd" is a substring)

Length: 3

The maximum length among the valid options is 5 ("abcde").

Approach to Solve the Problem:
Check if T is a subsequence of S:

If T is not a subsequence of S, it's impossible to form K, so the answer is 0.

Find the maximum possible length of K:

The maximum length of K is simply the length of S, because we can take the entire S as K (since T is already a subsequence of S, and we can ensure T is a substring in K by not deleting any characters that disrupt T's contiguous appearance). */



import java.util.Scanner;

public class largestSubsequence {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the length of the string");
        int N=sc.nextInt();

        System.out.println("Enter the length of the substring");
        int M=sc.nextInt();

        sc.nextLine();

        System.out.println("Enter the String");
        String S=sc.nextLine();

        System.out.println("Enter the substring");
        String T=sc.nextLine();

        System.out.println(maxLengthK(S,T));

    }

    public static int maxLengthK(String S, String T){
        if(isSequence(S,T)){
            return S.length();
        }
        else{
            return 0;
        }
    }

    public static boolean isSequence(String S, String T){
        int i=0,j=0;
        int n=S.length();
        int m=T.length();

        while(i<n && j<m){
            if(S.charAt(i)==T.charAt(j)){
                j++;
            }
            i++;
        }
        return(m==j);
    }
}
