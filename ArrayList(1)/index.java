 Array list - >  the size in array list is dynamic 

ArrayList <Interger> al = new ArrayList <>() ; 
// how can we add the values 

al.add(10);  // here 10 is the value which we are trying to add 
al.add(); 
// al.size(); This will tell the size of your ArrayList 

//  get elements 

al.get(1) // here 1 is the index value , not the value at the index 


//  update elements ,how can we update the ArrayList  

al.set(2 , 50) //here 2 is the index and 50 is the value which we want to update that means 50 will come to the 2nd index 



//  how can we remove the elements from the ArrayList 

al.remove(2) ; // here 2 is the index , delete the element which is at 2nd index 


class Main {
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>(); 
// al.add(10); 
// al.add(30); 
// al.add(70); 
// System.out.println(al); 
// System.out.println(al.size());

// System.out.println(al.get(2));

// for(int i = 0 ; i < al.size() ; i++){
// 	System.out.print(al.get(i) + " "); 
// }

// int n = scn.nextInt(); 
// for(int i = 0 ; i < n ; i++){
// 	int val = scn.nextInt(); 
// 	al.add(val); 
// }
// System.out.println(al); 

// for(int i= 0 ; i < al.size(); i++){
// 	int element = al.get(i); 
// 	if(element %2==0){
// 		System.out.println(element + " "); 
// 	}
// }
// al.add(2 , 100); 
// System.out.println(al + " ");




	}
}


 
 Q element divisible by 5 and 7 
 
 class Main {
	 
	 static ArrayList<Integer> solve (ArrayList<Integer> List) 
	 {
		 ArrayList<Integer> ans = new ArrayList<>(); 
		 for(int i = 0 ; i < List.size(); i++)
		 {
			 int element = List.get(i);
			 if(element % 5 == 0 && element % 7 == 0){
				 ans.add(element); 
				 
				//  System.out.println(element + " "); 
			 } 
		 }
		 return ans ; 
	 }
	 
	 
	 
	 public static void main (String args[])
	 {
		 ArrayList<Integer> al = new ArrayList<>(); 
		 al.add(10); 
		 al.add(80); 
		 al.add(90); 
		 al.add(40); 
		 al.add(70); 
		 al.add(35); 
		 
		 ArrayList<Integer> res = solve(al); 
		 System.out.println(res); 
		 
	 }
 }

 */ 
 
//   2D ArrayList

//  row sum questions 

class Main{
	
	static ArrayList<Integer>solve (ArrayList<ArrayList<Integer>>List){
		ArrayList<Integer> ans = new ArrayList<>(); 
		
		for(int i = 0 ; i < List.size() ; i++){
			int sum = 0 ; 
			for(int j = 0 ; j < List.get(i).size() ; j++)
			{
				sum += List.get(i).get(j); 
			}
			ans.add(sum); 
		}
		return ans ; 
		
	}
	
	
	
	
	public static void main(String args[]){
		ArrayList<Integer>ls = new ArrayList<>(); 
		ls.add(10); 
		ls.add(20); 
		ls.add(40); 
		ArrayList<Integer>ls1 = new ArrayList<>(); 
		ls1.add(70); 
		ls1.add(90); 
		ls1.add(80); 
		ArrayList<ArrayList<Integer>> al = new ArrayList<>(); 
		al.add(ls) ; 
		al.add(ls1) ; 
		
		ArrayList<Integer>res = solve(al); 
		System.out.println(res);  
		
		
		
	}
}
