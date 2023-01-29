Q1 
Problem Description

You are given a character string A having length N.

The string consists of 2 types of characters:

Alphabets : ['a'-'z', 'A'-'Z']
Digits: ['0'-'9']
You have to tell the count of characters of the maximum occuring character type.

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int solve(final String A) 
    {
        int count = 0 ; 
        int count1 = 0 ; 
        for(int i = 0 ; i < A.length(); i++)
        {
            char ch = A.charAt(i); 
            if(ch >= 'a' && ch <='z' || ch >='A' && ch <='Z'){
                count++;
            }
            else if(ch >= '0' && ch <= '9')
            {
                count1++;            
            }
            // if(count > count1){
            //     return count; 
            // }
            // else 
            // return count1; 

        }
        if(count > count1){
                return count; 
            }
        return count1 ; 
    }
}



Q2 

Problem Description

You are given a character string A, having length N and an integer ASCII code B.

You have to tell the leftmost occurrence of the character having ASCII code equal to B, in A or report that it does not exist.



public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int solve(final String A, final int B) {
        int leftmost = -1 ; 
        for(int i = 0 ; i <A.length();i++){
            if(A.charAt(i)==B){
                leftmost = i; 
                break ;
            }
        }
        return leftmost ; 
    }
}



Q3 
Problem Description

You are given a character string A, having length N and an integer ASCII code B.

You have to tell the rightmost occurrence of the character having ASCII code equal to B, in A or report that it does not exist.


public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int solve(final String A, final int B) 
    {   int rightmost = -1; 
        for(int i = A.length()-1 ; i >= 0; i--){
            // char ch = A.charAt(i); 
            if(A.charAt(i)==B){
                rightmost =i; 
                break ; 
            }

        }
        return rightmost ;
    }
}


Q4 

Problem Description
You are given lowercase string (S) and you have to return a string that is the uppercase form of S.

public class Solution {
    public String solve(String A) {
        String New =""; 
        for(int i = 0 ; i < A.length();i++){
            char ch = A.charAt(i); 
            char upper = (char)(ch-32); 
            New +=upper ; 
        }
        return New ; 
    }
}


