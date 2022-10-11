Q1 

Mr. Q has a diary in which a lot of numbers are written. He wants to know the sum of digits for every number. First Ask Mr. Q about the numbers written in the diary and then write a code to find the sum of digits for every number.
Note: Total different Numbers are T and for every number (let's say N) you need to find the Sum of digits.
 import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 
        int T = scn.nextInt(); 
        //    int sum = 0 ; 
        while ( T > 0){
            int n = scn.nextInt(); 
            int sum = 0 ; 
        
            while ( n > 0 )
            {
                int rem = n % 10 ; 
                sum = sum + rem ; 
                n = n / 10 ;
            }
            System.out.println(sum);
            T-- ; 
        }
          
    }
}

Q2 

                                                          
                                                          
