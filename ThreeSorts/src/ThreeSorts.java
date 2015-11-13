
import java.util.*;

public class ThreeSorts {

	public static void main(String[] args) {

		int test[] = {9, 7, 3, 6, 1, 2, 5, 4, 8, 11, 15, 0};
		bubbleSort(test);
		System.out.println(Arrays.toString(test));
		System.out.println(Arrays.toString(bubbleSort(test)));
		System.out.println(Arrays.toString(insertionSort(test)));
		System.out.println(Arrays.toString(selectionSort(test)));

	}

	public static int[] bubbleSort(int[] array) {

		//sort without modifying test array
		int[] sorted = array.clone();

		for(int count = 0; count < sorted.length - 1; count++) {

			for(int index = sorted.length - 1; index > count; index--) {

				if(sorted[index] < sorted[index - 1]) {

					int temp = sorted[index - 1];
					sorted[index - 1] = sorted[index];
					sorted[index] = temp;

				}

			}

		}

		return sorted;

	}


	public static int[] insertionSort(int[] array) {

		int[] sorted = array.clone();
		/*
		for(int i = 1; i < sorted.length; i++) {

			int insert = sorted[i];

			int compare = i - 1;

			while(compare >= 0) {

				if(sorted[compare] > insert) {

					sorted[compare + 1] = sorted[compare];

				}

				compare--;

			}

			sorted[compare + 1] = insert;

		}

		 */

		for(int first = 1; first < sorted.length; first++) {

			int insert = sorted[first];

			int i;
			for(i = first - 1; i >= 0 && sorted[i] > insert; i--) {

				sorted[i + 1] = sorted[i];

			}

			sorted[i + 1] = insert;

		}

		return sorted;
	}

	public static int[] selectionSort(int[] array) {

		int[] sorted = array.clone();

		for(int first = 0; first < sorted.length - 1; first++) {

			int smallestIndex = first;

			for(int i = first + 1; i < sorted.length; i++) {

				if(sorted[i] < sorted[smallestIndex]) {

					smallestIndex = i;

				}

			}

			int temp = sorted[first];
			sorted[first] = sorted[smallestIndex];
			sorted[smallestIndex] = temp;

		}

		return sorted;

	}


}
