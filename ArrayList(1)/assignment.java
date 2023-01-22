Q1 
Problem Description:

Write a program that returns the list of elements that are present in the given list and are divisible by 5 and 7.
  
  public static ArrayList<Integer> solve(ArrayList<Integer> arr) {
    // Complete function template here
    ArrayList<Integer> al = new ArrayList<>(); 
    for(int i = 0 ; i < arr.size(); i++){
        int element = arr.get(i); 
        if(element % 5 == 0 && element % 7 ==0){
            al.add(element); 

        }
    }
    return al ; 

}


Q2 

Problem Description
You are given an integer array A, you have to return an integer array of same size whose ith element is the frequency count of A[i] in array A .
  
  public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<>(); 
      
      for(int i = 0 ; i < A.size(); i++)
      {
        int count = 0 ; 
        int val = A.get(i); 
        
        for(int j = 0 ; j < A.size(); j++)
        {
          int num = A.get(j); 
          if(val == (num))
          {
            count++; 
          }
          
        }
        ans.add(count); 
      }
      return ans ; 
      
     
      
    Q3   Problem Description
Given a 2D integer array C[][] of A rows and B columns. Return an integer array of size B that represents the sums of the columns of the 2D array C.
        
  public class Solution {
    public ArrayList<Integer> solve(int A, int B, ArrayList<ArrayList<Integer>> C) {
        ArrayList<Integer>ans = new ArrayList<>(); 
        for(int i = 0 ; i <B ; i++)
        {
            int sum = 0 ; 
            for(int j = 0 ; j < A ; j++){
                sum+= C.get(j).get(i); 
            }
            ans.add(sum); 
        }
        return ans ; 
        
    }

}
        
      
      
      
      
      
  
  
