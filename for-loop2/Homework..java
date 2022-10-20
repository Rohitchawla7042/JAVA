Q1

You are given an integer N you need to print all the Prime Numbers between 1 and N.

Prime numbers are numbers that have only 2 factors: 1 and themselves. For example, the first 5 prime numbers are 2, 3, 5, 7, and 11.

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 
        int n = scn.nextInt(); 
        int i , j , count ;

        for(i = 2 ; i <=n ; i++)
        {
            count = 0;
            for (j = 2 ; j < i ; j++)
            {
                if(i % j == 0){
                    count++ ; 
                    break ; 
                }
            }
            if(count==0){
                System.out.println(i); 
            }
        }
        
    }
}

Q2
Write a program to input two integers A & B from user and print their HCF.

Definition Of HCF: The HCF(Highest Common Factor) or the GCD(greatest common divisor) of two positive integers happens to be the largest positive integer that divides the numbers without leaving a remainder.
  
  import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 
        int a = scn.nextInt(); 
        int b = scn.nextInt(); 
        int hcf = 1 ; 
        // LCM = a*b / gcd(a,b)

        for(int i = 1 ; i<=a && i<=b ; ++i){
            if(a % i == 0 && b % i == 0 ){
                hcf = i ; 
            }
        }
        // int lcm = a * b / gcd ; 
        System.out.println(hcf); 
        
    }
}


Q3

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 
        int a = scn.nextInt(); 
        int b = scn.nextInt(); 
        int gcd = 1 ; 
        // LCM = a*b / gcd(a,b)

        for(int i = 1 ; i<=a && i<=b ; ++i){
            if(a % i == 0 && b % i == 0 ){
                gcd = i ; 
            }
        }
        int lcm = a * b / gcd ; 
        System.out.println(lcm); 
        
    }
}

Q4

You are given an integer A, you need to find and return the sum of all the even numbers between 1 and A.

Even numbers are those numbers that are divisible by 2.

public class Solution {
    public int solve(int A){
        int sum = 0 ; 
        for(int i = 2; i <= A ; i++){
            if(i %2 == 0){
                sum = sum+ i ; 
            }
            // return sum ; 

        }
         return sum ; 
    }
}
  
  Q5
  
  

