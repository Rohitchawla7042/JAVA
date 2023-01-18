Q1 Write a program to print all negative numbers from input array A of size N. Take integer N and N elements of the array as input from user.


  import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in); 
        // int count = 0 ; 
        int n = scn.nextInt(); 
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] =  scn.nextInt();
        
        if(arr[i] < 0){
            System.out.print(arr[i] + " "); 
        }
        }
        
    }
}

Q3 

You are given T(number of test cases) integer arrays. For each array A, you have to find the value of absolute difference between the counts of even and odd elements in the array.


  
  import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in); 
        int T = scn.nextInt();
        while(T > 0)
        {
            int odd = 0 ; 
            int even = 0 ; 
            int n = scn.nextInt(); 
            int A[] = new int [n+1]; 
            for(int i = 1 ; i <= n ; i++){
                A[i] = scn.nextInt(); 
            }
            for(int i = 1 ; i <= n ; i++){
                if(A[i]%2==0){
                    even++; 
                }
                else
                odd++; 
            }
            int res = even - odd ; 
            System.out.println(Math.abs(res)) ; 
            T-- ; 
        }
    }
}

        


