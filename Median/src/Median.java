
import java.util.*;

/**
 * Quicksort code obtained originally 
 * <a href = "https://www.utdallas.edu/~dheroy/4331code/book/QuickSort.java">here</a>
 * 
 * @author William Yang
 *
 */
public class Median {

	public static void main(String[] args) {

		int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
		int[] list2 = {1, 3, 5, 7, 0, 1, -4, 5, 7, 100, -10, 11, -500, -100};
		
		System.out.println(quickSort(list));
		System.out.println(quickSort(list2));
		
	}
	
	public static double quickSort(int[] list) {
		
		return quickSort(list, 0, list.length - 1);
		
	}
	
	public static double quickSort(int[] list, int first, int last) {
		
		if(last > first) {
			
			int pivotIndex = partition(list, first, last);
			
			int medianIndex = list.length / 2;
			
			//odd number of elements case
			if(list.length % 2 != 0) {
				
				//after partitioning, the pivot is already sorted in place
				if(pivotIndex == medianIndex) {
					
					return list[pivotIndex];
					
				}
				
			} else { //even number of elements case
				
				if(pivotIndex == medianIndex) {
					
					/*if(medianIndex == first) {
						
						return list[pivotIndex];
						
					} else {*/
					
					System.out.print(pivotIndex + " ");
						System.out.println(list[pivotIndex] + " ");
						
						return (list[pivotIndex] + quickSort(list, first, pivotIndex - 1)) / 2.0;
						
					//}
					
				} else {
					
				if(pivotIndex == medianIndex - 1) {
					
					//System.out.println(pivotIndex + " " + list[pivotIndex]);
					
					return (list[medianIndex - 1] + quickSort(list, medianIndex, last)) / 2.0;
					
				}
					
				}
				
			}
			
			return ((medianIndex > pivotIndex) ? quickSort(list, pivotIndex + 1, last)
					: quickSort(list, first, pivotIndex - 1));
			
	
		} else {
			
			System.out.println(list[first]);
			return list[first];
			
		}
		
	}
	
	public static int partition(int[] list, int first, int last) {
		
		int pivot = list[first];
		int low = first + 1;
		int high = last;
		
		while(high > low) {
			
			while(low <= high && list[low] <= pivot) {
				
				low++;
				
			}
			
			while(low <= high && list[high] > pivot) {
				
				high--;
				
			}
			
			if(high > low) {
				
				int temp = list[high];
				list[high] = list[low];
				list[low] = temp;
				
			}
			
		}
		
		while(high > first && list[high] >= pivot) {
			
			high--;
			
		}
		
		if(pivot > list[high]) {
			
			list[first] = list[high];
			list[high] = pivot;
			
			System.out.println(Arrays.toString(list));
			
			return high;
			
		} else {
			
			System.out.println(Arrays.toString(list));
			
			return first;
			
		}
		
		
	}

}
