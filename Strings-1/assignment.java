Q1 

Problem Description
Write a program to input an integer T and then each of T lines will have a string (S).

You have to print T lines each containing length of input string.


  
  import java.lang.*;
import java.util.*;

public class Main {
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
            System.out.println(str.length());
        }
    }
}

Q2 

Problem Description

Take two Strings str1 and str2 from user(which is provided in single line and space separated), concatenate both string and print the final result.
  
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
        String str1 = scn.next(); 

        System.out.print(str + str1); 
        
    }
}


Q3 

Given an english sentence, take it in the input and print it in the output.
  
  import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in); 
        String str = scn.nextLine(); 
        System.out.println(str); 
        
    }
}

Q4 

Write a program to return a string from a given string s where all occurrences of 
the first char of the string except the first occurrence have been changed to '$'.

  public static String change_char(String s) {
    // complete the function template
    String New = ""; 
    for(int i = 1 ; i < s.length() ; i++)
    {
        char c1 = s.charAt(0); 
        char c2 = s.charAt(i); 

        if(c1 == c2){
            New +='$'; 
        }
        else{
            New +=c2; 
        }
        
    }
    return (s.charAt(0)+New )  ; 
}



