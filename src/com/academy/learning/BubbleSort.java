package com.academy.learning;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] array = new int[] { 2, -30, 21, 4, 4, 42, 20, 13, 556 };
		int pendingIndex = array.length - 1;
		for (int j = 0; j < pendingIndex; j++) {
			for (int i = 0; i < pendingIndex; i++) {
				
				if (array[i] > array[i+1]) {
				swapElements(array, i, i + 1);
				}

			}
			pendingIndex--;
		}
		System.out.println(Arrays.toString(array));

	}

	private static void swapElements(int[] array, int i, int j) {
		if (i == j) {
			return;
		}
		
			int temp = array[i];
			array[i] =  array[j];
			array[j] = temp;
		

	}

}
