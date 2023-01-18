Q1 You are given an integer T (number of test cases). You are given array A and an integer B for each test case. You have to tell whether B is present in array A or not.


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
        while (T > 0)
        {
            int n = scn.nextInt(); 
            int A[] = new int[n+1]; 
            for(int i = 0 ; i <n ; i++){
                A[i] = scn.nextInt(); 
            }
            int B = scn.nextInt(); 
            for(int i = 0 ; i < A.length; i++)
            {
                if(A[i]==B)
                {
                    System.out.println("1"); 
                    break ; 
                }
                else 
                System.out.println("0");
                break ; 
            }
            // System.out.println("0"); 
            T-- ;
        }
        // T-- ; 
        
    }
}

Q2 

Given an integer array A. Find and return the frequency of number B in array A.


public class Solution {
    public int solve(int[] A, int B) {
        int count = 0 ; 
        for(int i = 0 ; i <A.length ; i++){
            if(A[i]==B){
                count++; 
            }
        }
        return count ; 
    }
}


Q3 
You are given an integer T denoting the number of test cases. For each test case, you are given an integer array A.

You have to print the odd and even elements of array A in 2 separate lines.

NOTE: Array elements should have the same relative order as in A.



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
        for(int i = 1; i <= T ; i++)
        {
            int N = scn.nextInt();
            int arr[] = new int [N] ; 
            for(int j = 0 ; j < N ; j++){
                arr[j] = scn.nextInt(); 
                int res = arr[j] % 2 ; 
                if(res==1){
                    System.out.print(arr[j] + " ");
                }
            }
            System.out.println(); 

            for(int j = 0 ; j < arr.length ; j++){
                int res = arr[j] % 2 ; 
                if(res == 0){
                    System.out.print(arr[j] + " "); 
                }
            }
            System.out.println(); 

        }
        
    }
}

Q4 

Given a sorted integer array A, and an integer B. Find the first and last index of B in A.
It is guaranteed that B exists in A. Return an array C of size 2, where C[0] is the first index of B in A and C[1] is the last index of B in A.

Note - Indexing of A starts from 0. If the element only exists once, the values of both elements in the C list should be the same.






