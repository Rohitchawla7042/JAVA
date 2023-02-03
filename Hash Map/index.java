class Main {
	 public static void main(String args[]){
		 HashMap<String , Integer> map = new HashMap<>(); 
		 map.put("Delhi" , 10); 
		 map.put("Mumbai" , 70);
		 map.put("UP" , 90);
		 System.out.println(map); 
		 
		 for (String x :map.keySet()) // keySet is the size of the string - collection of the strings 
		 {
			 System.out.println(x + " --> " + map.get(x) ); 
			// System.out.println(map.get(x)); 
		 }
		 System.out.println(map.get("Delhi")); // it will tell us the value of delhi 
		  System.out.println(map.containsKey("Delhi")); // it will tell us whether the string has delhi or not
		  
		  System.out.println(map.size()); 
		  
		  map.put("Agra" , 90);
		  
		  System.out.println(map); 
		  
		 
	 }
 }
 
//  Hash Map 

 
 
//   count the frequency of the element 
 class Main{
	 public static void main(String args[]){
		 int arr[] = {2, 3, 4, 5, 7, 9, 10, 2, 4, 10, 11};
		 HashMap<Integer, Integer> map = new HashMap<>();
		 for(int i = 0 ; i < arr.length ; i++)
		{
			 if(map.containsKey(arr[i]) == true)
			 {
				 int old_freq = 1; 
				 map.put(arr[i] , old_freq+1);
			 }
			 else{
				 map.put(arr[i] , 1); 
			 }
		}
		 System.out.print(map); 
	 }
 }

  class Main 
  {
	 public static void main(String args[]){
		 HashMap<String, Integer> map = new HashMap<>(); 
map.put("vishal", 10); 
map.put("sachin", 30); 
map.put("vaibhav", 20); 
System.out.println(map.get("sachin"));
	 }
  }
   */ 
  
  class Main 
  {
	  public static void main(String args[])
	  {
		int[] arr = {2, 4, 5, 11, 4, 9, 6, 1, 9, 11, 5, 4, 2};
		//ans = 2 4 5 11 9 6 1
		
		HashSet<Integer> unique = new HashSet<>();
		
		for(int val : arr)
		{
			System.out.print(val + " ");
			unique.add(val);
		}
		System.out.println();
		System.out.println(unique);
		
		//count of unique elements in array
		System.out.println(unique.size());  
	}
  }
  
