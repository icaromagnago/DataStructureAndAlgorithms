package io.github.icaromagnago.selectionsort;

public class SelectionSort {

	public static void sort(int[] array) {
		
		for(int i=0; i<array.length-1; i++) {
			int indexMin = i;
			for(int j=i+1; j<array.length; j++) {
				if(array[j] < array[indexMin]) {
					indexMin = j;
					
				}
			}
			
			if(array[i] != array[indexMin]) {
				int aux = array[i];
				array[i] = array[indexMin];
				array[indexMin] = aux;
			}
		}
		
	}

}
