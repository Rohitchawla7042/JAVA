Q1 

Problem Description

Given an integer N, print the corresponding Inverted Half Pyramid pattern for N.

For example if N = 4 then pattern will be like:

****
***
**
*


import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 
        int n = scn.nextInt(); 
for(int i = n ; i > 0 ; i--){
	for (int j = 0 ; j <i ; j++ ){
		System.out.print("*");
	}
	System.out.println(); 
}
// System.out.println(); 
        
    }
}

Q2


Problem Description
Given an integer N as input, print the corresponding pattern for N.

For example if N = 5 then pattern will be like:

____*
___**
__***
_****
*****

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 
        int N = scn.nextInt(); 
        for (int i = 1; i <= N; i++)
        {
            for (int j = 1; j <= N; j++)
            {
                if (j < N-i+1)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
       
    }
}

Q3

Problem Description
Given an integer N as input, print the corresponding pattern for N.

For example if N = 5 then pattern will be like:

*****
_****
__***
___**
____*
Note : Here '_' represents space for explanation purpose only. You have to print space in your code.
	
	import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 
        int n  = scn.nextInt(); 
		for(int i = 0 ; i < n ; i++){
			for (int j = 1 ; j <= i ; j++){
				System.out.print(" ");
			}
			for(int j = i ; j < n ;j++){
				System.out.print("*"); 
			}
			System.out.println(); 
		}
    }
}

