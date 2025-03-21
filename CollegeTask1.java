package DSAPrep;

import java.util.Arrays;
import java.util.Scanner;

// Task-1
/*
 * arr = [3,4,5,7,8,9,10]
 * o/p = [3,7,12,19,28,38]
 */
public class CollegeTask1 {
	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the array element :");
		n = scanner.nextInt();
		int arr[] = new int[n];

		System.out.println("Enter the array element : ");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		int k =0;
		System.out.println("After operation of array : ");
		for (int i = 0; i < n; i++) {
			if(i == 0) {
				arr[k] = arr[i];
			}
			else {
				arr[k] += arr[i-1];
			}
			k++;
		}
		
	System.out.println(Arrays.toString(arr));
		scanner.close();
	}
}
