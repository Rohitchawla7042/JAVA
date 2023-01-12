// Array 2 - > 
/*
// Q1 Count frequency 
import java.util.* ; 
class Main {
	static int search(int A[] , int k){
		int count = 0 ; 
		for(int i = 0 ; i < A.length ; i++){
			if(A[i] == k){
				count++;
			}
		}
		return count ; 
	}
	
	public static void main (String args[]){
		Scanner scn = new Scanner(System.in); 
		int n = scn.nextInt(); 
		int arr[] = new int[n]; 
		for(int i = 0 ; i <arr.length; i++){
			arr[i] = scn.nextInt(); 
		}
		int k = scn.nextInt(); 
		int ans = search(arr, k); 
		System.out.println(ans); 		
		
	}
}


Q 2 Max marks in the subjects 
import java.util.*; 
class Main{
	static int solve(int A[]){
		int max = A[0];
		for(int i = 1 ; i < A.length ; i++){
			if(A[i] > max){
				max = A[i]; 
			}
		} 
		return max ; 
		
		
	}
		
	
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in); 
		int n = scn.nextInt(); 
		int A[] = new int[n]; 
		for(int i = 0 ; i <A.length ; i++){
			A[i] = scn.nextInt(); 
		}
		int marks = solve(A); 
		System.out.println(marks); 
		
	}
}

*/
// A[i] - A[i+1] = k ; 

import java.util.*; 
class Main{
	static boolean adjacent(int A[] , int k ){
		for(int i = 0 ; i < A.length-1 ; i++){   // this means that we are stopping the code at second last bit 
			if(A[i] - A[i+1] == k){
				return true ; 
			}
		}
		return false ;
	}	
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in); 
		int n = scn.nextInt(); 
		int arr[] = new int [n]; 
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = scn.nextInt(); 
		}		
		int k = scn.nextInt(); 
		boolean ans = adjacent(arr, k); 
		System.out.println(ans); 
	}
}
