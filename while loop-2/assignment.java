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


    int initial_balance = scn.nextInt(); 
    int credit_amount ; 
    int debit_amount = 0 ; 
    int final_balance = 0 ; 
    int T = scn.nextInt(); 
    int i = 1 ;
    while(T > 0){
        
   
        if(i == 1){
            credit_amount = scn.nextInt(); 
            final_balance = initial_balance + credit_amount ; 
            System.out.println(final_balance); 
            
        }
        else if (i==2){
            debit_amount = scn.nextInt(); 
            final_balance = initial_balance + debit_amount ; 
            System.out.println(final_balance);
        }
        else if(debit_amount > final_balance){
            System.out.println("Insufficient Funds"); 
        }
        
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