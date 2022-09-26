// Homework question Q1 

int savings = scn.nextInt(); 
int spent = scn.nextInt(); 
int final_amount = savings - spent ; 

System.out.println(final_amount); 


float total_budget = scn.nextFloat();
float spend = scn.nextFloat();
int remainig = (int)total_budget / (int)spend ; 

System.out.println(remainig);



float r2 = 126.3f ; 
float r3 = 5; 

int r4 = (int)r2 / (int)r3 ;
System.out.println(r4);

int single_bill = scn.nextInt(); 
int nu_of_bills = scn.nextInt(); 
int total_amount = single_bill * nu_of_bills ; 

System.out.println(total_amount);

// narrowing type conversion leads to the loss of data 
// that means we are converting manually from big byte to the small byte for ex 
// from long to int this is also known as explicit type casting 

// widening type - > no change 

// automatically type convesion - into to long 
	float v1 = 8.2f / 2; 
	System.out.println(v1);	
	
	int t5 = 10, t6 = 5; //1

	double t7 = (t5 * 1.0) / t6; //2
	
	// int t7 = t5 / t6 ; 

	System.out. println(t7); //3
	
	*/
	
	int a = 10 ; 
	int b = 5; 
	int c = 3 ; 
	int d = a+c /2*b ;
	
	System.out.println(d);
	}
}
