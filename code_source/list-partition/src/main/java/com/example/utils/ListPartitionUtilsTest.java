package com.example.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.exception.ListPartitionUtilsException;

public class ListPartitionUtilsTest {

	@Test
	public void should_split_an_even_list() {
		int[][] matrix = ListPartitionUtils.partition(new int[]{1, 2, 3, 4}, 2);
		int[][] expected = new int[2][];
		expected[0] = new int[] {1, 2};
		expected[1] = new int[] {3, 4};
		
		assertArrayEquals("should split an even list: ", expected, matrix);
	}
	
	@Test
	public void should_split_an_odd_list() {
		int[][] matrix = ListPartitionUtils.partition(new int[]{1, 2, 3, 4, 5}, 2);
		int[][] expected = new int[3][];
		expected[0] = new int[] {1, 2};
		expected[1] = new int[] {3, 4};
		expected[2] = new int[] {5};
		
		assertArrayEquals("should split an odd list: ", expected, matrix);
	}
	
	@Test(expected=ListPartitionUtilsException.class)
	public void should_throw_runtimeException_when_taille_bigger_than_list_length() {
		ListPartitionUtils.partition(new int[]{1, 2}, 3);
	}
	
	@Test(expected=ListPartitionUtilsException.class)
	public void should_throw_runtimeException_when_taille_is_zero() {
		ListPartitionUtils.partition(new int[]{1, 2}, 0);
	}
	
	@Test(expected=ListPartitionUtilsException.class)
	public void should_throw_runtimeException_when_list_is_empty() {
		ListPartitionUtils.partition(new int[]{}, 2);
	}
	
	@Test(expected=ListPartitionUtilsException.class)
	public void should_throw_runtimeException_when_list_is_null() {
		ListPartitionUtils.partition(new int[]{}, 2);
	}

}
