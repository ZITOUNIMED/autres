package com.example;

import java.util.function.Function;

import com.example.utils.ListPartitionUtils;

public class ListPartitionUtilsApplication {

	public static void main(String[] args) {
		printMatrix(ListPartitionUtils.partition(new int[] {1, 2, 3, 4}, 2));
		printMatrix(ListPartitionUtils.partition(new int[] {1, 2, 3, 4, 5}, 2));
		printMatrix(ListPartitionUtils.partition(new int[] {1}, 1));
		printMatrix(ListPartitionUtils.partition(new int[] {1, 2, 3}, 2));
		printMatrix(ListPartitionUtils.partition(new int[] {1, 2, 3, 4, 5}, 3));
		printMatrix(ListPartitionUtils.partition(new int[] {1, 2, 3}, 1));
	}
	
	public static void printMatrix(int[][] matrix) {
		Function<int[], String> arrayToString = (int[] list) -> {
			StringBuilder builder = new StringBuilder("");
			builder.append('[');
			for (int i = 0; i < list.length; i++) {
				if(i != 0) {
					builder.append(", ");
				}
				builder.append(list[i]);
			}
			builder.append(']');
			return builder.toString();
		};
		Function<int[][], String> matrixToString = (int[][] mat) -> {
			StringBuilder builder = new StringBuilder("");
			builder.append('[');
			for (int i = 0; i < mat.length; i++) {
				if(i != 0) {
					builder.append(", ");
				}
				builder.append(arrayToString.apply(mat[i]));
			}
			builder.append(']');
			return builder.toString();
		};
		
		
		System.out.println(matrixToString.apply(matrix));
	}

}
