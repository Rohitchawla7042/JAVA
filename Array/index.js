//  Array    
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in); 
        int T = scn.nextInt();  // nu of test cases 
        int n = scn.nextInt() ; //size of array 
        int even_count = 0 ; 
        int odd_count = 0 ; 
        int A[] = new int [n+1]; 
		while (T > 0)
		{	
        for(int i = 0 ; i < n ; i++)
		{
            A[i] =  scn.nextInt(); 

            if(A[i] % 2 == 0)
			{
                even_count++; 
            }
        }
		T-- ; 
		}
        // System.out.println(even_count); 
		// T-- ; .

        
    }
}

*/
class Main {

    public static void main(String args[]) {

         int[]arr = {10,20,30};

         arr = new int[3];

         int ans = arr[0] * arr[1];

         System.out.println(ans);

     }

}
