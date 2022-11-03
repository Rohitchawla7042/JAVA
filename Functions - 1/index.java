
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

