Q1 

Given a matrix of N rows and M columns, print it row by row. Firstly print 0th row, then 1st row, 2nd row and so on.


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
        int m = scn.nextInt(); 
        int mat[][] = new int [n][m]; 
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                mat[i][j] = scn.nextInt(); 
            }
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                System.out.print(mat[i][j]); 
            }
            System.
        }
        
        
    }
}

Q2 
Given a matrix of N rows and M columns, print it column by column. Firstly print 0th column, then 1st column, 2nd column and so on.


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
        int m = scn.nextInt(); 
        int mat[][] = new int[n][m]; 
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                mat[i][j] = scn.nextInt(); 
            }
        }
        for(int j = 0 ; j < m ; j++){
            for(int i = 0 ; i < n ; i++){
                System.out.print(mat[i][j] + " "); 
            }
            System.out.println(); 
        }
        
    }
}


Q3 

Write a program to input an integer N and a N*N matrix Mat from user and print the matrix in wave form (column wise)

See example for clarifications regarding wave print.



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
        // int m = scn.nextInt(); 
        int mat[][] = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                mat[i][j] = scn.nextInt(); 
            }
        } 
        for(int j = 0 ; j < n ; j++){
            if(j %2 == 0){
                for(int i = 0 ; i < n ; i++){
                    System.out.print(mat[i][j] + " "); 
                } 
            }
            else{
                for(int i = n-1 ; i >= 0 ; i--){
                    System.out.print(mat[i][j] + " "); 
                }
            }

        }
        
    }
}


Q4 

You are given an integer matrix mat and you have to print the elements of the matrix in wave form (row wise)

See example for clarifications regarding wave print.

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
        // int m = scn.nextInt(); 
        int mat[][] = new int[n][n]; 
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                mat[i][j] = scn.nextInt(); 
            }
        }
        for(int i = 0 ; i < n ; i++){
            if(i % 2 == 0){
                for(int j = 0 ; j < n ; j++){
                    System.out.print(mat[i][j] + " "); 
                }
            }
            else{
                for(int j = n-1 ; j >= 0 ; j--){
                    System.out.print(mat[i][j] + " "); 
                }
            }
        }
        
    }
}


Q5 

You are given a 2D integer matrix A, return a 1D integer array containing row-wise sums of original matrix.



public class Solution {
    public int[] solve(int[][] A) {
        int mat[] = new int [A.length]; 
        int n = A.length ; 
        int m = A[0].length ;  
        // mat[] =  0 ; 
        //  int sum = 0 ; 
        for(int i = 0 ; i < n ; i++){
            int sum = 0 ; 
            for(int j = 0 ; j < m ; j++){
                sum = sum + A[i][j]; 

            }
            mat[i] = sum ; 
         }
        return mat ; 
    }
}


Q6 

You are given two matrices A & B of same size, you have to return another matrix which is the sum of A and B.


public class Solution {
    public int[][] solve(int[][] A, int[][] B) {
        int sum[][] = new int[A.length][A[0].length]; 
        for(int i = 0 ; i < A.length ; i++){
            // sum[i][j] = 0 ; 
            // int sum[][] = new int[A.length][A[i].length]; 
            for(int j = 0 ; j < A[0].length ; j++){
                sum[i][j] = A[i][j] + B[i][j]; 
            }
        }
        return sum ; 
    }
}

