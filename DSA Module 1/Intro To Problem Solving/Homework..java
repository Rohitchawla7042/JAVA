Q1 
Problem Description
You are given an integer A. You have to tell whether it is a perfect number or not.

Perfect number is a positive integer which is equal to the sum of its proper positive divisors.

A proper divisor of a natural number is the divisor that is strictly less than the number.

public class Solution {
    public int solve(int A) {
        int temp=0 ; 
        for(int i = 1 ; i < A ; i++){
            if(A%i==0){
                temp+= i ; 
            }
        }
        // return temp ;
        if(temp == A){
            return 1 ; 
        }
        return 0 ; 
    }
}


Q2 

You will be given an integer n. You need to return the count of prime numbers less than or equal to n.

public class Solution {
    public int solve(int A) {
        int count = 0 ; 
        for(int i = 1 ; i <= A ; i++){
            if(is_prime(i)){
                count++; 
            }
        }
        return count ; 
        
    }
    public boolean is_prime(int n){
        int count = 0 ; 
        for(int i = 1 ; i*i <= n ; i++){
            // int count = 0 ; 
            if(n%i==0)
            {
                if(i*i!=n)
                count +=2; 
                else
                count++; 

            }
        }
        if(count==2){
            return true ; 
        }
        return false ; 
    }
}


Q3 

You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.



public class Solution {
    public int[] solve(int[] A, int[][] B) {
        int n = B.length ;
        int a[] = new int[n]; 
        for(int i = 0 ; i < n ; i++){
            for(int j = B[i][0];j<=B[i][1];j++){
                a[i] += A[j]; 
            }
        } 
        return a ; 
        
    }
}


Q4 

Given an array A of N integers. Count the number of elements that have at least 1 elements greater than itself.

public class Solution {
    public int solve(int[] A) {
        int count = 0 ; 
       int n = A.length ; 
       int max = A[0]; 
       for(int i = 0 ; i < n ; i++)
       {
           if(max < A[i]){
               max = A[i]; 
               count = 1 ; 
           }
        // int count = 0 ; 
        else if(max == A[i]){
            count++; 
        }
       }
       return n - count ; 
    }
}



Q5 

You are given an array A of N elements. You have to make all elements unique. To do so, in one step you can increase any number by one.

Find the minimum number of steps.

public class Solution {
    public int solve(int[] A) 
    {
        Arrays.sort(A); 
        int count = 0 ; 
       for(int i = 0 ; i < A.length-1 ; i++){
           if(A[i] < A[i+1])
               continue ;
           else if (A[i] >=A[i+1])
           {
               while(A[i+1]<=A[i])
               {
                   A[i+1]++ ; 
                   count++; 
               }
           }
       }
        return count ; 
        
    }
}


