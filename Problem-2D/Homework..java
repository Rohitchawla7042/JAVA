Q1 

Problem Description
You are given a matrix A, you have to return an array containing sum of each row elements followed by sum of each column elements of the matrix.

NOTE: If the matrix given is of size (N x M), then the array you return would be of size (N + M), where first N elements contain the sum of each N rows, and the next M elements contain the sum of each M columns.

public class Solution {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> ans = new ArrayList<>(); 
        // column wise addition 
        for(int i = 0 ; i < A.size(); i++){
            int sum = 0; 
            for(int j = 0 ; j < A.get(0).size(); j++){
                sum+= A.get(i).get(j); 
            }
            ans.add(sum); 
        }
        for(int j = 0 ; j < A.get(0).size(); j++){
            int sum = 0 ; 
            for(int i = 0 ; i < A.size(); i++){
                sum+= A.get(i).get(j); 
            }
            ans.add(sum); 
        }
        return ans ; 
    }
}



Q2 

Problem Description
You are given a matrix A and and an integer B, you have to perform scalar multiplication of matrix A with an integer B.

public class Solution {
    public int[][] solve(int[][] A, int B) {
        int n = A.length ; 
        int m = A[0].length ; 
        int res[][] = new int[n][m]; 
        // int i , j ; 
        // int mul=1; 
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < m ; j++){
                res[i][j] =(A[i][j])*B; 
            }
            // res[i][j] =  mul ; 
        }
        return res ; 
    }
}




Q3 

Problem Description
You are given a N X N integer matrix. You have to find the sum of all the main diagonal elements of A.

Main diagonal of a matrix A is a collection of elements A[i, j] such that i = j.

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[][] A) {
        int n = A.length ; 
        int m = A[0].length ; 
        int sum = 0 ; 
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(i==j)
                {
                sum += A[i][j]; 
                }

            }
        }
        return sum ; 
    }
}


Q4 

You are given two integer matrices A(having M X N size) and B(having N X P). You have to multiply matrix A with B and return the resultant matrix. (i.e. return the matrix AB).



public class Solution {
    public int[][] solve(int[][] A, int[][] B) 
    {
        int r1 = A.length ; 
        int c1 = A[0].length ; 
        int r2 = B.length; 
        int c2 = B[0].length ; 
        int res[][] = new int[r1][c2]; 
        for(int i = 0 ; i < r1 ; i++)
        for(int j = 0 ; j < c2 ; j++){
            int sum = 0 ; 
            for(int k = 0 ; k < c1 ; k++){
                sum += A[i][k] * B[k][j]; 
            }
            res[i][j] = sum ; 
        }
    return res ; 

    }
}



