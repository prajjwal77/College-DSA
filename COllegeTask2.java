package DSAPrep;

import java.util.Scanner;
/*
 * Task - 2
 * arr =[1,2,2,3,3,4,5]
 * output =[1,2,3,4,5]
 */
public class COllegeTask2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n = scanner.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the array element of an array in sorted order : ");
		for(int i=0;i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		int k=0;
		System.out.println("Array after deleting duplicate element : ");
		for(int i=1;i<n;i++) {
			if(arr[i] != arr[k]) {
				k++;
				arr[k] = arr[i];
				
			}
		}
		
		for(int i=0;i<=k;i++) {
			System.out.println(arr[i] + " ");
		}
		
		scanner.close();
	}
}
