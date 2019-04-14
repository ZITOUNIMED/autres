package com.example;

import java.util.Scanner;

import com.example.utils.ListPartitionUtils;

public class UseListPartitionExampleApplication {

	public static void main(String[] args) {
		System.out.print("Entrer le nombre d'elements de la liste: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if(number>0) {
			System.out.println("Entrer les elements un par un:");
			int[] list = new int[number];
			for(int i = 0; i<number; i++) {
				System.out.print("Element " + (i + 1) + ": ");
				int e = scanner.nextInt();
				list[i] = e;
			}
			System.out.print("Entrer la taille:");
			int taille = scanner.nextInt();
			ListPartitionUtilsApplication.printMatrix(ListPartitionUtils.partition(list, taille));
		}
		scanner.close();
	}

}
