import java.util.*;
import java.util.Scanner;
class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in); 
		// while loop 
		/*
		
		Q1 
		int i = 1 ;
		while(i <= 5){
			System.out.println(i); 
			i++; 
		}
		// System.out.println("This " + i + " is greater than 5");
		
		Q2
		
		int n = scn.nextInt(); 
		int i = 1 ; 
		while (i <= n){
			System.out.println(i); 
			i++; 
		}
		
		
		// Q3 
		
		int n = scn.nextInt(); 
		int i = 0;	
		while(i <= n){
			if(i % 2 == 0){
				System.out.println(i);
			}
			i++;	
		}
		
		// Q4 
		
		1st approach 
		int n = scn.nextInt(); 
		int i = 1; 
		while(i<=n){
			System.out.println(i);
			i =i + 2; 
		}
		
		2nd approach 
		
		int n = scn.nextInt(); 
		int i = 1 ; 
		while(i <= n){
			if(i %2 != 0){
				System.out.println(i);
			}
			i++ ;
		}
		
	
	
	int i = 5;
while(i <= 10){
    System.out.println(i);
    i = i*2;
}

int n = scn.nextInt(); 
int i = 1; 

while(i <= n){
	if(i % 4 == 0){
		System.out.println(i);
	}
	i++; 
}


int n = 5 ;
while (n >= 1){
	System.out.println(n);
	n-- ; 
}

int i = 1;
while(i<=5){
    System.out.println(i);
    i = i-1; 
}



int i = 5; 
while(i <= 5){
	System.out.println(i);
	i--;
}


int n = scn.nextInt(); 
int i = n;
while (i >= 1){
	System.out.println(i);
	i-- ;
}


