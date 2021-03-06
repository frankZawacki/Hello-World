package sorting;

public class SortingExample {
	
	public static void swap(int a, int b) {
		int temp;
		temp = a;
		a = b;
		b = temp;
	}
	 
	public static void main(String[] args) {
		int[] a = new int[5];
		int n = a.length;
		for (int i = 0; i < n; i++) {
		    // Track number of elements swapped during a single array traversal
		    int numberOfSwaps = 0;
		    
		    for (int j = 0; j < n - 1; j++) {
		        // Swap adjacent elements if they are in decreasing order
		        if (a[j] > a[j + 1]) {
		            swap(a[j], a[j + 1]);
		            numberOfSwaps++;
		        }
		    }
		    
		    // If no elements were swapped during a traversal, array is sorted
		    if (numberOfSwaps == 0) {
		        break;
		    }
		}
	}

}
