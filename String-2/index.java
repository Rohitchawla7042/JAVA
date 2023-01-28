//  Strings 2 
	class Main {
		
		static boolean palindrome(String str){
			String rev = ""; 
			for(int i = str.length() -1 ; i >=0 ; i--){
				char ch = str.charAt(i); 
				rev += ch; 
			}
			return rev.equals(str); 
		}
		public static void main(String args[]){
			
		}
	}


  
//   A-Z = 65 -90
//   a-z = 92 - 122
//   Q2 - convert uppercase to lower case 
  class Main{
	  
	  static String lower_case(String str)
	  {
		  String ans = ""; 
		  for(int i = 0 ; i<str.length(); i++){
			  char ch = str.charAt(i); 
			  char lower = (char)(ch +32) ;
			  ans += lower ;  
		  }
		  return ans ; 
	  }
	  public static void main(String args[])
	  {
		  Scanner scn = new Scanner(System.in); 
		  String str = scn.nextLine();
		  String res = lower_case(str); 
		  System.out.println(res); 
	  }
  }
*/
 
//   lowercase is present 
  class Main {
	  static int vowels(String str)
	  {
		  int vowel = 0 ; 
		  int n = str.length(); 
		  for(int i = 0 ; i < n; i++)
		  {
			  char ch = str.charAt(i); 
			  if(ch=='a' || ch=='e' || ch =='i' || ch=='o' || ch=='u')
			  {
				  vowel++; 
			  }
			//   return vowel ; 
		  }
		  return vowel;  
		  
	  }
	  public static void main(String args[]){
		  Scanner scn = new Scanner(System.in); 
		  String str = scn.nextLine(); 
		  int ans = vowels(str); 
		  int consonats = str.length()-ans; 
		  
		  System.out.println("The nu of vowels are " + ans); 
		  System.out.println("The nu of consonats are " + consonats); 
		  
	  }
  }
	

	Q given a str and replace all the occurences of that character

class Main {
	static String replace(String str , char x){
		String ans = ""; 
		for(int i = 0 ; i < str.length(); i++){
			char ch = str.charAt(i); 
			if(x==ch){
				ans +='$';
			}
			else{
				ans +=ch; 
			}
		}
		return ans ; 
	}
	
	
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in); 
		String s1 = scn.nextLine(); 
		String s2 = scn.next(); 
		char x = s2.charAt(0); 
		String ans = replace(s1 , x); 
		System.out.println(ans); 
		
	}
}
