import java.util.Scanner;

/*
 * Have user enter any integer
 * output the sum of the integers using recurion
 * 
public class SumDigitUsingRecursion {
	 public static void main(String[] arg) {
	     Scanner s = new Scanner(System.in);
	     System.out.println("Enter a integer: ");
	     int x = s.nextInt();
	     System.out.println(recursion(x));
	   }



		   public static int recursion(int x){
		     if((x/10) == 0){ 
		       return x;
		     }
		     else{		    	 
		    	 int y=x/10, z=x%10;
		    	 System.out.println((y)+(z));
		       return recursion(y)+(z);     
		     }
		   }
}*/
public class SumDigitUsingRecursion {
public static void main(String[] arg) {

    Scanner s=new Scanner(System.in);
    System.out.println("Enter any integer: ");
    int sum=0;
    int x=s.nextInt();
    int y=recursion(x, sum);
    System.out.println("The Sum of the digits is: "+ y);

}   

public static int recursion(int y, int sum) {
 if(y/10>=1) {
     int tempvar =y%10;
     int remain=y/10;
     sum+=tempvar;
     if(remain!=0) {
    	 sum = recursion(remain, sum); 
     }
     return sum;     
 }
 else {            
     return sum + y;
 }

}
}