import java.util.*;
import java.util.Scanner;
class Main {
	public static void main(String args[]) {
		// if else 3 
		Scanner scn = new Scanner(System.in);
    
      Q1 
    
    Mr. T got the Electricity bill of his house. He felt that the bill amount was too much. He come to you to understand the relation between amount and number of units with Electricity bill.


Instructions are give on Electricity biil that :
1. For first 50 units Rs. 0.50/unit.
2. For next 100 units Rs. 0.75/unit.
3. For next 100 units Rs. 1.20/unit.
4. For above 250 units Rs. 1.50/unit.
5. An additional surcharge of 20% is added to the bill.

NOTE: As the electricity bill can have any real value (floating point), you have to tell the floor value of the bill. Floor value of a floating point is the closest integer less than or equal to that value. For eg. Floor value of 2.91 is 2.

To avoid manual calculation again and again, You have to write a code which take number of Unit (suppose N) from user and print the amount.
    
    int units = scn.nextInt();
	// double units_1; 
	double bill_amount = 0 ; 
		
		if(units < 50){
			bill_amount = units * 0.5 ;
			// units_1 = (int)(units);
			// System.out.println(bill_amount);
			
		}
		else if(units <= 150){
			// units = units + (units - 50)*2;
			bill_amount = (50*0.50 + (units - 50)*0.75);
			
		}
		else if (units <= 250){
			bill_amount = (50*0.50 + 100 *0.75 +(units - 150)*1.20); 
			
		}
		else if (units > 250){
			bill_amount = (50*0.50 + 100 *0.75 + 100*1.20 + (units -250)*1.50);
			
		}
	bill_amount += (bill_amount * 20) / 100 ; 
	System.out.println((int)bill_amount); 
    
	
	
	
	Q2 
	In this exercise, you need to implement some rules from Pac-Man, the classic 1980s-era arcade-game.

You have to answer whether the Pac-Man loses or not.

Your are given the following boolean inputs (0 / 1) each in one line:

1. Does the Pac-Man have a power pellect active?

2. Is the Pac-Man touching a ghost?

The Pac-Man loses if it is touching a ghost and does not have a power pellet active.
	//if pac man looses - > 1 and if pacman wins : > 0
	int pellet = scn.nextInt() ; 
	int ghost = scn.nextInt() ; 
	int match = 0 ; 
	 if(pellet == 0 && ghost == 0){
		 System.out.println(match);
	 }
	 else if(pellet == 0 && ghost == 1){ 
		 match++;
		 System.out.println(match);
	 }
	else if(pellet == 1 && ghost == 0){
		System.out.println(match);
		
	}
	else if(pellet == 1 && ghost == 1){
		System.out.println(match);

		 
	}
	

	

		
        

        
    int units = scn.nextInt();
	// double units_1; 
	double bill_amount = 0 ; 
		
		if(units < 50){
			bill_amount = units * 0.5 ;
			// units_1 = (int)(units);
			// System.out.println(bill_amount);
			
		}
		else if(units <= 150){
			// units = units + (units - 50)*2;
			bill_amount = (50*0.50 + (units - 50)*0.75);
			
		}
		else if (units <= 250){
			bill_amount = (50*0.50 + 100 *0.75 +(units - 150)*1.20); 
			
		}
		else if (units > 250){
			bill_amount = (50*0.50 + 100 *0.75 + 100*1.20 + (units -250)*1.50);
			
		}
	bill_amount += (bill_amount * 20) / 100 ; 
	System.out.println((int)bill_amount); 
    
    	*/
        
	}

}

