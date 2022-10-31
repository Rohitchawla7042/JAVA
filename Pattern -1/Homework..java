Q1 
Given two integers N and M as inputs, print a rectangle of N * M stars.

For example if N = 3, M = 4 then pattern will be like:

****
****
****

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 
        int n = scn.nextInt(); 
        int m = scn.nextInt(); 
        for (int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                System.out.print("*");
            }
            System.out.println(); 
        }
        
    }
}

Q2 

Problem Description

Given an integer N as input, print the corresponding stair pattern for N.

For example if N = 4 then stair pattern will be like:

*
**
***
****

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 
        int n = scn.nextInt(); 
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j <= i ;j++){
                System.out.print("*"); 
            }
            System.out.println(); 
        }

        
    }
}


Q3 

Q3. Numeric Stair Pattern
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

Given an integer N as input, print the corresponding pattern for N.

For example if N = 4 then pattern will be like:

1
1 2
1 2 3
1 2 3 4
  
  import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 
        int n = scn.nextInt(); 
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                if(i == j){
                    System.out.print(j); 
                }
                else
                System.out.print(j+" ");
            }
            System.out.println(""); 
        }
    }
}

Q4 

Problem Description
Given an integer N as input, print the corresponding pattern for N.

For example if N = 5 then pattern will be like:

1
1_
1_3
1_3_
1_3_5
Note : Here '_' represents space for explanation purpose only. You have to print space in your code.
  
  import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 
        int n = scn.nextInt();
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
				if(j %2 != 0)
                System.out.print(j+"");
				else
				System.out.print(" ");
            }

            System.out.println(); 
        }
    }
}

