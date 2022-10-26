	//  For loop 2
				// Q1 given a +ve , print all its factors 
				int n = scn.nextInt(); 
				for(int i = 1 ; i <= n ; i++){
					if(n % i == 0){
						System.out.print(i + " "); 
					}
				}
					
					
					// Q2 prime number 
					
					int n = scn.nextInt(); 
					boolean prime = false ; 
					for(int i =2 ; i <= n - 1 ; i++ ){
						if(n % i  == 0){
							prime = true ; 
							break ; 
						}
					}
					if(!prime){
						System.out.print("Prime"); 
					}
					else
					System.out.print("Composite"); 
					
					2nd method 
						
					int n = scn.nextInt(); 
					int temp = 0 ; 
					for(int i = 1 ; i <= n; i++){
						if(n % i == 0){
							temp = temp + 1 ; 
						}
					}
					if(temp == 2){
						System.out.println("Prinme");
					}
					else if(temp > 2){
						System.out.print("Not Prime"); 
					}
					// System.out.print("Prime"); 
			
					3rd ,method 
					
					
					int n = scn.nextInt(); 
					int temp = 0 ; 
					for(int i = 1 ; i <= n; i++){
						if(n % i == 0){
							temp = temp + 1 ; 
						if(temp > 2)
						break; 
						}
					}
					if(temp == 2){
						System.out.println("Prinme");
					}
					else if(temp > 2){
						System.out.print("Not Prime"); 
					}
					
					
					
					//  continue keyword 
					
					for(int i = 1; i <= 10;i++) 
					{
        			if(i == 4 && i == 6) 
					{
            		continue;
        			}
        			System.out.println(i);
					}
					
					
					// Above continue , it will go to the iteration and add 1 and then again check for condition 
					
					for(int i = 1; i <= 10; i++) {
    if(i % 2 == 0) {
        break;
    }
    System.out.print(i + " ");
	*/
	
	Q4 Given a +ve integer and prints its factorial 
	int n = scn.nextInt(); 
	int fact = 1 ; 
	for(int i = n ; i >= 1 ; i--)
	{
		fact = fact * i ; 
	}
	System.out.println(fact); 
