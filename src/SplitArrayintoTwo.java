/*
 * Asks user to input 10 integers, put into array, then divides the 
 * values of first array into two
 */
import java.util.*;

public class SplitArrayintoTwo {
    public static void main(String[] args){
    int[] x= new int[10];
    int[] x1= new int[5],x2=new int[5];
    Scanner s=new Scanner(System.in);
    System.out.println("Enter 10 integers: ");
    for(int i=0;i<x.length;i++) {
    	x[i]=s.nextInt();
    }
  	
    for(int i=0;i<x.length;i++) {
  	  if(i<5) {
  	  x1[i]=x[i];
  	 // System.out.println(x1[i]);                  //this way or
  	  }
  	  else if(i>=5 && i<=9) {
  		  x2[i-x2.length]=x[i];
  		  //System.out.println(x2[i-x2.length]);    //this way or
  	  }

    }
    
   System.out.println(Arrays.toString(x1));       //or this way
    System.out.println(Arrays.toString(x2));    //Array.toString is easier and faster/cleaner
   /*for(int i=5;i<=x.length;i++) {
  	 x2[j]=x[i];
  	 j++;
  	 System.out.println(x2[j]);
   }*/
}
}

/*
 * Another fasterway is to use the System.arraycopy() function
 * Here is the code:
 * 
 *  public static void main(String[] arg){
 *  int[] x={1,2,3,4,5,6,7,8,9,10};
 *  
 *  int[] x1=new int[5];
 *  int[] x2=new int[5];
 *  
 *  System.arraycopy(x, 0, x1, 0, x1.length);
 *  System.arraycopy(x, x1.length, x2, 0, x2.length);
 *  
 *  System.out.println(Arrays.toString(x1));
 *  System.out.println(Arrays.toString(x1));
 *  }
 * 
*/