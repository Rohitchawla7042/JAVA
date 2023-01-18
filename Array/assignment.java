Q1 Problem Description

Write a program to print the input array A of size N in reverse order where you have to take integer N and further N elements as input from user.


 import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in); 
        int n = scn.nextInt(); 
        int arr[] = new int[n+1]; 

        for(int i = 1 ; i <= n ; i++){
            arr[i] = scn.nextInt(); 
        }

        for(int i = n ; i >= 1 ; i--){
            System.out.print(arr[i] + " "); 
        }

        
    }
}

Q2 
Problem Description

Write a program to print maximum and minimum elements of the input array A of size N. The only line of the input would contain a single integer N that represents the length of the array followed by the N elements of the input array A.

  
  import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in); 
        int n = scn.nextInt(); 
        int arr[] = new int[n+1]; 

        for(int i = 1 ; i <= n ; i++){
            arr[i] = scn.nextInt(); 
        }
        int max = arr[1]; 
        int min = arr[1]; 
        for(int i = 1 ; i <= n ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            else if(arr[i] < min)
            min = arr[i]; 
            
        }
        System.out.println(max + " " + min); 
        
    }
}

Q3 
Write a program to print sum of elements of the input array A of size N.


  import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in); 
        int n = scn.nextInt(); 
        int sum = 0 ; 
        int arr[] = new int[n+1]; 
        for(int i = 1 ; i <= n ; i++){
            arr[i] = scn.nextInt();
        }
        for(int i = 1 ; i <= n ; i++){
            sum = sum + arr[i]; 
        }
        System.out.println(sum); 
        
    }
}

Q4 
Write a program that returns the product of all elements present in the array.
  public static long solve(int[] arr) {
    // Complete the function template here
    long prod = 1 ; 
    for(int i = 0 ; i < arr.size(); i++){
        prod = prod * arr.get(i); 
    }
    // prod = prod * arr[i]; 
    return prod ; 
    
}

