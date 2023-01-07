//  Functions 3 
//  Factorial of a  nu using functions 
class Main {
	
	static int factorial(int n)
	{
		int fact = 1 ; 
			for(int i = 1 ; i <= n ; i++){
				fact = fact * i ; 
			}
			return fact ; 
		
	}
	
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in); 
		int n = scn.nextInt(); 
		System.out.println(factorial(n)); 
		
	}
}

// Q calculate the value of ncr(permutaion )

//  without function 
class Main {
	
	
	
	public static void main (String args[])
	{	
		Scanner scn = new Scanner(System.in); 
		int fact = 1 ; 
		// we find the value of n! 
		int n = scn.nextInt(); 
		for (int i = 1 ; i <= n ; i++){
			fact = fact * i ; 
		}
		// find the value of r!
		int r = scn.nextInt(); 
		int fact1 = 1 ; 
		for(int i =1 ; i <= r ; i++){
			fact1 = fact1 * i ; 
		}
		int fact2 = 1 ; 
		for (int i = 1 ; i <= (n-r) ; i ++){
			fact2 = fact2 * i ; 
		}			
		
		int denom = fact1 * fact2 ; 
		int ans = fact/denom ; 
		System.out.println(ans); 
	}
}


class Main 
{
static int fun(int a,int b,int c) {
    return a;
    return b;
    return c;
}
    
public static void main(String args[]) {
    System.out.println(fun(10,12,9));
}
}

//  perfect square 
class Main {
	static int root(int n ){
		// int i = 1 ; 
		for (int i =1 ; i*i <= n ; i++){
			if(i*i == n ){
				return i; 
			} 
		}
		return -1 ; 
	}
	
	
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in); 
		int n = scn.nextInt(); 
		System.out.println(root(n)); 
	}
}
*/

//  calculation of count of primes 

class Main {
	
	static boolean prime(int m){
		int factors = 0 ; 
		for (int i =2 ; i <= m-1 ; i++){
			if(m%i== 0){
				return false ;    // not prime 
			}
		}
		return true ; 
		
	}
	static int countprime(int n )
	{
		int count = 0 ; 
		for(int i = 2 ; i <= n ; i++){
			boolean check = prime(i); 
			if(check== true){
				count++; 
			}
		}
		return count ; 
	}	
	public static void main(String args[]){
		// Scanner scn = new Scanner(System.in); 
		// int m = scn.nextInt(); 
		// int n = scn.nextInt(); 
		System.out.println(countprime(15)); 
		System.out.println(prime(20)); 
		// }
		
	}
}

