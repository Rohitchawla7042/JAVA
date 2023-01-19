Q1 
You are given two matrices A & B of equal dimensions and you have to check whether two matrices are equal or not.

 
  public class Solution {
    public int solve(int[][] A, int[][] B) {
        // int n = A.length ; 
        // int m = B[0].length ; 
        for(int i = 0 ; i < A.length ; i++){
            for(int j = 0 ; j < A[i].length ; j++){
                if(A[i][j] != B[i][j]){
                    return 0 ; 
                }
                // return 1 ; 
            }
            // return 1 ; 
        }
        return 1 ; 
    }
}

Q2 
ou are given two integer matrices A and B having same size(Both having same number of rows (N) and columns (M). You have to subtract matrix B from A and return the resultant matrix. (i.e. return the matrix A - B).

If A and B are two matrices of the same order (same dimensions). Then A - B is a matrix of the same order as A and B and its elements are obtained by doing an element wise subtraction of A from B.
                                                           
 public class Solution {
    public int[][] solve(int[][] A, int[][] B) {
        // int n = A.length ; 
        // int m = B[0].length ; 
        int mat[][] = new int[A.length][A[0].length]; 
        for(int i = 0 ; i < A.length ; i++){
            for(int j = 0 ; j < A[i].length ; j++){
                mat[i][j] = A[i][j] - B[i][j]; 
            }
            // return mat; 
        }
        return mat; 
    }
}

                                                           
 Q3 
 Given a 2D integer array C[][] of A rows and B columns. Return an integer array of size B that represents the sums of the columns of the 2D array C.
                                                           
 public class Solution {
    public int[] solve(int A, int B, int[][] C) {
        int arr[] = new int[B]; 
        for(int j = 0 ; j < B ; j++){
            int ans = 0; 
            for(int i = 0 ; i < A ; i++){
                ans+=C[i][j]; 
                // arr[i] = ans ;  

            }
            arr[j] = ans ; 
        }
        return arr ; 
    }
}

                                                           
Q4 
Problem Description
Given a 2D array A of N rows and M columns. Find value of largest element in each row.

  
  public class Solution {
    public int[] solve(int[][] A) {
        int arr[] = new int [A.length];
        // int max = arr[0]; 
        for(int i = 0 ; i < A.length ; i++){
            int max = A[i][0];  
            for(int j = 0 ; j < A[i].length ; j++){
                if(A[i][j] > max){
                    max = A[i][j]; 
                }
                // arr[i] = max ;
                arr[i] = max ;  
            }
        }
        return arr ; 
    }
}

                                                           
                                                           
                                                           
