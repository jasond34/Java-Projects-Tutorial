import java.util.*;
import java.util.Arrays;
/*
 * Given an input stream of n integers the task is 
 * to insert integers to stream and print the median 
 * of the new stream formed by each insertion of x 
 * to the stream.
 */
public class StreamMedian {
	public static void main(String[] args){
	    Scanner s = new Scanner(System.in); 
	    System.out.print("Enter a integer for number of streams: ");
	    int n=s.nextInt();
	    int[] x=new int[n];
	    for(int i=0;i<n;i++) {
	        System.out.println("Enter a integer: ");
	        x[i]=s.nextInt();
	        if(i==0) { //first input number
	            System.out.println(x[i]+" goes to stream --> Median is: "+x[i]);
	        }
	        else if(i==1) {   //when i =1, it is technically second input 
	            System.out.println(x[i]+" goes to stream --> Median is: "+(float)(x[i]+x[0])/2);
	        }
	        else if(i>=2 && i%2==0) {  //3rd input so # of inputs is odd        
	            Arrays.sort(x);
	            System.out.println(x[i]+" goes to stream --> Median is: "+x[i/2]);
	        }
	        else if(i>=3 && i%2!=0) {  //when # of input is more than 3 and even
	            Arrays.sort(x);
	            int j=i/2;
	            float med=(x[j]+x[j-1])/2;
	            System.out.println(x[i]+" goes to stream --> Median is: "+med);
	        }
	 }
	}
}
