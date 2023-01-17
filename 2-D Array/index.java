//  2-D Array 


// synatx = 

// int arr[][] = new int [][] 

import java.util.* ; 
/*
class Main {
	public static void main (String args[]){
		Scanner scn = new Scanner (System.in); 
		// int arr[][] = new int [][];
int n = scn.nextInt(); 
int m = scn.nextInt(); 
int arr[][] = new int [n][m];

for(int i = 0 ; i < n ; i++){
	for(int j = 0 ; j < m ; j++){
		arr[i][j] = scn.nextInt(); 
	}
}
for(int i = 0 ; i < n ; i++)
{
	for(int j = 0 ; j < m ; j++)
	{
		System.out.print(arr[i][j] + " "); 
	}
	System.out.println(); 
	
}
	}
}

*/


// Q2 - > WAP to convert the Array from rows into cols . 
class Main {
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in); 
		int n = scn.nextInt();
		int m = scn.nextInt(); 
		int mat[][] = new int [n][m]; 
		for(int i = 0 ; i < n ; i++)
		{
			for(int j = 0 ; j < m ; j++)
			{
			mat[i][j] = scn.nextInt(); 
			}
		}
		for(int j = 0 ; j < m ; j++){
			for (int i = 0 ; i < n ; i++){
				System.out.print(mat[i][j] + " "); 
			}
			System.out.println(); 
		}
		
		
		for(int i = 0 ; i < n ; i++){
			for(int j = 0 ; j < m ; j++){
				System.out.print(mat[i][j] + " "); 
			}
			System.out.println(); 
		}
		//  snake format 
		for(int j = 0 ; j < m ; j++){
			if(j %2 == 0){
				for(int i = 0 ; i < n ; i++){
					System.out.print(mat[i][j] + " "); 
				}
			}
			else {
				for(int i = n-1 ; i >= 0 ; i--){
					System.out.print(mat[i][j] + " "); 
				}
				// System.out.println(); 
			}
		}
	}
}
