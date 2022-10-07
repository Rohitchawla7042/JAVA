import java.util.*;
import java.util.Scanner;
class Main {
	public static void main(String args[]) {
     You are given a Bank account having N amount and you are asked to perform ADD(credit) or SUBTRACT(debit) operation of an amount X.

After the operation print the amount left in the Bank account. If the debit amount is greater than current balance print "Insufficient Funds"(without quotes) and the operation is skipped.

    int initial_balance = scn.nextInt(); 
    int type = scn.nextInt() ; 
    int amount = scn.nextInt(); 
    // int total_balance ; 
    
    if (type == 1){
        initial_balance = initial_balance + amount ; 
        System.out.println(initial_balance);
    }
    else if(type == 2){
        initial_balance = initial_balance - amount ; 
        if(initial_balance < 0){
            System.out.println("Insufficient Funds");
        }
        else {
            System.out.println(initial_balance); 
        }
    }
    
    */
    
      Q2 
	    
	    Given an integer A representing an year, Return 1 if it is a leap year else return 0.

A year is leap year if the following conditions are satisfied:

Year is multiple of 400.
Else the year is multiple of 4 and not multiple of 100.

int year = scn.nextInt(); 
int leap_year = 0; 

if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
	leap_year++;
	System.out.println(leap_year);
	
}
else{
	System.out.println(leap_year); 
}



	
	// Q3 
	Mr. ST is playing a game. There is a buket and it have 3 slips.
Target is that you have to check all the slips and show him the slip with max number.


	
	int n1 = scn.nextInt(); 
	int n2 = scn.nextInt(); 
	int n3 = scn.nextInt(); 
	
	if(n1 > n2 && n2 > n3){
		System.out.println(n1 + " is largest number") ; 
	}
	else if(n2 > n1 && n2 > n3){
		System.out.println(n2 + " is largest number") ; 

	}
	else{
		System.out.println(n3 + " is largest number") ; 

	}
	
	*/ 
		
		
	
int x = 10;

int y = 20;

{

y = 25;

System.out.print(x  +", "+ y);

}

{

System.out.print(" - " + x + ", " + y);

}

System.out.print(" - " + x + ", " + y);

}

}

      
      


        
        
        
        
    }
        
	}
