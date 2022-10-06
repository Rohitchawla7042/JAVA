import java.util.*;
import java.util.Scanner;
class Main {
	public static void main(String args[]) {
		// if else 3 
		Scanner scn = new Scanner(System.in);
        // electricity bill 
		/*		
		// 1 = 50 units 
		// 2 = 51 - 150 
		// 3 = 151-250 
		// 220 
		
		// 50 + 300 + 60
		
		int units = scn.nextInt(); 
		
		if(units < 50){
			units = units * 1 ; 
			System.out.println("Your bill for this amount is " + units + " is " + units);
			
		}
		else if(units > 50 && units <= 150){
			// units = units + (units - 50)*2;
			System.out.println(50*1 + (units - 50)*2) ;
			
		}
		else if (units > 150 && units <= 250){
			System.out.println(50*1 + 100 *2 +(units - 150)*3); 
			
		}
		else if (units > 250){
			System.out.println(50*1 + 100*2 + 100*3 + (units -250)*5);
			
		}
		int x = 10;

int y = 20;

{

System.out.print(x + ", " + y);

}

{

System.out.print(" - " + x + ", " + y);

}

System.out.print(" - " + x + ", " + y);


long album_sold = scn.nextLong();
if(album_sold >= 500000 && album_sold < 1000000){
	System.out.println("gold");
}
else if(album_sold >=1000000 && album_sold < 10000000){
	System.out.println("platinum");
}
else if(album_sold > 10000000){
	System.out.println("diamond");
}
else{
	System.out.println("None");
}

int x = 10;

{

int y = 20;

System.out.print(x + ", " + y);

}

{

y = 10;

x = 15;

System.out.print(" - " + x + ", " + y);

}

System.out.print(" - " + x + ", " + y);



if(true) {
        if(true) {
            if(false) {
                System.out.println("Hey there");
            }
        }
        else {
            System.out.println("Hello");
        }
    }
    else {
        System.out.println(10/0);
		
	}
	
	// scope and life of variable 
	
	// if the variables are created in the main block , then that variable is accessible to all the blocks 
	int a = 20;
	{
		a= 34; 
		int b = 45;
	}
 {
		b = 79; 
	}
	System.out.println(b);
	System.out.println(a);
	// changes are not restricted to block but life of scope is restricted to block 
	// if a variable is created inside a block then it's is restricted to that block only 
    
