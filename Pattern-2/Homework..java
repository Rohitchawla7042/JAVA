Q1 Problem Description
Given an integer N as input, print the corresponding pattern for N.

For example if N = 5 then pattern will be like:

*****
*   *
*   *
*   *
*****
Note : Except for the first line and the last line, every line will have N-2 spaces between the two stars.
  
  import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in); 
       int n = scn.nextInt(); 
       for(int i = 1 ; i <= n ; i++)
       {
           System.out.print("*"); 
           for(int j = 1 ; j <= n - 2 ; j++)
           {
            //    System.out.print("");
           
           if(i==1 || i == n  )
               System.out.print("*");
           else
           System.out.print(" ");
           }
       
       System.out.println("*");
       }
       
    }
}

Q2 

Problem Description

Given an integer N as input, print the corresponding Hollow Inverted Half Pyramid pattern for N.

For example if N = 6 then pattern will be like:

******
*   *
*  *
* *
**
*

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); 
        for(int i =1  ; i <= n ; i++)
        {
            System.out.print("*");
        }
        System.out.println(); 
            int j = n - 2 ; 
            for(int k = j ; k >= 1 ; k--)
            {
                System.out.print("*");
                for(int m = k - 1 ;m>= 1 ; m-- )
                {
                    System.out.print(" "); 
                }
                System.out.print("*"); 
                System.out.println(); 
            }
            System.out.println("*");
            
        
            
    }
}

Q3 

Problem Description

Given an integer N as input, print the corresponding Half Diamond pattern with 2*N - 1 rows.

For example if N = 5 then pattern will be like:

* 
**
***
****
*****
****
***
**
*
NOTE: There should be no spaces after any * .
  
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
            for(int j = 1 ; j <= n - i ; j++){
                System.out.print("");
            }
            System.out.println(); 
        }  

        for(int i = 2 ; i<=n ; i++){
            for(int j = 1 ; j <= n-(i-1) ; j++){
                System.out.print("*");
            }
            for(int j = 1 ; j <= i - 1 ; j++){
                System.out.print("");
            }
            System.out.println(); 
        }      
    }
}

Q4 

Problem Description
Given an integer N as input, print the corresponding Inverted Full Pyramid pattern for N.

For example if N = 5 then pattern will be like:

* * * * * 
 * * * * 
  * * * 
   * *    
    * 
  
  import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in); 
       int n = scn.nextInt(); 
    //    for(int i =1 ; i <= n ;i++){
    //         for(int j = 1 ; j <= n-i ; j++){
    //             System.out.print(" ");
    //         }
    //         for(int j = 1 ; j <= i ; j++){
    //             System.out.print("*" + " ");
    //         }
    //         System.out.println(); 
    //     }

    //  for(int i = n ; i >= 1 ; i--){
    //      for(int j =0 ; j < n - i; j++){
    //          System.out.print(""); 
    //      }
    //      for(int j = 0 ; j != (2*i)-1 ; j++){
    //          System.out.print("*");
    //      }
    //      System.out.println(); 
    //  }
     for (int i = 0 ; i < n ; i++ ) 
		{
			for(int j = 0 ; j < i ; j++){
                System.out.print(" "); 
            }
            for(int j = 1 ; j <= n- i ; j++){
                System.out.print("* ");
            }
            System.out.println(); 
		}
    }

}


