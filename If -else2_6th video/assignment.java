// Q1 
    
    int number = scn.nextInt(); 
    if(number > 0){
        System.out.println(1); 
    }
    else if(number < 0){
        System.out.println(-1); 
    }
    else{
        System.out.println(0);
    }
   Q 2

int n = scn.nextInt();
if(n ==1)
System.out.println(31);
else if(n ==2)
System.out.println(28);
else if(n ==3)
System.out.println(30);
else if(n ==4)
System.out.println(30);
else if(n ==5)
System.out.println(31);
else if(n ==6)
System.out.println(30);
else if(n ==7)
System.out.println(31);
else if(n ==8)
System.out.println(31);
else if(n ==9)
System.out.println(30);
else if(n ==10)
System.out.println(31);
else if(n ==11)
System.out.println(30);
else if(n ==12)
System.out.println(31);
      
    //   Q3 
      
      int A = scn.nextInt();
      int B = scn.nextInt();
      int C = scn.nextInt();
      int D = scn.nextInt();
      int E = scn.nextInt();
      int toatl_marks = A + B + C + D + E ; 
      float percentage =((float)toatl_marks / 500) * 100;
      int per = (int)percentage;
      System.out.println(per);
    //   System.out.println(toatl_marks);
    //   System.out.println(percentage);
      if(percentage >= 90)
      System.out.print("A");
      else if(percentage >= 80)
      System.out.println("B"); 
      else if(percentage >= 70)
      System.out.println("C"); 
      else if(percentage >= 60)
      System.out.println("D"); 
      else if(percentage >= 40)
      System.out.println("E"); 
      else
      System.out.println("F");
      
     
    //   Q4 
      int side_a = scn.nextInt(); 
      int side_b = scn.nextInt(); 
      int side_c = scn.nextInt(); 
      
      if(side_a == side_b && side_b == side_c){
          System.out.println("Equilateral "); 
      }
      else if(side_a == side_b || side_b == side_c || side_a == side_c){
          System.out.println("Isocloses");
      }
      else{
          System.out.println("Scalene");
      }
      
       
       
    //    Q5 
       
       int n1 = scn.nextInt();
       int n2 = scn.nextInt(); 
       int n3 = scn.nextInt(); 
       if(n1 >= n2 && n2 >= n3 ){
           System.out.println(n1 + " ");
       }
       else if(n2 >= n1 && n2 >= n3) {
           System.out.print(n2);
       }
       else
       System.out.println(n3);

//  Q 6 
 
 int a = scn.nextInt(); 
    if (a % 3 == 0 && a % 5 == 0){
        System.out.println("Fizzbuzz"); 
    }
    else if(a%3==0){
        System.out.println("Fizz"); 
    }
    else if(a % 5==0){
        System.out.println("Buzz");
    }

//        int horses = 10;

// int camels = 5;

// if(horses < 5)

// {

// System.out.println("TOWN");

// }

// else if(horses >=5)

// System.out.print("FOREST ");

// System.out.println("AMAZON");

// else

// System.out.println("UNKNOWN");

int temperature = 33;

if(temperature < 0)

System.out.println("Freezing");

else if(temperature < 30)

System.out.println("Pleasant");

else if(temperature < 50)

System.out.println("Hot");

else

System.out.println("Boiling");

if(a<=0)

{

if(a==0){

System.out.println("1 ");

}

else{

System.out.println("2 ");

}

}

System.out.println("3 ");

boolean male = false;

int age = 30;

if( male )

if( age < 20 )

System.out.println("Boy");

else

System.out.println("Man");

else

if( age < 20 )

System.out.println("Girl");

else

System.out.println("Woman");



