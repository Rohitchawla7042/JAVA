Q1 You are given a positive integer A as input. You have to print the sum of all odd numbers in the range [1, A].


int n = scn.nextInt(); 
		int i = 1 ; 
		int sum = 0 ; 
		while(i <= n){
			if(i %2 != 0){
				// System.out.println(i);
				sum = sum + i ; 
				
			}
			// sum = sum + i ; 
			
			i++ ;
			// sum = sum + i ; 
			
		}System.out.println(sum);

  
  Q2 
  
  You are given a positive integer A. You have to print the sum of all even numbers in the range [1, A].


  int n = scn.nextInt(); 
		int i = 0 ; 
		int sum = 0 ; 
		while(i <= n){
			if(i %2 == 0){
				// System.out.println(i);
				sum = sum + i ; 
				
			}
			// sum = sum + i ; 
			
			i++ ;
			// sum = sum + i ; 
			
		}System.out.println(sum);


	Q3 
	
	You are given two integers A and B. You have to find the value of AB.

NOTE: The value of AB will always be less than or equal to 109.
	
	int A = scn.nextInt();
	int B = scn.nextInt(); 
	int answer = 1 ; 
	int i = 1 ; 
	
	while (i <= B){
		answer *= A ; 
		i++ ; 
		
	}
	System.out.println(answer); 
	

		
		// Q4 
		
		For a given number A, print its multiplication table having the first 10 multiples.
		
		int A = scn.nextInt(); 
		int i = 1; 
		
		while(i > 0 && i <= 10){
			System.out.println(A + " * " + i + " = " + A*i);
			i++ ; 
		}
		
		 
		//  Q 5 
		
		Given an integer input N, print all multiples of 4 less than or equal to N.

		 int n = scn.nextInt(); 
		 int i = 1; 

        while(i <= n){
	        if(i % 4 == 0){
		        System.out.print(i + " ");
	}
	i++; 
}
	 */ 	
	 
	 int x = 6;

while(x > 0){

System.out.print("YES "); // Line 1

x = x/2;

} 
