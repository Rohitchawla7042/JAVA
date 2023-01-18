Q1 

You are provided with an integer array A. Return another array B of size same as that of A such that B[i] = A[i]3 for 1 <= i <= |A| (1 based indexing).

  public class Solution {
    public long[] solve(int A[])
    {
        long arr[] = new long [A.length]; 
        for(int i = 0 ; i < A.length ; i++){
            long number = (long)A[i]; 
            arr[i] = number * number * number;
            // return arr; 
        }
        return arr ; 
    }
    
}

Q2 
Write a program for a given integer x and a list ls to return the first multiple of x that occurs in the list, and if there isn’t any multiple of x in the list then return -1.


  public static int first_multiple(int[] ls, int x) {
    // Write your code here
    for(int i = 0 ; i < ls.length ; i++){
        if(ls[i] % x == 0){
            // int multiple = ls[i]; 
            return ls[i]; 
        }
    }
    return -1 ; 
}



Q3 
Write a function to check if the input list has consecutive duplicate elements or not.
Return True if there are consecutive duplicate elements in the list else return False.

Here by consecutive duplicates, we mean duplicates that are present at consecutive indices in the array

public static boolean solve(int arr[]) {
    // Complete the function here
    for(int i = 0 ; i <arr.length -1  ; i++){
        if(arr[i] == arr[i+1]){
            return true;
        }
    }
    return false ; 
}



