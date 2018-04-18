import java.util.*;
import java.util.Arrays;
/*Sort array first in ascending order
 * Then ask user for nth place
 * then print array value 
 */

public class FIndNthSmallestElement {
	 public static void main(String[] arg) {
		 Scanner s=new Scanner(System.in);
		 int[] x= new int[10];
		 System.out.println("Enter 10 integers: ");
		 for(int i=0;i<x.length;i++) {
			 x[i]=s.nextInt();
		 }
		int temp=0;
		int n=0;
		System.out.println("Enter a value for N. "
				+ "N will find the Nth smallest value from your integer inputs."
				+ "For ex: if N=2, Output: The 2nd smallest value. ");		
		n=s.nextInt();
		for(int i=0;i<x.length;i++) {
			for(int j=0; j<x.length;j++) {
				if(x[i]<x[j]) {     //  < for ascending order
					                //  > for descending order
					temp=x[j];
					x[j]=x[i];
					x[i]=temp;
                   
				}
				
			}
		}
		//System.out.println("Your sorted array is: "+Arrays.toString(x));

		System.out.println("The value is: "+x[n-1]);
	 }
	
	
}
