class Main {
	 public static void main(String args[])
	 {
		 Scanner scn = new Scanner(System.in); 
		//   If we write in single quote then it will be a character not nummber 
		//  char ch = '9' ; 
		//  System.out.println(ch); 
		//  int x = 'a' + 'b'; 
		//  System.out.println(x);
		 
		//  How can we find the value at the index 
		// str.charAt() //  in bracket we have to write the index number 
		
		// String str = "Hello World"; 
		// System.out.println(str.charAt(2)); 
		
		//  Note - > We can not change the any particular value at any index 
		
		// Q1 we have to count the upper case characters 
		
		String str = scn.next(); 
		System.out.println(str.length()); 
		int count = 0 ; 
		for(int i = 0 ; i < str.length() ; i++)
		{
			char ch = str.charAt(i); 
			if(ch>='A' && ch<='Z'){
				count++; 
			}
			
		}
		System.out.println("The Upper case character are in the " + str + " are " +  count); 
		
		
		scn.next will only take the input till space 
		scn.nextLine() will help us to take the whole line as input 
		
		Anything with the string will considerd as concatination 
		 
	 }
 }
 
  */ 
//   Q given a string and reverse the string and print it 
  class Main{
	  
	 static String reverse(String str){
		  String rev = "" ; 
		  for(int i = str.length() -1  ; i >= 0 ; i--){
			  char ch = str.charAt(i); 
			  rev  = rev + ch ; 
			  
		  }
		  return rev ; 
	  }
	  
	  
	  public static void main(String args[]) {
		  Scanner scn = new Scanner(System.in); 
		//   String str = scn.nextLine(); 
		//   for(int i = 0 ; i < str.length() ; i++){
		// 	  char ch = str.charAt(i); 
		//   }
		
		  String str = scn.nextLine(); 
		  String ans = reverse(str); 
		  System.out.println(ans); 
		  
	  }
  }
