
public class secondlargestitem {
	public static void main(String[] args){
	       int[] x= {1,5,8,3,5,6,90,2,4,6,2,94};
	       int largest=0;
	       int second=0;
	       for(int i=0;i<x.length;i++) {
	    	   if(x[i]>largest) {
	    		   largest=x[i];
	    	   }
	       }
	       for(int i=0;i<x.length;i++) {
	    	   if(x[i]>second && x[i]!=largest) {
	    		   second=x[i];
	    	   }
	       }
	       System.out.print(largest+" "+second);
			
	}
}
