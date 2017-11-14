package io.github.icaromagnago.insertionsort;

import org.junit.Test;
import static org.junit.Assert.*;

public class InsertionSortTest {
	private static int[] sortedArray = {1,2,3,4,5,6,7,8,9};
	
	@Test
	public void sortRandomArray() {
		int[] array = {4,3,1,6,2,5,7,8,9};
		InsertionSort.sort(array);
		
		assertArrayEquals(sortedArray, array);
	}
	
	@Test
	public void sortArrayBestCase() {
		int[] array = {1,2,3,4,5,6,7,8,9};
		InsertionSort.sort(array);
		
		assertArrayEquals(sortedArray, array);
	}
	
	@Test
	public void sortArrayWorstCase() {
		int[] array = {9,8,7,6,5,4,3,2,1};
		InsertionSort.sort(array);
		
		assertArrayEquals(sortedArray, array);
	}

}
