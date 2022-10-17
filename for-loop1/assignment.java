Q1 
Write a program to input T numbers(N) from user and print first and last digits of the given numbers.
  
  import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 
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
	}
}

Q2 

Given an integer input N, print all multiples of 4 less than or equal to N.

  
  import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 
        int n = scn.nextInt(); 
		for(int i = 4 ; i <= n  ; i++){
			if(i % 4 == 0){
				System.out.print(i+" "); 
			}
		}
        
    }
}

Q3 
Write a program to print all Natural numbers from 1 to N where you have to take N as input from user


import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 
        int n = scn.nextInt(); 
        int i ; 
        for(i = 1 ; i <= n ; i++){
            System.out.print(i + " ");
        }
    }
}

Q4 

Write a program to print all Natural numbers from N to 1 where you have to take N as input from user



import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 
        int n = scn.nextInt(); 
		for(int i = n ; i >= 1  ; i--){
			System.out.print(i+" ");
		}
        
    }
}

Q5 

Write a program to find sum all Natural numbers from 1 to N where you have to take N as input from user



import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in); 
       int n = scn.nextInt(); 
       int sum = 0 ;
		for(int i = 0 ; i <= n  ; i++){
            sum = sum + i ; 
			// System.out.print(sum);
		}
        System.out.print(sum);
        
    }
}

