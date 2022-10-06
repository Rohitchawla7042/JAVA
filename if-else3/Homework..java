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
      
      


        
        
        
        
    }
        
	}
