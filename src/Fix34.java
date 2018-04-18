import java.util.*;
/*
 * 
 * Assumes there is a 4 for every 3 and last entry of array is not a 3
 * 

class Fix34 {
	public static void main(String[] args){
		//Given a array with numbers 3 and 4 in it
		int[] x= {1, 3, 1, 4, 4, 3, 1};
		int temp3=0;
		for(int i=0;i<x.length;i++) {
			if(x[i]==3) { 
                 for(int j=i;j<x.length;j++) {
                	 if(x[j]==4) {
                		 temp3=x[i+1];
                		 x[i+1]=x[j];  
                		 x[j]=temp3;

                	 }
                 }
				
                 System.out.print(" "+x[i]);
				
			}
			else {
				System.out.print(" "+x[i]);
			}
		
		}

		
		
		
	}
}
*/

class Fix34 {
	public int[] fix34(int[] nums) {
		int t=0;
		for(int i=0; i< nums.length ; i++)
		for(int j=0;j<nums.length ; j++)

		if(nums[i]==4 && nums[j]==3)
		{
		t=nums[j+1];
		nums[j+1]=nums[i];
		nums[i]=t;
		}
		return nums;
		}
	

}