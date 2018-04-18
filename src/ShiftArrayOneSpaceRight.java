import java.util.Arrays;
import java.util.*;

/*
 * Asks user to put in 10 integers
 * Write a program to shift every element of an array to circularly right. E.g.-
INPUT : 1 2 3 4 5
OUTPUT : 5 1 2 3 4
 * 
 */
class ShiftArrayOneSpaceRight {
      
	   public static void main(String[] arg) {
       Scanner s=new Scanner(System.in);
        int[] x=new int[10];
        int[] y=new int[x.length];
       System.out.println("Enter "+x.length+" integers: ");
		   for(int i=0;i<x.length;i++) {
			   x[i]=s.nextInt();
		   }
		   for(int i=0;i<x.length;i++) {    //setting the boundaries
			 y[i]=x[i];	
			 
		   if(i==0) {
			   x[i]=x[y.length-1];
			   }
			   else if(i==y.length-1){     //setting boundaries
				   x[x.length-1]=y[y.length-2];
			   }
			   else if(i>=1) {
				   x[i]=y[i-1];
			   }
		   }
		   System.out.println(Arrays.toString(x));
		   
}
}