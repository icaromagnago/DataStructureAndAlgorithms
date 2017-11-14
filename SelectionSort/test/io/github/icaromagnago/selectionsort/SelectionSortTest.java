package io.github.icaromagnago.selectionsort;

import static org.junit.Assert.*;

import org.junit.Test;

public class SelectionSortTest {

	private static int[] sortedArray = {1,2,3,4,5,6,7,8,9};
	
	@Test
	public void sortRandomArray() {
		int[] array = {4,3,1,6,2,5,7,8,9};
		SelectionSort.sort(array);
		
		assertArrayEquals(sortedArray, array);
	}
	
	@Test
	public void sortArrayBestCase() {
		int[] array = {1,2,3,4,5,6,7,8,9};
		SelectionSort.sort(array);
		
		assertArrayEquals(sortedArray, array);
	}
	
	@Test
	public void sortArrayWorstCase() {
		int[] array = {9,8,7,6,5,4,3,2,1};
		SelectionSort.sort(array);
		
		assertArrayEquals(sortedArray, array);
	}

}
