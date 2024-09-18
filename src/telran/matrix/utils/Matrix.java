package telran.matrix.utils;

public class Matrix {

	public static int sum(int[][] matrix ) {
		
		int[][] matrix1 = {{1,2,3}};
		int[][] matrix2 = {{1}, {2} ,{3}};
		
		int sum = 0;
		for (int i = 0; i < matrix1[0].length; i++) {
			sum += matrix1[0][i];
		}
	
		sum = 0;
		for (int i = 0; i < matrix2.length; i++) {
			sum += matrix2[i][0];
		}
		System.out.println("Sums of Matrix = " + sum);
		
		return sum;
		
	}

	public static int[][] transponted(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		int[][] transp = new int [cols][rows];
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				transp[j][i] = matrix[i][j];
			}
		}
		
		return transp;
	}

}
