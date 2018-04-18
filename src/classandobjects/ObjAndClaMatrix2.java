/*
 * Add two Matrices and print
The Matrix class has methods for each of the following:
1 - get the number of rows
2 - get the number of columns
3 - set the elements of the matrix at given position (i,j)
4 - adding two matrices. If the matrices are not addable, "Matrices cannot be added" will be displayed.
5 - multiplying the two matrices
 */
class MatrixTwo{
	int row, col;
	void getRows(int x) {
		row=x;
	}
	void getCols(int x) {
		col=x;
	}
	void set(int z[]) {
		int pointer=0;
		int[][] matrix=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				matrix[i][j]=z[pointer];
				pointer++;
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
	void add(int x[], int y[]) {
		if(x.length!=y.length) {
			System.out.println("The two Matrices cannot be added");
		}
		else {
			int j=0;
		for(int i=0;i<x.length;i++) {   //adding the two arrays
			  x[i]=x[i]+y[j];            //and putting it to array x
              j++;
			}
           set(x);
		}
	}
	
	void multiply(int x[], int y[]) {   //right now x[i] is all 10s
		int j=0;
		for(int i=0;i<x.length;i++) {   
			  x[i]=x[i]*y[j];            
              j++;
			}
             set(x);
	}
}


public class ObjAndClaMatrix2 {
	public static void main(String[] args){
		int[] x= {1,2,3,4,5,6,7,8,9};
		int[] y= {9,8,7,6,5,4,3,2,1};
		MatrixTwo something=new MatrixTwo();
	    something.getRows(3);
	    something.getCols(3);
	    something.set(x);
	    MatrixTwo something2=new MatrixTwo();
	    System.out.println(" ");
	    something2.getRows(3);
	    something2.getCols(3);
	    something2.set(y);
	    something.add(x, y);
	    something.multiply(x,y);
	    
	}
}
