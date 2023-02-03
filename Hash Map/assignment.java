Q1 

You are given an array A of N integers. Return the count of elements with frequncy 1 in the given array.
  
 public class Solution {
    public int solve(int[] A) {
      HashMap<Integer , Integer> map = new HashMap<>(); 
      for(int i = 0 ; i < A.length ; i++) 
      {
        if(map.containsKey(A[i]==true)) 
        {
          int old_freq = 1 ; 
          map.put(A[i] , old_freq+1) ; 
        }
        else 
        {
          map.put(A[i] , 1) ; 
        }
      }
      int count = 0 ; 
      for(int key : map.KeySet()) 
      {
        if(map.get(key)==1)
        {
          count++; 
        }
      }
      return count ; 
        

      
      Q2 
        You are given an array A of N integers. You will have to return number of distinct elements of the array.
        
        import java.util.*; 
public class Solution 
{
    public int solve(int[] A) 
    {
      HashSet<Integer> map = new HashSet<>(); 
      for( int i = 0 ; i < A.length ; i++ )  
      {
        map.add(A[i]) ; 
      }
      return map.size(); 
      
    }
}
      
      
