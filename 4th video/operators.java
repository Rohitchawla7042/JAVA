Assignment 

// Q1

System.out.println("Number 1 is " + n1);
System.out.println("Number 2 is " + n2);
System.out.println("Number 3 is " + n3);
	boolean first_result = n1 > n2 ; 
	System.out.println("(n1 > n2) conditon is " + first_result);
	boolean second_result = n2 <= n3 ;
	System.out.println("(n2<=n3) conditon is " + second_result);
	boolean third_result = (n1 < n2) || ((n2==n3)&&(n1<n3));
	System.out.println("(n1 < n2) || ((n2==n3)&&(n1<n3)) conditon is " + third_result);
	
	// Q2
	
	Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt(); 
        int n2 = scn.nextInt(); 
        int n3= scn.nextInt(); 	
        boolean n4 = (n1 < n2); 
        boolean n5 = (n2 == n3); 
        boolean n6 = (n1 < n2) && (n2 == n3); 

        System.out.println("Number 1 is " + n1);
        System.out.println("Number 2 is " + n2);
        System.out.println("Number 3 is " + n3);
        System.out.println("(n1 < n2) condition is " + n4);
        System.out.println("(n2 == n3) condition is " + n5);
        System.out.println("(n1 < n2) && (n2 == n3) condition is " + n6);
		
		// Q3 
		
		 Scanner scn = new Scanner(System.in); 
        int n1 = scn.nextInt(); 
        int n2 = scn.nextInt(); 
        int n3= scn.nextInt();
        boolean n4 = (n1 < 50) || (n2 > n3) || (n1 == n3);
        System.out.println("Number 1 is " + n1);
        System.out.println("Number 2 is " + n2);
        System.out.println("Number 3 is " + n3);
        System.out.println(n4); 
		
		Q4 
		
		Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt(); 
        int n2 = scn.nextInt(); 
        int n3= scn.nextInt();
        boolean n4 = (n1 < 50) && (n2 > n3) && (n1 <= n3);
        System.out.println("Number 1 is " + n1);
        System.out.println("Number 2 is " + n2);
        System.out.println("Number 3 is " + n3);
        System.out.println(n4); 
        
	
	
// Q5 
	
	
int n1 = scn.nextInt(); 
int n2 = scn.nextInt(); 
int n3= scn.nextInt(); 	
int n4 = (n1 + n2) % n3 ; 

System.out.println("Number 1 is " + n1);
System.out.println("Number 2 is " + n2);
System.out.println("Number 3 is " + n3);
System.out.println(n4);

// Q6 
int a = 2 - - 7;

System.out.println(a);

	}
	
	// Q7 
	
boolean z1 = false;
z1 = !z1;

System.out.println(z1);



// Q8 
int a=3, b=8;

boolean c = a > 5 && ++b > 6;

System.out.println(b);



int a = 20;

int b = 10;

System.out. print((a > b) && (b++ > 25));

System.out.println(b);
*/
// Scanner scn = new Scanner(System.in);

String s = scn.nextString();

System.out.println(s);
	}


}
