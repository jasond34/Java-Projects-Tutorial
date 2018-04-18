import java.util.*;
/*
 * Input any number. Find the sum of the digits of
 *  the number using a recursive function.
 */
class SumOfDigitsUsingRecursion {
	
	 public static void main(String[] arg) {
		 
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter any integer: ");
	     int x=s.nextInt();
	     int y=recursion(x);
	     int sum=0;
	     sum+=y;
		 System.out.println("The Sum of the digits is: "+ sum);
		 
	 }	 
		 
	public static int recursion(int y) {
      if(y/10>=1) {
    	  int tempvar =y%10;
    	  int remain=y/10;
    	  recursion(remain); 
    	  return tempvar;
      }
      else {
    	  return y;
      }
      
	}
		 		 
		 
	 
}
