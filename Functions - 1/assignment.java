Q1 

Problem Description
Given two numbers A & B. Return their sum.


Problem Constraints
1 <= A <= 107

1 <= B <= 107
  
  import java.util.Scanner; 
public class Solution {
    public static void main(String args[]){
        int x ;
        int y ; 
        int sum ;  
        Scanner scn = new Scanner(System.in); 
        x = scn.nextInt();
        y = scn.nextInt(); 
        sum = solve(x, y); 
        System.out.println(sum);
    }
    public static int solve(int A, int B) {
        int sum = A + B ; 
        return sum ; 
    }
}


Q2

Problem Description

Given two numbers A & B. Return their product.


Problem Constraints

1 <= A <= 104

1 <= B <= 104
  
  import java.util.Scanner; 
public class Solution {
    public static void main(String args[]){
        int x ;
        int y ; 
        int multiply ;  
        Scanner scn = new Scanner(System.in); 
        x = scn.nextInt();
        y = scn.nextInt(); 
        multiply = solve(x, y); 
        System.out.println(multiply);
    }
    public static int solve(int A, int B) {
        int sum = A * B ; 
        return sum ; 
    }
}


Q3

Problem Description

Given a number A. Return square of the number.


Problem Constraints

1 <= A <= 104



  
  import java.util.Scanner; 
public class Solution {
    public static void main(String args[]){
        int x ;
        int square ;  
        Scanner scn = new Scanner(System.in); 
        x = scn.nextInt();
        square = solve(x); 
        System.out.println(square);
    }
    public static int solve(int A) {
        int sum = A*A; 
        return sum ; 
    }
}


Q4

Problem Description

Given two integers A and B, where A is divisible by B.

Print the value of quotient, when A is divided by B.
  
  import java.util.* ; 
class Solution {
    static int divide(int A , int B)
    {
        int result = A / B ; 
        // System.out.println(result);
        return result ; 
    }
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in); 
        int A = scn.nextInt(); 
        int B = scn.nextInt(); 

        divide(A,B); 
    }
}

Q5

You are given an integer A.

You have to find the value of cube of A i.e, A3.
  
  import java.util.*; 
class Solution {
   static int cube(int A){
        int result = A*A*A; 
        return result ; 
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in); 
        int A = scn.nextInt(); 

        cube(A); 
    }
}


