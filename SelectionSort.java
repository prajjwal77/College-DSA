package DSAPrep;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
	public static void selectionSort(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			int minIndex = i;
			for(int j=i+1;j<n;j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp =arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		 // Time Complexity: O(n^2) (all cases)
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
		selectionSort(arr);
		System.out.print("Sorted Array : ");
		System.out.println(Arrays.toString(arr));
		
	}
}
