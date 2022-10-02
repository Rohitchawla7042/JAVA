double eng_marks = scn.nextInt(); 
double maths_marks = scn.nextInt(); 
double eng_marks1 = scn.nextInt(); 
double maths_marks1 = scn.nextInt(); 
double average_classa ; 
double average_classb ; 

average_classa = (eng_marks + maths_marks) / 2 ; 
// System.out.println(average_classa);

average_classb = (eng_marks1 + maths_marks1) / 2 ; 
// System.out.println(average_classb);

boolean average  = average_classa > average_classb ; 

System.out.println(average); 



// Q2 

int n1 = scn.nextInt(); 
if(n1%3==0 && n1%5==0){
	System.out.println("Rockstar");
}
else if(n1%3==0){
	System.out.println("Rock");
}

else if(n1%5==0){
	System.out.println("star");
}


Q3 
int number = scn.nextInt(); 
        if(number > 0 && number %2 == 0){
            System.out.println("Number is Positive and Even");
        }
		if(number > 0 && number %2 !=0){
			System.out.println("Number is Positive and Odd");	
		}
		if(number < 0 && number %2 !=0){
			System.out.println("Number is Negative and Odd");
		}
		if(number < 0 && number %2 ==0){
			System.out.println("Number is Negative and Even");	
		}


// Q4 


int x= scn.nextInt(); 
        int y = scn.nextInt(); 

        if(x > 0 && y > 0){
	        System.out.println(x + ", " +  y + " belongs to First Quadrant");
}
        if(x < 0 && y > 0){
	        System.out.println(x + ", " +  y + " belongs to Second Quadrant");
}
        if(x < 0 && y < 0){
	        System.out.println(x + ", " +  y + " belongs to Third Quadrant");
}
        if(x > 0 && y < 0){
	        System.out.println(x + ", " +  y + " belongs to Fourth Quadrant");
}



// Q5 

String str = scn.nextLine(); 
int year = scn.nextInt(); 

System.out.println(str); 
System.out.println(year);

if(year > 5){
	System.out.println("Yes " + str + " will recieve bonus.");
}
else{
	System.out.println("No " + str + " will not recieve bonus.");
}


String name="dino";

if(name == "dino")

System.out.print("DINO");

System.out.println("GOOD");

boolean x, y, z;

x = y = z = true;

if(!x || (!y && !z))

System.out.println("WHY");

else

System.out.println("WHAT");

float a = 7.3f;

if(a == 7.3)

System.out.print("Hi");

else

System.out.print("Know Program");
int number = scn.

int a=5, b=6;

if(a++ == --b)

{

System.out.println("5=5");

}

else

{

System.out.println("NONE");

}
Q14 

double T = scn.nextInt(); 
double N = scn.nextInt(); 
double attendence = (N / T) * 100 ;
System.out.println(attendence);

if (attendence >= 75){
	System.out.println("Yes");
}
else {
	System.out.println("NO"); 
}

 int n1 = scn.nextInt(); 
if(n1%3==0 && n1%5==0){
	System.out.println("Rockstar");
}
else if(n1%3==0){
	System.out.println("Rock");
}

else if(n1%5==0){
	System.out.println("star");
}

	}


}
