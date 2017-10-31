
public class MergeSorter {
	
	public static void mergeSort(int[] list, int lo, int hi) {
		if (lo < hi) {
			int mid  = (lo + hi) / 2;
			mergeSort(list, lo, mid);
			mergeSort(list, mid + 1, hi );
			merge(list, lo, mid, hi);
		}
		
		/*
		 * This function implements the merge sort algorithm on the integer array 'list'
		 * from index lo to index hi.
		 */
	}
	
	public static void merge(int[] list, int lo, int mid, int hi) {
		int[] num = new int[list.length + 1];
		System.arraycopy(list, 0, num, 0, list.length);
		int i = lo;
		int j = mid + 1;
		int k = lo;
		while (i <= mid && j <= hi) {
			if (num[i] < num[j]) {
				list[k] = num[i];
				i ++;
			} else {
				list[k] = num[j];
				j ++;
			}
			k ++;
		}
		while (i <= mid) {
			list[k] = num[i];
			k++;
			i++;
		}
		
		/*
		 * This method should merge the two subarrays from lo to mid, and
		 * from mid + 1 to hi into a new sorted array that overwrites
		 * the entries in list from lo to hi.
		 */
	}
	
}
