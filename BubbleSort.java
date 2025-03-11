package DSAPrep;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
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
		bubbleSort(arr);
		System.out.print("Sorted Array : ");
		System.out.println(Arrays.toString(arr));
		
	}
}
