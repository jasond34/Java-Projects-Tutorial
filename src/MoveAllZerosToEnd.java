import java.util.*;
/*
 * Given an array of random numbers, Push all the zero’s of a given array 
 * to the end of the array. For example, if the given arrays is 
 * {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0},
 *  it should be changed to 
 *  {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}. 
 * 
 * The inefficient method, nested loop
 */
public class MoveAllZerosToEnd {
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	System.out.println("Enter 10 integers: ");
	int[] x=new int[10];
    for(int i=0;i<x.length;i++) {
    	x[i]=s.nextInt();
    }
	int temp=0;
    for(int i=0;i<x.length;i++) {
    	if(x[i]==0) {
            for(int j=i+1;j<x.length;j++) {
            	if(x[j]>x[i]) {
            		temp=x[i];
            		x[i]=x[j];
            		x[j]=temp;
            	}
            }
            System.out.print(x[i]+" ");
    	}
    	else {
    		System.out.print(x[i]+" ");
    	}
    }
	
	}
}

/*
public class MoveAllZerosToEnd {
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	System.out.println("Enter 10 integers: ");
	int[] x=new int[10];
    for(int i=0;i<x.length;i++) {
    	x[i]=s.nextInt();
    }
    
	int temp=0;
    for(int i=0;i<x.length;i++) {

    	
    	
    }
	
	}
}
*/