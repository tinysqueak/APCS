
/**
 * Quicksort code obtained originally 
 * <a href = "https://www.utdallas.edu/~dheroy/4331code/book/QuickSort.java">here</a>
 * 
 * @author William Yang
 *
 */
public class Median {

	public static void main(String[] args) {

		//test arrays
		int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
		int[] list2 = {1, 3, 5, 7, 0, 1, -4, 5, 7, 100, -10, 11, -500, -100};
		int[] list3 = {2, 3, 1, 5, 6, 1, -2, 4, 14, 12, -5, -10};

		System.out.println(quickSort(list));
		System.out.println(quickSort(list2));
		System.out.println(quickSort(list3));

	}

	/**
	 * Invokes the overloaded <code>quickSort</code> method, passing 0 for the first index 
	 * and <code>list.length - 1</code> for the last index
	 * @param list The <code>int[]</code> to pass to the overloaded method
	 * @return The median of the list as a <code>double</code>
	 */
	public static double quickSort(int[] list) {

		return quickSort(list, 0, list.length - 1);

	}

	/**
	 * Uses the algorithm for quickSort to find the median of the <code>int[]</code>. First partitions
	 * the list by passing it into the <code>partition</code> method, then determines the index of the
	 * median and compares this with the index of the pivot to determine which section of the array to
	 * recurse into next.
	 * 
	 * @param list The <code>int[]</code> on which to find the median/quickSort
	 * @param first The starting index of the array on which to sort
	 * @param last The last index of the array on which to sort 
	 * @return The median of the list as a <code>double</code>
	 */
	public static double quickSort(int[] list, int first, int last) {

		if(last > first) {

			int pivotIndex = partition(list, first, last);

			int medianIndex = list.length / 2;

			//odd number of elements case
			if(list.length % 2 != 0) {

				//after partitioning, the pivot is already sorted in place
				//so if the pivot's index is equal to the median index, than the 
				//pivot value is the median for an odd number of elements
				if(pivotIndex == medianIndex) {

					//can really use either pivotIndex or medianIndex here
					return list[pivotIndex];

				}

			} else { //even number of elements case

				//the pivot index is the right index of the two middle indices for the even number of elements case
				if(pivotIndex == medianIndex) {

					//returns the value at pivotIndex and
					//continue recursing into the upper bottom half of the array to obtain the other (left) middle element
					//divides by two to average the two middle elements
					return (list[pivotIndex] + quickSort(list, first, pivotIndex - 1)) / 2.0;

				} else {

				//the pivot index is the left index of the two middle indices for the even number of elements case
				if(pivotIndex == medianIndex - 1) {

					//returns the value at pivotIndex and
					//continue recursing into the upper bottom half of the array to obtain the other (left) middle element
					//divides by two to average the two middle elements
					return (list[pivotIndex] + quickSort(list, medianIndex, last)) / 2.0;

				}
				
				}

			}

			//recurses into the upper part or lower part of the array based on if
			//medianIndex > pivotIndex or not
			return ((medianIndex > pivotIndex) ? quickSort(list, pivotIndex + 1, last)
					: quickSort(list, first, pivotIndex - 1));

		} else {

			//if the last index is not greater than the first index (1 element), return that element
			return list[first];

		}

	}

	/**
	 * Partitions a section of the array. Places all the elements less than the pivot (the 
	 * first element) to the left of the pivot's proper index and all the elements greater
	 * than the pivot to right of the pivot's index. Places the pivot in its proper index
	 * after partitioning the rest of the array.
	 * @param list The <code>int[]</code> to partition.
	 * @param first The beginning index at which to partition from
	 * @param last The end index on which to partition
	 * @return The index of the pivot, which is in its proper sorted position after partitioning
	 */
	public static int partition(int[] list, int first, int last) {

		//value of the pivot is the first element in the section of the array to be considered
		int pivot = list[first];
		
		//comparison indices, low starts from the element immediately after the pivot
		//high starts at the last index
		int low = first + 1;
		int high = last;

		//while the indices have not crossed over each yet, keep checking for elements that are
		//not on the proper side of the array
		while(high > low) {

			//increase low until list[low] is greater than or equal to the pivot value
			while(low <= high && list[low] <= pivot) {

				low++;

			}

			//decrease high until list[high] is less than the pivot value
			while(low <= high && list[high] > pivot) {

				high--;

			}

			//only swaps the elements if the high index is greater than the low index
			if(high > low) {

				int temp = list[high];
				list[high] = list[low];
				list[low] = temp;

			}

		}

		//continues decrementing high until high is less list[high] is less than the pivot value
		//high indicates the proper index of the pivot
		while(high > first && list[high] >= pivot) {

			high--;

		}

		//if pivot is greater than list[high], swap the elements and return the new index of the pivot (high)
		if(pivot > list[high]) {

			list[first] = list[high];
			list[high] = pivot;
			return high;

		//if pivot is not swapped, return its original index
		//since the pivot was taken to be the first element, this is first
		} else {

			return first;

		}

	}

}
