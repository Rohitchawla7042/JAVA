//  For Loop 1
			Q1 
			
			for (int i =1 ; i <= 5 ; i++){
				System.out.println(i);
			}
			
			
			// Q2.
			int i = 1;
			for (i =1 ; i <= 5 ; i++){
				System.out.println(i);
			}
			System.out.println(i);
			
			// Q3 
			
			int n = scn.nextInt(); 
			for(int i = n ; i >= 1 ; i--){
				System.out.println(i);
			}
			
		
			
			// Q4 
			int n = scn.nextInt(); 
			for (int i = 0 ; i <= n ;i++){
				if(i % 2 == 0){
					System.out.println(i); 
				}
			}
			
				
				
				// Q5 
				// Given a nu , print first and last digit of this nu ; 
				
				int first_digit = 0 ; 
				int last_digit = 0 ; 
				int n = scn.nextInt(); 
				for(int i = 1 ; i <= n ; i++){
					last_digit = n % 10 ; 
					while(n != 0){
						first_digit = n % 10 ; 
						n = n / 10 ; 
					}
					System.out.println("first_digit is = " + first_digit );
					System.out.println("last_digit is = " + last_digit );
				}
				
				
				Q6
				int rem = 0 ; 
				int n = scn.nextInt(); 
				for(; n > 0 ; n = n / 10)
				{
					rem = n % 10 ; 
					System.out.print(rem); 
					// n = n / 10 ; 
				}
				
				int N=scn.nextInt();
				int lastdigit=N%10;
				int firstdigit = 0;
				for(; N>0; N/=10)
				{
					firstdigit = N % 10 ; 
				}
				System.out.println(firstdigit);
				System.out.println(lastdigit);
				
				
				// Q7
				// given a +ve , find the reverse number 
				int n = scn.nextInt(); 
				int rev = 0 ; 
				int rem ; 
				while(n > 0){
					rem = n % 10 ; 
					rev = (rev*10) + rem ; 
					n = n / 10 ; 
				}
				System.out.print(rev); 
				*/
				int n = scn.nextInt(); 
				int rev = 0 ; 
				int rem ; 
				for(;n > 0; n = n / 10){
					rem = n % 10 ; 
					rev = (rev*10) + rem ; 
				}
				System.out.print(rev); 
				

