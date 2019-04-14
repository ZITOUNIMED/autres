package com.example.utils;

import com.example.exception.ListPartitionUtilsException;

import org.apache.commons.lang.ArrayUtils;

public class ListPartitionUtils{

	public static int[][] partition(int[] liste, int taille) {
		if(ArrayUtils.isEmpty(liste) || taille>liste.length || taille <= 0) {
			throw new ListPartitionUtilsException();
		}
		
		int matrixLength = liste.length/taille + (liste.length%taille>0 ? 1 : 0);
		int[][] res = new int[matrixLength][];
		for(int i = 0; i<matrixLength; i++) {
			int subListLength = (i == (matrixLength - 1)? liste.length - taille * i : taille);
			res[i]=new int[subListLength];
			for(int j = 0; j<subListLength; j++) {
				res[i][j]=liste[i * taille + j];
			}
		}
		return res;
	}
}
