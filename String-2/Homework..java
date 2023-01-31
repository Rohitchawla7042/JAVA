Q1 
Mr. Jim likes playing with strings a lot, so Mrs. Pam gifted him a string A which has some very unique magical powers. The string consists of lowercase latin letters 'p','a' and 'm' only.

In one wish, Mr Jim can perform one of the following operations:
Remove exactly one occurrence of 'p' and exactly one occurrence of 'm', from anywhere inside string A.
Remove exactly one occurrence of 'a' and exactly one occurrence of 'm', from anywhere inside string A.
Now Mr. Jim wants to know if after some number of wishes is it possible to make string A empty.

Return 1 if it is possible to make string A empty after some number of operations otherwise Return 0.
  
  public class Solution {
    public int solve(String A) {
        int counta = 0 ; 
        int countm = 0; 
        int countp = 0; 
        for(int i = 0 ; i < A.length();i++){
            char ch = A.charAt(i); 
            if(ch=='a'){
                counta++;
            }
            else if(ch=='m'){
                countm++;
            }
            else{
                countp++;
            }
        }
        if(countm==counta+countp){
            return 1; 
        }
        return 0 ; 
        
    }
}


Q2 Problem Description
Shivam has a string A of size N containing only lowercase characters. He will update the string by inserting a number after every char which will be the index of that char.

For E.g.: if string is azd then it will be updated as a1z26d4 since index of a is 1, of z is 26 and of d is 4.

You have to tell how the string will look like afterwards,

public class Solution {
    public String solve(String A) {
        String New = ""; 
        for(int i = 0 ; i < A.length(); i++)
        {
            char ch = A.charAt(i); 
            int index = ch - 96 ; 
            New = New+ch+index ; 
            //  System.out.println(ans); 

        }
        // System.out.println(New); 
        return New ; 
    }
}



Q3 

Problem Description
Write a program to input T strings (S) from user and print count of vowels and consonants in it.
  
  
  import java.lang.*;
import java.util.*;

public class Main {

    static int count(String str){
        int vowel_count = 0 ; 
        for(int i = 0 ; i < str.length();i++){
            char ch = str.charAt(i); 
            if(ch=='a' || ch =='e' || ch=='i' || ch=='o' || ch=='u'){
                vowel_count++; 

            }
        }
        return vowel_count ; 

    }
    public static void main(String[] args) 
    {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in); 
            int T = scn.nextInt(); 
            for(int i = 1 ; i <= T ; i++)
            {
                String str = scn.next(); 
                int ans = count(str); 
                int consononat_count = str.length()-ans ; 

                System.out.println(ans + " " + consononat_count); 
            }
    }
}


Q4 

Problem Description
You are given uppercase string (S) and you have to return a string that is the lower case form of S.
  
  public class Solution {
    public String solve(String A) {
        String New = ""; 
        for(int i = 0 ; i < A.length();i++){
            char ch = A.charAt(i); 
            char upper = (char)(ch+32); 
            New +=upper; 
        }
        return New ; 
    }
    // return New;
}


