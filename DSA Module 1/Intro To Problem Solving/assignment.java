Q1 
Problem Description
Given an integer A, you need to find the count of it's factors.

Factor of a number is the number which divides it perfectly leaving no remainder.

Example : 1, 2, 3, 6 are factors of 6
  
  public class Solution {
    public int solve(int A) {
        int count = 0 ; 
        // A = (int)(Math.sqrt(A)); 
        for(int i = 1 ; i*i <=A ; i++)
        {
            if(A%i==0)
            {
                if(i*i!=A)
                count +=2 ; 
                else 
                count++; 

            }
        }
        return count ; 
    }
}


Q2 Given an Integer A. Return 1 if A is prime and return 0 if not.

 public class Solution {
    public int solve(long A) {
        int count = 0 ; 
        // A = (int)(Math.sqrt(A)); 
        for(long i = 1 ; i*i <=A ; i++)
        {
            if(A%i==0)
            {
                if(i*i!=A)
                count +=2 ; 
                else 
                count++; 

            }
        }
        // return count ; 
        if(count==2){
            return 1 ; 
        }
        return 0 ; 
    }
}


Q3 
Problem Description
Given an array A of N integers. Also given are two integers B and C. Reverse the array A in the given range [B, C]

public class Solution {
    public int[] solve(int[] A, int B, int C) 
    {
            int n = A.length ; 
            int temp ; 
            // B is starting index ; 
            // C is the ending index ; 
            while(B < C)
            {
                temp = A[B] ; 
                A[B] = A[C]; 
                A[C] = temp ; 
                B++ ; 
                C-- ; 
            }
            return A ; 
            
    }
}



Q4 
You are given a constant array A.

You are required to return another array which is the reversed form of the input array.
  
  public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] solve(final int[] A) {
        int n = A.length ; 
        int temp ; 
        int s = 0 ; 
        int e = n-1 ; 
        while(s < e){
         temp = A[s] ; 
         A[s] = A[e];
         A[e] = temp ; 
         s++; 
         e--; 
        }
        return A ; 
    }
}



Q5 

public class Solution {
    public int[] solve(int[] A, int B) {
        int n = A.length ; 
        B = B % n ; 
        reverse(A , 0 , n-1); 
        reverse(A , 0 , B-1); 
        reverse(A , B , n-1); 
        return A ; 
    }
    public void reverse(int A[] , int start , int end){
        int n = A.length ; 
        while(start < end)
        {

        int temp = A[start]; 
        A[start] = A[end] ; 
        A[end] = temp ; 
        start++; 
        end--; 
        }

    }
}



