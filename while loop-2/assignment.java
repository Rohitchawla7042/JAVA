 Assignments 
             
             Q1 Given a number A. Print all perfect squares less than or equal to A.
Notes - Perfect squares are integers whose square root is an integer.

int n = scn.nextInt(); 
        int i = 1 ; 
        if (n == 0){

            System.out.println(0);
        }
        else if(n < 0){
            n = -n ; 
        }
        while ( i*i <= n){
            System.out.print(i*i + " ");
            i++ ; 
            
        }
       
        
        // Q2 
        
//         You are given a Bank account having N amount and you are asked to perfrom ADD(credit) and SUBTRACT(debit) operations.

// After each operation print the amount left in the Bank account. If the debit amount is greater than current balance print "Insufficient Funds"(without quotes) and the operation is skipped.


   import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 
        long current_balance = scn.nextLong();
        long debit_amount = 0 ; 
        int type ; 
        int T = scn.nextInt(); 
        while (T > 0){
            type = scn.nextInt(); 
            if(type == 1){
                long credit_amount = scn.nextLong(); 
                current_balance = current_balance + credit_amount ; 
                System.out.println(current_balance); 
            }
            else if(type == 2)
            {
                debit_amount = scn.nextLong(); 
                if(debit_amount > current_balance){
                    System.out.println("Insufficient Funds"); 
                }
                else 
                {
                    current_balance = current_balance - debit_amount; 
                System.out.println(current_balance); 
                }
            }
            T-- ; 
        }
        
    }
}
        Q3 Mr. Q has a diary in which he has written a lot of numbers. He is confused about the number of digits in every number he has written. Mr. Q will provide the different numbers written in the diary and then you have to write a code to find the number of digits in every number he has written.

Note: Total different Numbers are T and for every number (let's say N) you need to find the total number of digits.
		
		int T = scn.nextInt(); 
       while ( T > 0){
           int N = scn.nextInt(); 
           int count = 0 ; 
           
           if( N == 0){
               System.out.println(1);
           }
           else{
               while(N > 0){
                   count++ ; 
                   N = N / 10 ;
               }
               System.out.println(count);
           }
           T-- ; 
       }
          Q4 
		You have a number N, you have to write a code to find odd digit sum and even digit sum from given number and print it.
		int rem ; 
         int odd = 0 ; 
         int even = 0 ; 
         while ( n > 0){
             rem = n % 10 ; 
             n = n / 10 ; 
             if(rem % 2 == 0){
                 even = even + rem; 
             }
             else
             odd = odd + rem ; 
         }
         System.out.println("Sum of Odd Digit : " +odd); 
         System.out.println("Sum of Even Digit : " +even); 
							  
        Q 5 
        
        Given two numbers A & B, print all the numbers from A to B in a single line.

Note : Try to solve this question using a while loop for learning purposes.

int A = scn.nextInt(); 
        int B = scn.nextInt();
        int i ; 
        for(i = A ; i <= B; i++){
            System.out.print(i + " ");
             
        }
        
    }
     */
      while(true) {
             System.out.println("Hello");
         }
	}
	
}
