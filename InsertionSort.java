package DSAPrep;

import java.util.Arrays;
import java.util.Scanner;
//function code 
public class InsertionSort {
	public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        // Time Complexity: O(n^2) (worst and average), O(n) (best)
        // Space Complexity: O(1)
    }
	public static void main(String[] args) {
		int size;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an Array : ");
		size = scan.nextInt();
		
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.print("Before Sorting : ");
		System.out.println(Arrays.toString(arr));
		insertionSort(arr);
		System.out.print("Sorted Array : ");
		System.out.println(Arrays.toString(arr));

	}
}
