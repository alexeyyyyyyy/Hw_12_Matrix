package telran.matrix.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import telran.matrix.utils.Matrix;

class MatrixTets {
	int[][] matrix1 = {{1,2,3}}; // 1x3
	int[][] matrix2 = {{1}, {2} , {3}}; 
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testSum() {
		assertEquals(6 , Matrix.sum(matrix1));
		assertEquals(6, Matrix.sum(matrix2));
	}

	@Test
	void testTransp() {
		 int[][] matrix1 = {{1, 2, 3}};
	     int[][] matrix2 = {{1}, {2}, {3}};
		assertArrayEquals(matrix2, Matrix.transponted(matrix1));
	}
}
