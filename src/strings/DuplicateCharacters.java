import java.util.Scanner;

/*
 *Common elements between 2 arrays
 *
 */
public class DuplicateCharacters {
	public static void main(String[] args){
		//you can take user input as a string
         int[] x= {145,3,45,6,7,894,56,2};  //pretend this is user input
         int[] y= {4,3,45,6,34,56,76,34};     //user input

		 
		 for(int i=0;i<x.length;i++) {
		    for(int j=0;j<y.length;j++) {
		    	if(x[i]==y[j]) {
		    		System.out.print(x[i]+" ");
		    		break;
		    	}
		    }
		 }
		 
	 }

}
