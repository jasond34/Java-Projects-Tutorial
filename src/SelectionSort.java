import java.util.Arrays;
import java.util.*;
/*
 * 
 * 
 * Selection Sort
 * 
 */

class SelectionSort {
	 public static void main(String[] arg) {
		int[] x= {23,54,76,32,12,45,32,56,87,90};
		int temp=0;
		
		for(int i=0;i<x.length;i++) {
			for(int j=0; j<x.length;j++) {
				if(x[i]<x[j]) {     //  < for descending order
					                //  > for Ascending order
					temp=x[j];
					x[j]=x[i];
					x[i]=temp;
                    
				}
				
			}
		}
		System.out.println(Arrays.toString(x));
		 
				 
	 }
}
