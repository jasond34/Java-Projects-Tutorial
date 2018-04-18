import java.util.*;
/*
 * 
 * Given an odd number in the form of string, 
 * the task is to make largest even number possible 
 * from the given number provided one is allowed to do 
 * only one swap operation, if no such number is possible 
 * then print the input string itself.
 * 
 */
public class OddtoEven {
	public static void main(String[] arg) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Integer: ");
        String x=s.nextLine();
        boolean odd=false;
        int[] array= new int[x.length()];

         for(int i=0; i<array.length;i++) {
        	 array[i]=Integer.parseInt(x);
        	 
         }

         //if there are no even numbers
         for(int i=0;i<array.length;i++) {
        	 if(array[i]%2==0) {
        		 odd=true;
        	 }
         }         
	    if(odd=false) {
	    	System.out.print(x);
	    }
	    else {
	    	
	    }
	}
}
