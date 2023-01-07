
		// import java.util.* ; 
        public class Main {
  static void myMethod() {
  Scanner scn = new Scanner(System.in); 
   
  int a = scn.nextInt() ; 
  int b = scn.nextInt() ; 
  int c = a + b ; 
    System.out.println(c);
  }

  public static void main(String[] args) {
    myMethod();
    myMethod();
    myMethod();
    
  }
}


// Q1 

// n c r

int n = 4 ; 
int r = 2 ; 
int fact = 1 ; 
int fact1 = 1 ; 
int fact2 = 1 ; 
for(int i = 1 ; i <= n ; i++){
    fact = fact * i ;
}
// System.out.println(fact); 
for(int i = 1 ; i <= r ; i++){
    fact1 = fact1 * i ; 
}
// System.out.println(fact1); 
for(int i = 1 ; i <= n - r ; i++){
    fact2 = fact2 * i ; 
}
// System.out.println(fact2); 
int result = fact/(fact1*fact2); 
System.out.println(result); 



f(x) = y

here f = function 
(x) = input 
y = output 

function name (input){
    -
    -
    -
    
    return --
    
    Syntax of function ^^
    
    void is the return type 
   
    
    // Q1 write a function to print factorial of n ; 
    void factorial (int a)
    {
        int fact = 1 ; 
        for(int i = 1 ; i <= a ; i++)
        {
            fact = fact * i ; 
        }
        System.out.println(fact) ; 
    }
    
    
    
    Q2 Write a function that takes n as input and returns the fact of n ; 
    
    if we are retuning anything we have to enter the datatype such as int 
    
    int factorial (int a)
    {
        int fact = 1 ; 
        for(int i = 1 ; i <= a ; i++)
        {
            fact = fact * i ; 
        }
        return fact ; 
    }
    
  
     
     Q3 write function to print factorial
     
     import java.util.*; 
// import java.util.Scanner; 
class Main {
	static int factorial(int n)
	{
		int fact = 1 ; 
		for(int i = 1 ; i <= n ; i++){
			fact = fact * i ; 
		}
		// System.out.println(fact); 
		return fact ; 
	}
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in); 
		int n = scn.nextInt(); 
		
		System.out.println(factorial(n)); 
	}
}


   
//    Math functions 
   
//  1   math.pow used for power

int n = (int)Math.pow(2,5); 
System.out.println(n);

//  math.ceil(a) :> just greater value of a 
for ex math.ceil(5.6) = 6     

   
   
   int A = scn.nextInt(); 
   A = A / 200 ; 
   int ans = (int)Math.ceil(A); 
   System.out.println(ans); 
   
   */
//    int A = scn.nextInt(); 
//    A = A / 200 ; 

// Math.floor will give the just smaller value from the given input 
   int ans = (int)Math.floor(-5.2);
   System.out.println(ans); 
   
    
}

	}
	

// new functions 
import java.util.* ; 
// Scanner scn = new Scanner(System.in); 
// Q1 count the nu of digits using functions 
/*
import java.util.* ; 
class Main 
{
	static int count_type(int a)
	{
		int count = 0 ; 
		while (a > 0 )
		{
			count++;	
			a = a / 10 ; 
		}
		return count ; 
	}
	public static void main (String args[])
	{
		Scanner scn = new Scanner(System.in); 
		int n = scn.nextInt(); 
		int ans = count_type(n); 
		System.out.println(ans); 
	}
}

// Q2 Write a function that takes 2 input and return the sum of 2 numbers 

class Main {
	
	static int sum_digits(int a , int b){
		int add = 0 ; 
		add = a + b ; 
		return add ; 
	}	
	// return add ; 
	
	public static void main (String args[]){
		Scanner scn = new Scanner(System.in); 
		int x = scn.nextInt(); 
		int y = scn.nextInt(); 
		int sum = sum_digits(x , y); 
		System.out.println(sum); 
		
	}
}

//  pre defined functions 

// Math.pow(a,b); a^ b 
// Math.pow(2,4); 2^4 = 2*2*2*2 ; 

int ans = (int)Math.pow(2 , 4); 
System.out.println(ans); 

ceil vaule - >  first integer greater than or equal to given number . 

3.14 - > 4 
4.98 - > 5 
2.001 - >  3 
9.0 - > 9 

floor value - > first integer smaller than or equal to given number 

3.14 - > 3 
5.67 - > 5 
*/




