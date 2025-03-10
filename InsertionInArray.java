package DSAPrep;

import java.util.Scanner;

public class InsertionInArray {
	public static void printArr(int arr[]) {
		for(int  i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	//insertion in array 
	//1st method 
	public static void insertBasic(int arr[], int element, int index) {
		if(index < 0 || index > arr.length) {
			System.out.println("Invalid Index");
			return ;
		}
		
		if(index == arr.length) {
			System.out.println("Cannot insert at the end of fixed size Array");
			return;
		}
		for(int i = arr.length-2 ; i >= index ; i--) {
			arr[i+1] = arr[i];
		}
		arr[index] = element;
	}
	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		size = scanner.nextInt();
		int arr[] = new int[size];
		for(int i=0 ; i<size ; i++) {
			 arr[i] = scanner.nextInt();
		}
		System.out.println("Array elements: ");
		printArr(arr);
		System.out.println();
		System.out.println("Enter the element you want to enter :");
		int element = scanner.nextInt();
		System.out.println("Enter the index where you want to enter but not at last index :");
		int index = scanner.nextInt();
		insertBasic(arr, element, index);
		System.out.println("After Insertion");
		printArr(arr);
	}
}
