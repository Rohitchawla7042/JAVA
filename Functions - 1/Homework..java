Q1 
Given an integer A, find the floor value of real number A / 200.

Floor value of a real number X is the greatest integer less than or equal to X.

public class Solution {
    public int solve(int A) {
        // A = A / 200.0 ; 
        double ans = A / 200.0 ;
        int res = (int)Math.floor(ans); 
        // System.out.println(ans); 
        return res ; 
        
    }
}

Q2

Given an integer A, find the ceil value of real number A / 200.

Ceil value of a real number X is the smallest integer value that is greater than or equal to X.


  
  public class Solution {
    public int solve(int A) {
        // A = A / 200.0 ; 
        double ans = A / 200.0 ;
        int res = (int)Math.ceil(ans); 
        // System.out.println(ans); 
        return res ; 
        
    }
}


Q3

Problem Description:

Given the temperature of a day in Degrees Celsius, convert this given temperature from Celsius to Fahrenheit. Write a program to do so. Round the output up to 2 decimal places

Note1:

Python : Use round(ans,2) to round up ans to two decimals

Java : Use Math.round(val*100)/100d to round upto two decimals

public static double solve(double celsius) {
double convert = (celsius * 9/5)+32; 
double ans = Math.round(convert*100)/100d; 
return (ans); 

}

Q4

Given an integer A, find the rounded value of real number A / 200.

Rounded value of a real number X is the integer which is nearest to X, with halfway cases rounded away from zero.
  
  
  public class Solution {
    public int solve(int A) {
     double B = A/200d ; 
     double res = 0 ; 
     if(B<= 0){
         res = B- 0.5; 
     }
     else
     res = B+0.5 ; 
     return (int)res; 
    }
}


Q5

Problem Description
Given three integers, A, B and C. You have to find the number of days it will take to reach zero cases of Corona in a city.

A - Average cases recovered in a day of the corona.
B - Number of new cases of corona daily.
C - Current active cases of the corona.

Return the minimum number of days it will take to reach 0 active cases of Covid.
  
  public class Solution 
{
    public int solve(int A, int B, int C) 
    {
    //   A = > avg or recovered 
    // B = > new cases 
    //  C = > active case
    int count = 0 ;  
    while(C > 0)
    {
        C = B + C ; 
        C = C - A; 
        count++ ; 
    }
    return count ; 
    
        
    }
}




