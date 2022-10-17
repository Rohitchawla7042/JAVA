Q1 

Given an integer A as input, determine whether it is palindromic or not.

A palindrome integer is an integer X for which reverse(X) = X where reverse(X) is X with its digits reversed. For e.g., reverse(123) = 321. Note : There will be no zeros at the start of a number.
  
  import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 
        int n = scn.nextInt(); 
        // int count = 0 ; 
        int temp ; 
        int rev = 0 ; 
        temp = n ; 
        while ( n > 0){
            int rem = n % 10 ; 
            rev = rev * 10 + rem ; 
            n = n / 10; 
        }
        if ( temp == rev){
            System.out.println("Yes");
        }
        else{
            System.out.println("No"); 
        }
        
    }
}

Q2

Write a program to print all odd numbers from 1 to N where you have to take N as input from user. Here N is inclusive.
  
  import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 
        int n = scn.nextInt(); 
        for (int i = 1 ; i <= n ; i++)
        {
            if(i%2 != 0){
                System.out.print(i+" "); 
            }
        }
    }
}

Q3 
Write a program to print all even numbers from 1 to N where you have to take N as input from the user. Note: Use while-loop OR for-loop, according to session flow.

  
  import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 
        int n = scn.nextInt(); 
        for (int i = 1 ; i <= n ; i++)
        {
            if(i%2 == 0){
                System.out.print(i+" "); 
            }
        }
        
    }
}

Q4


Q5

For a given number A, print its multiplication table having the first 10 multiples.
  
  import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in); 
       int n = scn.nextInt(); 
       for (int i = 1 ; i <= 10 ; i++){
           System.out.println(n + " * " + i + " = " + n*i); 
       }
        
    }
}


