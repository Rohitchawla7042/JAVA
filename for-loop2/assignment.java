Q1 
Take an integer N as input and print the count of its factors.
The factor of a number is the number that divides it perfectly leaving no remainder.

Example: 1, 2, 3, and 6 are factors of 6

  import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); 
        int count = 0 ; 
        for(int i = 1 ; i <= n ; i++){
            if(n % i == 0){
                count++ ; 
                // System.out.print(count); 
            }
            // System.out.println(count); 
        }
        System.out.println(count); 
    }
}

Q2
Given an integer A as input, you have to tell whether it is a prime number or not.

A prime number is a natural number greater than 1 which is divisible only by 1 and itself.
  
  import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 
        int n = scn.nextInt(); 
        int count = 0 ; 
        for (int i = 1 ; i < n ; i++)
        {
            if(n % i == 0){
                count++; 
            }
        }
        if(count == 1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO"); 
        }
        
    }
}

Q3
Problem Description

You are given N positive integers.

For each given integer A, you have to tell whether it is a perfect number or not.

A perfect number is a positive integer which is equal to the sum of its proper positive divisors (excluding the number itself). A positive proper divisor divides a number without leaving any remainder.
  
  Q4
  
  You are given a positive integer A as input. You have to print the sum of all odd numbers in the range [1, A].

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 
        int n = scn.nextInt(); 
        int sum = 0 ; 
        for (int i = 1 ; i <= n ; i++){
            if(i %2 != 0){
                sum = sum + i ; 
            }
        }//System.out.println(sum); 
        System.out.println(sum);
    }
}


