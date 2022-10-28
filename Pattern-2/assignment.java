Q1 
Given an integer N as input, print the corresponding pattern for N.

For example if N = 5 then pattern will be like:

*   *
*   *
*   *
*   *
*   *

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 
        int n = scn.nextInt(); 
        for(int i = 1 ; i <= n ; i++){
            // System.out.print("*");
            for(int j = 1 ; j <= 1 ; j++){
                System.out.print("*");
            }
            for(int j = 1 ; j <= n-2 ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= 1 ; j++){
                System.out.print("*");
            }
            System.out.println(); 
        }
        
    }
}

Q2 
Given an integer N as input, print the corresponding pattern for N.

For example if N = 5 then pattern will be like:

*________* // 8 spaces

**______** // 6 spaces

***____*** // 4 spaces

****__**** // 2 spaces

********** // 0 spaces

NOTE: Here '_' is used to represent spaces. You have to print spaces in your code.
  
  import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 
        int n = scn.nextInt(); 
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*"); 
            }
            for(int j = 1 ; j <= 2*(n - i) ; j++){
                System.out.print(" "); 
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*"); 
            }
            
            System.out.println(); 
        }
        
    }
}

Q3 

Given an integer N as input, print the corresponding pattern for N.

For example if N = 5 then pattern will be like:

********** // 0 spaces

****__**** // 2 spaces

***____*** // 4 spaces

**______** // 6 spaces

*________* // 8 spaces
NOTE: Here '_' is used to represent spaces. You have to print spaces in your code.
  
  import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 
        int n = scn.nextInt(); 
	for(int i = 1 ; i <= n ; i++){
		for(int j = 1 ; j <= n-i+1 ; j++){
			System.out.print("*"); 
		}
		// for(int j = 1 ; j <= i-1 ; j++){
		// 	System.out.print(" "); 
		// }
		for(int j = 1 ; j <= 2*(i - 1) ; j++){
			System.out.print(" "); 
		}
		for(int k = 1 ; k <= n-i+1 ; k++){
			System.out.print("*"); 
		}
		System.out.println(); 
	}
        
    }
}

Q4

Given an integer N as input, print the corresponding Full Numeric Pyramid pattern for N.

For example if N = 5 then pattern will be like:

0 0 0 0 1 0 0 0 0 
0 0 0 2 3 2 0 0 0 
0 0 3 4 5 4 3 0 0
0 4 5 6 7 6 5 4 0
5 6 7 8 9 8 7 6 5 

NOTE: There should be exactly one extra space after each number for each row.
  
  import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 
        int n = scn.nextInt(); 
        for(int i = 1 ; i <= n ; i++){
            int k = i - 1; 
            for(int j = 1 ; j <= n - i ;j++){
                System.out.print(0 + " "); 
            }
            // it is using for incrementing the value and then print the value 
            for(int j = 1 ; j <= i ; j++){
                System.out.print(++k + " ");
                // k++ ; 
            }
            // it is using for decrementing the value and then print the value 
            for(int j = 1 ; j <= i-1 ; j++){
                System.out.print(--k + " ");
                // k-- ; 
            }
            for(int j = 1 ; j <= n - i ;j++){
                System.out.print(0 + " "); 
            }
            System.out.println();

        }
    }
}

Q5 

Problem Description

Given an integer N, print the corresponding Full Pyramid pattern for N.

For example if N = 5 then pattern will be like:

    * 
   * * 
  * * * 
 * * * * 
* * * * * 
NOTE: There should be exactly one extra space after each * for each row.
  
  import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 
        int n = scn.nextInt(); 
        for(int i =1 ; i <= n ;i++){
            for(int j = 1 ; j <= n-i ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*" + " ");
            }
            System.out.println(); 
        }
    }
}


