// Pattern 2 
	// Q1 
	// Print the pattern 
	
	// first check for the no of rows and then check for the spaces and * ;
	
	int n = scn.nextInt(); 
	for(int i = 1 ; i <= n ; i++){
		for(int j = 1 ; j <= n- i; j++){
			System.out.print(" ");
		}
		for(int j = 1 ; j <= i ; j++){
			System.out.print("*");
		}
		System.out.println(); 
		
		
		
		// Q2 
		int n = scn.nextInt(); 
		for(int i = 1 ; i <= n ; i++){
			// print spaces 
			for(int j = 1 ; j <= i-1 ; j++){
				System.out.print("_"); 
			}
			// print stars 
			for(int k = 1 ; k <= n-i+1 ; k++){
				System.out.print("*");
			}
			System.out.println();
		}
		*****
		_****
		__***
		___**
		____*
		
		
	// 	int n = scn.nextInt(); 
	// for(int i = 1 ; i <= n ; i++){
	// 	for(int j = 1 ; j <= n- i; j++){
	// 		System.out.print(" _");
	// 	}
	// 	for(int j = 1 ; j <= i ; j++){
	// 		System.out.print("*");
	// 	}
	// 	System.out.println(); 
	// }
	
	int n = scn.nextInt(); 
	for(int i = 1 ; i <= n ; i++){
		for(int j = 1 ; j <= n-i+1 ; j++){
			System.out.print("*"); 
		}
		// for(int j = 1 ; j <= i-1 ; j++){
		// 	System.out.print(" "); 
		// }
		for(int j = 1 ; j <= 2*(i - 1) ; j++){
			System.out.print(" "); 
		}
		for(int k = 1 ; k <= n-i+1 ; k++){
			System.out.print("*"); 
		}
		System.out.println(); 
	}
		********************
		*********  *********
		********    ********
		*******      *******
		******        ******
		*****          *****
		****            ****
		***              ***
		**                **
		*                  *

		Q4
		int n = scn.nextInt(); 
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*"); 
            }
            for(int j = 1 ; j <= 2*(n - i) ; j++){
                System.out.print(" "); 
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*"); 
            }
            
            System.out.println(); 
        }
		*                  *
		**                **
		***              ***
		****            ****
		*****          *****
		******        ******
		*******      *******
		********    ********
		*********  *********
		********************
		
		*/
		Q6
	
	
		
		int n = scn.nextInt(); 
		for(int i = 1 ;i <= n ;i ++){
			for(int j = 1 ; j <= n - i ; j++){
				System.out.print("_");
			}
			for(int j = 1 ; j <= i ; j++){
				System.out.print(j);
			}
			System.out.println(); 
		}
		// ___1
		// __12
		// _123
		// 1234
		
		2nd approach 
		
		
		int n = scn.nextInt(); 
		for(int i = 1 ;i <= n ;i ++){
			for(int j = 1 ; j <= n - i ; j++){
				System.out.print("_");
			}
			int val =4 ; 
			for(int j = 1 ; j <= i ; j++){
				System.out.print(val);
				val--; 
			}
			System.out.println(); 
		}
	*/
