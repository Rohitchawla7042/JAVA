Q1 

Mr. Q has a diary in which a lot of numbers are written. He wants to know the sum of digits for every number. First Ask Mr. Q about the numbers written in the diary and then write a code to find the sum of digits for every number.
Note: Total different Numbers are T and for every number (let's say N) you need to find the Sum of digits.
 import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 
        int T = scn.nextInt(); 
        //    int sum = 0 ; 
        while ( T > 0){
            int n = scn.nextInt(); 
            int sum = 0 ; 
        
            while ( n > 0 )
            {
                int rem = n % 10 ; 
                sum = sum + rem ; 
                n = n / 10 ;
            }
            System.out.println(sum);
            T-- ; 
        }
          
    }
}

Q2 
You are given an integer N you need to print all the Armstrong Numbers between 1 to N. (N inclusive).
 int m ; 
         int rem ; 
         int n = scn.nextInt(); 
         int i = 1; 
         while(i <= n){
             m = i ; 
             int sum = 0 ; 
             while(m > 0){
                 rem = m % 10 ; 
                 sum += (rem * rem * rem); 
                 m = m / 10 ;    
             }
             if(sum == i){
                 System.out.println(sum);
             }
             i++ ; 
         }
                                                          
                                                          
  Q3 Write a program to input T numbers(N) from user and print first and last digits of the given numbers.


  
  int T = scn.nextInt();
            int first_digit = 0 ; 
            int last_digit = 0 ;
            while(T > 0){
                int n = scn.nextInt(); 
                last_digit = n % 10 ; 
                // System.out.print(last_digit + " "); 
                while(n != 0){
                    first_digit = n % 10 ; 
                    n = n / 10 ; 
                    
                }T-- ;
                System.out.println(first_digit +" " + last_digit); 
            }
  
  
  Q4 You have a number N, you have to write a code to find odd index digit sum and even index digit sum from given number.
Note : Index is starting from 1 till count of digits in a number, and we consider this from right to left;
  
  odd = 0 ;
         int even = 0 ; 
         
         int index = 1 ; 
         while(n > 0)
         {
             int rem = n % 10 ; 
             n = n / 10;        
        
        if(index%2 == 0 ){
            even += rem;
            // System.out.println("Sum of Even Index Digit :" + even);
        }
        else{
            odd+= rem;
            // System.out.println("Sum of odd Index Digit :" + odd); 
        }
        index++ ; 
         }
          System.out.println("Sum of Odd Index Digit : " + odd);
          System.out.println("Sum of Even Index Digit : " + even);
  
  Q5 
  Given a number N, each time N gets divided by 2. How many times do we need to divide N by 2 in order to get 1 as the final result ?

Note : Try to solve this question using a while loop for learning purposes.

  int n = scn.nextInt(); 
           int count = 0 ; 
           int temp = n; 
           while(temp != 1){
               temp = temp / 2; 
               count++ ; 
           }
           System.out.println(count); 
         

                                                          
                                                          
