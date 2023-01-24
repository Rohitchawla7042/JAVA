Q1 Given an Array of integers A, every element in it is repeated twice except one, find that unique element.


public class Solution {
    public int solve(ArrayList<Integer> A) 
    {
        // ArrayList<Integer> ans = new ArrayList<>(); 
        int n = A.size(); 
        int res = 0 ; 
        for(int i = 0 ; i < n ; i++){
            int val = A.get(i); 
            int count = 0 ; 
            for(int j = 0 ; j < n ; j++){
                if(val == A.get(j)){
                    count++ ; 
                }
            
            }
            if(count == 1){
                res = val ; 
            }
        }
        return res ; 
        
    }
}


/*
public class Solution {
    public static int solve(ArrayList<Integer> A) {
        int length = A.size();
        int ret_val = 0;
        for(int i = 0; i < length; i++){
            int val = A.get(i);
            int count = 0;
            for(int j = 0; j < length; j++){
                if(val == A.get(j)){
                    count++;
                }
            }
            if(count == 1){
                ret_val = val;
            }
        }
        return ret_val;
    }
}
*/ 




Q2 

Problem Description
Given a 2D array A of N rows and M columns. Find value of largest element in each row.


public class Solution {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> ans = new ArrayList<>(); 
        int n = A.size(); 
        // int m = A.size(); 
        // int max = 0 ; 
        for(int i = 0 ; i < A.size(); i++){
            // int element = A.get(i); 
            int max = 0 ; 
            for(int j = 0 ;j < A.get(0).size(); j++){
                // int val = A.get(j); 
                max = Math.max(max,A.get(i).get(j)); 
                // ans.add(max); 
            }
            ans.add(max); 
        }
        return ans ; 
    }
}



Q3 

roblem Description
You are given a matrix A, you have to return an array containing sum of each row elements followed by sum of each column elements of the matrix.

NOTE: If the matrix given is of size (N x M), then the array you return would be of size (N + M), where first N elements contain the sum of each N rows, and the next M elements contain the sum of each M columns.

public class Solution {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) 
    {
        ArrayList<Integer>ans = new ArrayList<>(); 
        //  col wise add 
        for(int i = 0 ; i < A.size();i++){
            int sum = 0 ; 
            for(int j = 0 ; j < A.get(0).size(); j++){
                sum+= A.get(i).get(j); 
            }
        ans.add(sum); 
        }
        // return ans ; 

        //  row wise add
        for(int j = 0 ; j < A.get(0).size(); j++){
            int sum = 0 ; 
            for(int i = 0 ; i < A.size(); i++){
                sum+=A.get(i).get(j);
            }
            ans.add(sum); 
        }
        return ans ; 
    }

    
}


