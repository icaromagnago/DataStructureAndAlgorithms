package io.github.icaromagnago.insertionsort;

public class InsertionSort {

	public static void sort(int[] array) {
		int len = array.length;
		for(int i=1; i<len; i++) {
			int current = array[i];
			int j = i-1;
			while(j>=0 && array[j] > current) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = current;
		}
	}
}
