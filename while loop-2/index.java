import java.util.*;
class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in); 
		// Your code goes here
		//  while-loop2
		// Q1 
		
		// given a +ve nu , print it's last digit of this nu 
	/*	
		LSD = > least significant digit 
		MSD = > Most significant digit 
		
		6548 : > 6 is msd and 8 is lsd 
	
	int number = scn.nextInt(); 
	int remainder ; 
	
	remainder = number % 10 ; 
	System.out.println(remainder);
	
		// Q2 given a no , print all digits of that nu from right to left ; 
		
		int number = scn.nextInt(); 
		int remainder = 0 ;
		// int reverse = 1 ; 
		
		if(number == 0){
			System.out.println(0);
		}
		else if(number < 0){
			number = -number; 
		}
		
		while(number>0){
			
		
		remainder = number % 10 ; 
		// reverse = reverse * 10 + remainder; 
		System.out.print(remainder);
		number = number / 10; 
		// System.out.println(number);
		}
		// System.out.println("Nu is less than 0");

		
			
			// Q3 given a nu , find sum of all digits 
			
			int number = scn.nextInt(); 
			int remainder ; 
			int sum = 0; 
			while(number > 0){
				remainder = number % 10 ; 
				sum = sum + remainder ; 
				System.out.print(remainder + " ");
				number = number / 10 ; 
				
			}  System.out.println(sum);
			
			
			for(int i = 0; i <= 8;i++) {

             if(i % 2 == 0) {

                 System.out.print(i+1 + " ");

             }

         }
		 	
			 
			//  Q4 
			 
			// //  given +ve int n , print perfect squares till n 
			
			// square root means - > the root of the nu will be an perfect integer for ex 1 , 2 , 4 , 9 , 25 , 16 , etc 
			
			int number = scn.nextInt(); 
			int power = 1 ; 
			int i = 1 ; 
			if (number == 0){
				System.out.println(0); 
			}
			else if(number <= 0){
				number = -number ; 
			}
			while (i*i < number){
				 System.out.print(i*i + " "); 
				 i++ ; 
			}
		
		
		// Q5 
		// Given t number , plrint last digits of every nu 
		
		int t = scn.nextInt(); 
		// int  remainder = 0 ; 
		
		while (t > 0 ){
			int n = scn.nextInt(); 
			System.out.print(n % 10 + " "); 
			t-- ; 
			
		}	//System.out.println(n); 
	
            
            
		} 

     Q6 
     
     given some numbers  and print the sum of all digits 
        
        int T = scn.nextInt(); 
        
        while(T > 0){
            int n = scn.nextInt(); 
            
            int sum = 0 ; 
            if (n < 0){
                n = -n ; 
            }
            
            while (n > 0){
                int remainder = n % 10 ; 
                sum = sum + remainder ; 
                n = n / 10 ; 
            }
            System.out.println(sum); 
            
            T-- ; 
        }
			 
