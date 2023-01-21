Q1 
Problem Description

You are given a N X N square integer matrix A. You have to tell whether A is an identity matrix or not.

Identity matrix is a special square matrix whose main diagonal elements are equal to 1 and all other elements are 0.



public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[][] A) {
        for(int i = 0 ; i < A.length ; i++){
            if(A[i][i] != 1){
                return 0; 
            }
        }
        return 1 ; 
    }
}


Q2 

Problem Description

You are given a matrix A, you have to return another matrix which is the transpose of A.

NOTE: Transpose of a matrix A is defined as - AT[i][j] = A[j][i] ; Where 1 ≤ i ≤ col and 1 ≤ j ≤ row. The tranpose of a matrix switches the element at (i, j)th index to (j, i)th index, and the element at (j, i)th index to (i, j)th index.

public class Solution {
    public int[][] solve(int[][] A) {
        int n = A.length ; 
        int m = A[0].length ; 
        int B[][] = new int[m][n]; 
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                B[i][j] = A[j][i]; 
            }
        }
        return B ; 
    }
}


Q3 
Problem Description

You are given two integer matrices A and B having same size(Both having same number of rows (N) and columns (M). You have to subtract matrix B from A and return the resultant matrix. (i.e. return the matrix A - B).

If A and B are two matrices of the same order (same dimensions). Then A - B is a matrix of the same order as A and B and its elements are obtained by doing an element wise subtraction of A from B.



public class Solution {
    public int[][] solve(int[][] A, int[][] B) {
        int diff[][] = new int[A.length][A[0].length]; 
        for(int i = 0 ; i < A.length ; i++){
            for(int j = 0  ; j < A[0].length ; j++){
                diff[i][j] = A[i][j] - B[i][j]; 
            }
        }
        return diff ; 
    }
}




