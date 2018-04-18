/*
 * Create a class called 'Matrix' containing constructor that initializes the number of rows and number of columns of a new Matrix object. The Matrix class has the following information:
1 - number of rows of matrix
2 - number of columns of matrix
3 - elements of matrix in the form of 2D array
 */
class Matrix{
	public Matrix(int x, int y, int z[]){
		int[][] matrix=new int[x][y];
		int pointer=0;  //pointer for z[]
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				matrix[i][j]=z[pointer];
				pointer++;
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
	
}


public class ConstructorMatrix {
	public static void main(String[] args){
		int[] x= {1,2,3,4,5,6,7,8,9};
		Matrix something=new Matrix(3,3,x);  //constructors always get run first when new object gets created 
}
}
