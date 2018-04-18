/*
 * Write a program to check if user input is part of the
 * fibonacci sequence
 */
public class FibonacciCheck {
	public static void main(String[] args){
	     int x=0,y=1,z=0;
	     int input=1093;   //user input, pretend they put this # in
	     //System.out.print(x+" ");
	     //System.out.print(y+" ");
	     if(input ==1 || input ==0) {
	    	 System.out.print(input+" is part of the fibonacci sequence."); 
	     }
	     for(int i=0;i<input;i++) {
	    	 z=x+y;
	    	 //System.out.print(z+" "); 
	    	 if(z==input) {
	    		 System.out.print(input+" is part of the fibonacci sequence.");
	    		 break; 		
	    	 }
	    	 else if(z>input){
	    		 System.out.print(input+" is not part of the fibonacci sequence.");
	    		 break;
	    	 }
	    	 x=y;
	    	 y=z;
	    	 
	     }
		}
}
