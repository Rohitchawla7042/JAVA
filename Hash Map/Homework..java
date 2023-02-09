Q1 Problem Description
Given an array A. You have some integers given in the array B.

For the i-th number, find the frequency of B[i] in the array A and return a list containing all the frequencies.



  public class Solution {
    public int[] solve(int[] A, int[] B) 
    {
         HashMap<Integer , Integer> map = new HashMap<>(); 
        int ans[] = new int[B.length]; 
    //  HashMap<Integer , Integer> map = new HashMap<>(); 
   int old_freq = 0 ; 
     for(int i = 0 ; i < A.length ; i++)
     {
         if(map.containsKey(A[i])== true)
         {
            //  int old_freq = 1 ; 
            old_freq = map.get(A[i]); 
             map.put(A[i] ,old_freq+1); 
         }
         else {
             map.put(A[i] ,1); 
         }
     }
     for(int i = 0 ; i < B.length ; i++){
         if(map.containsKey(B[i])==true)
         {
             ans[i] = map.get(B[i]);  
         }
     }
     return ans ; 

        
    }
}
