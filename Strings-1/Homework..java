Q1 Q1. Reverse the word - II
Problem Description
You are given lowercase string (A) and you have to return after reversing that.

public class Solution {
    public String solve(String A) 
    {
        String rev = ""; 
        for(int i = A.length()-1 ; i >= 0 ; i--)
        {
            char ch = A.charAt(i); 
            rev += ch; 
        }
        // rev += str; 
        return rev ; 
    }
    // return rev ; 
}


Q2 
Write a program to check whether the given string is a palindrome or not. Return True if it is palindrome else return False.

Note: A string is said to be a palindrome if the reverse of the string is the same as the string itself.
  
  public static boolean isPalin(String s) 
{
    // complete the function template
    String rev = ""; 
    for(int i = s.length()-1 ; i >=0 ; i--)
    {
        char ch = s.charAt(i); 
        rev += ch ; 
    }
    return rev.equals(s); 
}

Q3 

Take two string from user, which are space separated. first is string A, and second is string B.

Concatenate String A and String B and places " loves " in between String A and String B.
  
  import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
        Scanner scn = new Scanner(System.in); 
        String s1 = scn.next(); 
        String s2 = scn.next(); 
        String s = s1 +" loves "+ s2; 
        System.out.print(s); 
    }
}


Q4

Given the name A and age B of a person in input. Print A's age is B in the output.

  
  import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in); 
        String str = scn.next(); 
        int age = scn.nextInt(); 
        System.out.println(str +"'s" + " age is " + age); 
    }
}

