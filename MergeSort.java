package DSAPrep;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
	public static void mergeSort(int arr[], int left, int right) {
		if(left<right) {
			int mid = left + (right - left)/2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid+1, right);
			
			merge(arr, left, mid, right);
		}
	}
  
     // Merges two subarrays of a[]
    public static void merge(int a[], int l, int m, int r)
    {

          int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = a[l + i];

          for (int j = 0; j < n2; ++j)
            R[j] = a[m + 1 + j];

        // Merge the temp arrays
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                a[k] = L[i];
                i++;
            }
            else {
                a[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            a[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            a[k] = R[j];
            j++;
            k++;
        }
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
		mergeSort(arr, 0, arr.length-1);
		System.out.print("Sorted Array : ");
		System.out.println(Arrays.toString(arr));
	}
}
