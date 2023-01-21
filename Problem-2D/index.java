 Q1 write a func that returns a matrix A + B ; 
class Main {
	
	
	static int[][] solve(int A[][] , int B[][]){
		int mat[][] = new int[A.length][A[0].length]; 
		for(int i = 0 ; i < A.length ; i++){
			// int sum = 0 ; 
			for(int j = 0 ; j < A[0].length; j++){
				mat[i][j] = A[i][j] + B[i][j]; 
			}
			// mat[][] = sum ; 
		}
		return mat ; 
	}
	
	
	
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in); 
		int n = scn.nextInt(); 
		int m = scn.nextInt(); 
		int sum[][] = new int [n][m]; 
		int A[][] = new int[n][m]; 
		int B[][] = new int[n][m]; 
		
		for(int i = 0 ; i < n ; i++){
			for(int j = 0 ; j < m ; j++){
				A[i][j] = scn.nextInt(); 
				// B[i][j] = scn.nextInt(); 	
			}
		}
		for(int i = 0 ; i < n ; i++){
			for(int j = 0 ; j < m ; j++){
				// A[i][j] = scn.nextInt(); 
				B[i][j] = scn.nextInt(); 	
			}
	
		
		// int sum[][] = solve(A,B);
		// System.out.println(sum); 
		int sum[][] = solve(A,B);
		System.out.println(sum);
		
	}
}


// Q2 function to write the multiplication of the 2 matrix 

class Main {
	static int[][] solve(int A[][] , int B[][]){
		int mat[][] = new int[A.length][A[0].length]; 
		int r1 = A.length ; 
		int r2 = B.length ; 
		int c1 = A[0].length ; 
		int c2 = B[0].length ; 
		for(int i = 0 ; i < r1 ; i++){
			int sum = 0 ; 
			for(int j = 0  ; j < c2 ; j++){
				if(c1 == r2){
					mat[][] = sum + (A[][] * B[][]); 
				}
			}
		}
		return mat ; 
	}
}


import java.util.* ; 
class Main {
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in); 
		int r1 , r2, c1, c2, sum , i , j; 
		 r1 = scn.nextInt(); // rows of 1st matrix ;
		 c1 = scn.nextInt(); // cols of 1st matrix
		 r2 = scn.nextInt(); 
		 c2 = scn.nextInt(); 
		
		if(c1 == r2)
		{
			int mat1[][] = new int[r1][c1]; 
			int mat2[][] = new int[r2][c2]; 
			int res[][] = new int[r1][c2]; 
			for(i = 0 ; i < r1 ; i ++)
			for(j = 0 ; j < c2 ; j++){   //elements of 1st matrix 
				mat1[i][j] = scn.nextInt(); 
			}
			for(i = 0 ; i < r1 ; i ++)
			for(j = 0 ; j < c2 ; j++){ // elements of 2nd matrix ; 
				mat2[i][j] = scn.nextInt(); 
			}
			System.out.println("============== OUTPUT ================="); 
			
			for(i = 0 ; i < r1 ; i++)
				for(j = 0 ;j < c2 ; j++)
				{
					sum = 0 ; 
				for(int k = 0 ; k < r2 ; k++)
				{
					sum += mat1[i][j] * mat2[i][j] ; 
				}
			
				res[i][j] = sum ; 
			}
			for(i = 0 ; i < r1 ; i++){
				for(j = 0 ; j < c2 ; j++){
					System.out.print(res[i][j] + " "); 
				}
				System.out.println(); 
			}		
			
		}
		else {
			System.out.println("XXXXXXXXXXXXXXXX  Not Possible XXXXXXXXXXXXXXX"); 
		}
		
	}
}

*/ 
// Do transpose of the matrix 

class Main {
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in); 
		// int A[][] = new int[][]; 
		int n = scn.nextInt();   
		int m = scn.nextInt(); 
		// int A[][] = new int[m][n]; 
		// int transpose[][] = new int[n][m]; 
		int A[][] = new int[n][m]; 
		int ans[][] = new int[m][n]; 
		
		for(int i = 0 ;i < m ; i++){
			for(int j = 0 ; j < n ; j++){
				ans[i][j] = A[j][i]; 
			}
			// System.out.print(transpose); 
		}
		System.out.println(ans); 
	}
	
}
