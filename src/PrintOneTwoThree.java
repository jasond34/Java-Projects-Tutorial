import java.util.*;
import java.util.Arrays;
import java.util.Arrays.*;

/*
 * Given an array of numbers, the task is to print 
 * only those numbers which have only 1, 2 and 3 as their digits.
 * 
 * 

public class PrintOneTwoThree {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int[] x=new int[5];
		System.out.println("Enter 5 integers: ");
		for(int i=0; i<x.length;i++) {
			x[i]=s.nextInt();
            boolean temp=recursion(x[i]);
            if(temp==true) {
            	System.out.print(x[i]);
            }
            else {
            	System.out.print("Nope, does not contain 1, 2 or 3.");
            }
		}	
	}
	
	public static boolean recursion(int y) {
	    if(y > 0 && y%10==1 || y%10==2 || y%10==3) {
	        return true;
	    } 
	    else if (y <= 0) {
	        return false;
	    }

	    return recursion(y / 10);
		
	}
	
}
*Easier method by converting to string and using the
*contains() method
*
*
*/

public class PrintOneTwoThree {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int[] x=new int[5];
		System.out.println("Enter 5 integers: ");
		for(int i=0; i<x.length;i++) {
			x[i]=s.nextInt();
			String y=Integer.toString(x[i]);
			if(y.contains("1")||y.contains("3")||y.contains("2")) {
				System.out.println(y);
			}
			else {
				System.out.print("Nope, does not contain 1, 2 or 3.");
			}
		}

	}
	}
