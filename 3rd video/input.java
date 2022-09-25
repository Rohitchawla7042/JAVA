int a = 20; 
System.out.println(a);

a = 30;
System.out.println("New value of " + a + " is " + a);

int __ = 40;
int $100 = 80;
int num_2 = 89;

int main = 20;

// int can store values for 2 * 10 power 9 

long num23 = 200000000000l;
System.out.println(num23);

//  to store decimal 

float x = 10; 
float b = 13; 
float c = x / b ; 
System.out.println(c);

double x1 = 10; 
double b1 = 13; 
double c1 = x / b ; 
System.out.println(c1);

// if we write 2.98 so compiler will took this as double as this should be error to resolve this error we have to use f in the end of 2.98
// Main.java:117: error: incompatible types: possible lossy conversion from double to float


float b22 = 8.90f; 
System.out.println(b22);

//  
// Data type 				memory 
// int 					4 byte 
// long 					8 byte 
// float					4 byte 
// double 					8 byte 

long num234 = 2501; 
// int temp = num234 ; 
int temp = (int)(num234);    
// Eplicit type casting 
System.out.println(temp);

long val = 100000000l;
int num = (int)val;
System.out.println(num);

//  it will give the garbage value -1486618624

//  how to take input from the user 
Scanner scn = new Scanner(System.in);
// int c121 = scn.nextInt(); 
// int d1 = scn.nextInt(); 
// int sum = c121 + d1 ; 

// System.out.println("The sum of " + c121 + " and " + d1+ " is " + sum); 

/*
double w1 = scn.nextDouble(); 
double w2 = scn.nextDouble(); 
double w3= scn.nextDouble(); 
double weight = w1 + w2 + w3 ; 

System.out.println(weight);

// float r = 8.2/2;
// System.out.println(r);

int a3345 = 10, b3345 = 5; //1

int c3345 = (a * 1.0) / b3345; //2

System.out. println(c3345); //3



int max_time = 40 ; 
int time = scn.nextInt();
int remaining_time  = max_time - time ; 

System.out.println(remaining_time);

int layer = scn.nextInt(); 
int time_required = 2 ; 
int total_time = layer * time_required; 

System.out.println(total_time); 

int layer = scn.nextInt(); 
int time_required = 2 ; 
int total_time = layer * time_required; 
int time_in_oven = scn.nextInt(); 
int total_time_taken = total_time + time_in_oven ; 

System.out.println(total_time_taken);

int n1 = scn.nextInt();
int n2 = scn.nextInt();
int n3 = scn.nextInt();
int n4 = n1 + n2 + n3 ; 

System.out.println(n4); 
*/

// long number1 = 10000l; 
// long number2 = 10000000l; 
// int number3 = (int)number1 + (int)number2 ; 
// System.out.println(number3);

long number1 = scn.nextLong(); 
long number2 = scn.nextLong(); 
long number3 = number1 * number2 ;
System.out.println(number3); 
		
	}
}
