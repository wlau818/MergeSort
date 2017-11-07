import static org.junit.Assert.*;

import org.junit.Test;

public class MergeSorterTest {

	@Test
	public void testMerge() {
		int[] array = {1, 3, 4, 6, 2, 5, 7, 8};
		MergeSorter.mergeSort(array, 0, 7);
		assertTrue(array[0] == 1 && array[1] == 2 && array[2] == 3 && array[3] == 4
				&& array[4] == 5 && array[5] == 6 && array[7] == 8 );
	}

}
