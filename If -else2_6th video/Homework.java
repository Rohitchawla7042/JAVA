// Homework 

// Q1 

int marks = scn.nextInt(); 

if( marks >= 50 && marks <= 80){
    System.out.println("PASS B"); 
} 
else if(marks >=81 && marks <=100){
    System.out.println("PASS A"); 
}
else {
    System.out.println("FAIL"); 
}



// Q2 

int month = scn.nextInt(); 

if(month ==1)
System.out.println("January");
else if(month ==2)
System.out.println("February");
else if(month ==3)
System.out.println("March");
else if(month ==4)
System.out.println("April");
else if(month ==5)
System.out.println("May");
else if(month ==6)
System.out.println("June");
else if(month ==7)
System.out.println("July");
else if(month ==8)
System.out.println("August");
else if(month ==9)
System.out.println("September");
else if(month ==10)
System.out.println("October");
else if(month ==11)
System.out.println("November");
else if(month ==12)
System.out.println("December");


// Q3

int side_a = scn.nextInt();
int side_b = scn.nextInt(); 
int side_c = scn.nextInt(); 

int total_area = side_a + side_b + side_c ; 

if(total_area == 180){
    System.out.println(1);
}   
else{
    System.out.println(0);
}


// Q 4 

int n1 = scn.nextInt();
       int n2 = scn.nextInt(); 
       int n3 = scn.nextInt(); 
       if(n1 <= n2 && n2 <= n3 ){
           System.out.println(n1);
       }
       else if(n2 <= n1 && n2 <= n3) {
           System.out.print(n2);
       }
       else
       System.out.println(n3);


// Q5 

int n = scn.nextInt(); 
int sum ; 
// int m = scn.nextInt(); 
if(n >= 10 && n <= 20){
    // System.out.println("Please enter m value");
    int m = scn.nextInt();
    sum = n + m ; 
    System.out.println(sum);
    
    if(sum >= 100){
        System.out.println("That is a large sum!"); 
    }    
}
else{
    System.out.println(-1);
}

int marks = 80;

if( marks > 70 ){

System.out.print("Distinction ");

System.out.print("Congratulations ");

}else if( marks > 35 ){

System.out.print("Pass ");

}else



System.out.print("Fail ");

System.out.println("Better luck next time");

int score = 80;

if (score >= 90) grade = "A";

if (score >= 80) grade = "B";

if (score >= 70) grade = "C";

if (score >= 60) grade = "D";

else grade = "E";


Q9 
int x = 15;

if(x > 10){

x++;

if(x == 16){

System.out.println("UPDATED");

}else if(x == 15){

System.out.println("NO CHANGE");

}

}else{

System.out.println("YES");

}



// Q10 

int rating = scn.nextInt(); 
        if(rating >= 2100){
            if(rating % 2 == 0){
                System.out.println("GRAND MASTER");
            }
            else{
                System.out.println("grand master");
            }
        }
        else if(rating >= 1900){
            if(rating % 2 == 0){
                System.out.println("CANDIDATE MASTER");
            }
            else{
                System.out.println("candidate master");
            }
        }
        else if(rating >= 1600){
            if(rating % 2 == 0){
                System.out.println("EXPERT");
            }
            else{
                System.out.println("expert");
            }
        }
        else if(rating >=1400){
            if(rating % 2 == 0){
                System.out.println("PUPIL");
            }
            else{
                System.out.println("pupil");
            }
        }
            else if(rating < 1400){
                if(rating % 2 == 0){
                System.out.println("NEWBIE");
            }
            else{
                System.out.println("newbie");
            }
        }
	}


}

*/
