package currencyDenomination;

public class MergeSort {

	void merge(int arr[], int left, int mid, int right) {
		// Find Sizes of Two Sub Arrays to be Merged
		int n1 = mid - left + 1;
		int n2 = right - mid;

		/* Create Temporary Arrays */
		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];

		/* Copy Data to Temporary Arrays */
		for (int i = 0; i < n1; ++i)
			leftArray[i] = arr[left + i];
		for (int j = 0; j < n2; ++j)
			rightArray[j] = arr[mid + 1 + j];

		/* Merge the Temporary Arrays */

		// Initial Indexes of First and Second Sub-arrays
		int i = 0, j = 0;

		// Initial Index of Merged Sub-array array
		int k = left;
		while (i < n1 && j < n2) {
			if (leftArray[i] >= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}

		/* Copy Remaining Elements of L[] if any */
		while (i < n1) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}

		/* Copy Remaining Elements of R[] if any */
		while (j < n2) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}

	// Main function that sorts array[left...right] using merge()
	public void sort(int[] notes, int left, int right) {
		if (left < right) {
			// Find the Middle Point
			int mid = (left + right) / 2;

			// Sort First and Second Halves
			sort(notes, left, mid);
			sort(notes, mid + 1, right);

			// Merge the Sorted Halves
			merge(notes, left, mid, right);
		}
	}
}