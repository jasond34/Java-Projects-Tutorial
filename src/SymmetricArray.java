import java.util.*;
import java.util.Arrays;
/*
 * Hint
 * a[i][j] = a[j][i]
 */
class SymmetricArray {
	public static void main(String[] arg) {
		
	int[][] x= {{1,2,3},{4,5,6},{7,8,9}};
	boolean y=true;
	for(int i=0;i<x.length;i++) {
		for(int j=0;j<x[i].length;j++) {
			if(x[i][j] == x[j][i]) {
				y=true;
			}
			else {
				y=false;
			}
		}
	}
	if(y==true) {
     System.out.println(Arrays.deepToString(x));  //use deepToString to print 2D array 
	}
		
	}
}
