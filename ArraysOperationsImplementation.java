package DSAPrep;

import java.util.Scanner;



public class ArraysOperationsImplementation {

	 // Method to calculate average of array elements
    public static double average(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    // Method to insert an element at a specified index in the array
    public static int[] insert(int[] arr, int element, int index) {
        if (index < 0 || index > arr.length) {
            System.out.println("Invalid index for insertion.");
            return arr;
        }
        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = arr[i];
        }
        newArray[index] = element;
        for (int i = index; i < arr.length; i++) {
            newArray[i + 1] = arr[i];
        }
        return newArray;
    }

    // Method to delete an element at a specified index from the array
    public static int[] delete(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index for deletion.");
            return arr;
        }
        int[] newArray = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArray[j++] = arr[i];
            }
        }
        return newArray;
    }

    // Method to search for an element in the array and return its index
    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1; // Element not found
    }
    
    //binary search
    public static int Binarysearch(int[] arr, int target) {
    	int low =0;
    	int high = arr.length-1;
    	while(low<high) {
    		int mid  = low + (high - low) / 2;
    		if(mid == target) {
    			return mid;
    		}
    		else if(mid < target) {
    			low = mid+1;
    		}
    		else {
    			high = mid-1;
    		}
    	}
    	return -1;
    }
    // Method to display the elements of the array
    public static void display(int[] arr) {
        System.out.print("Array elements:");
        for (int num : arr) {
            System.out.print(" " + num);
        }
        System.out.println();
    }

    // Method to reverse the elements of the array
    public static int[] reverse(int[] arr) {
        int[] reversedArray = new int[arr.length];
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            reversedArray[j] = arr[i];
        }
        return reversedArray;
    }

    // Method to merge two arrays
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int index = 0;
        for (int num : arr1) {
            mergedArray[index++] = num;
        }
        for (int num : arr2) {
            mergedArray[index++] = num;
        }
        return mergedArray;
    }
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		    System.out.print("Enter initial size of array: ");
		    int size = scanner.nextInt();

		    int[] arr = new int[size];
		    System.out.println("Enter elements:");
		    for (int i = 0; i < size; i++) {
		        arr[i] = scanner.nextInt();
		    }

		    int choice;
		    do {
		        System.out.println("\nArray Operations Menu:");
		        System.out.println("1. Average");
		        System.out.println("2. Insert");
		        System.out.println("3. Delete");
		        System.out.println("4. Search");
		        System.out.println("5. Display");
		        System.out.println("6. Reverse");
		        System.out.println("7. Merge with another array");
		        System.out.println("0. Exit");
		        System.out.print("Choose operation: ");
		        choice = scanner.nextInt();

		        switch (choice) {
		            case 1:
		                System.out.println("Average: " + ArraysOperationsImplementation.average(arr));
		                break;

		            case 2:
		                System.out.print("Enter element to insert: ");
		                int element = scanner.nextInt();
		                System.out.print("Enter index to insert at: ");
		                int index = scanner.nextInt();
		                arr = ArraysOperationsImplementation.insert(arr, element, index);
		                break;

		            case 3:
		                System.out.print("Enter index to delete: ");
		                int delIndex = scanner.nextInt();
		                arr = ArraysOperationsImplementation.delete(arr, delIndex);
		                break;

		            case 4:
		                System.out.print("Enter element to search: ");
		                int key = scanner.nextInt();
		                int foundIndex = ArraysOperationsImplementation.search(arr, key);
		                if (foundIndex != -1)
		                    System.out.println("Element found at index: " + foundIndex);
		                else
		                    System.out.println("Element not found.");
		                break;

		            case 5:
		                ArraysOperationsImplementation.display(arr);
		                break;

		            case 6:
		                arr = ArraysOperationsImplementation.reverse(arr);
		                System.out.println("Array reversed.");
		                break;

		            case 7:
		                System.out.print("Enter size of second array: ");
		                int size2 = scanner.nextInt();
		                int[] arr2 = new int[size2];
		                System.out.println("Enter elements of second array:");
		                for (int i = 0; i < size2; i++) {
		                    arr2[i] = scanner.nextInt();
		                }
		                arr = ArraysOperationsImplementation.merge(arr, arr2);
		                System.out.println("Arrays merged.");
		                break;

		            case 0:
		                System.out.println("Exiting...");
		                break;

		            default:
		                System.out.println("Invalid choice. Try again.");
		        }

		    } while (choice != 0);

		    scanner.close();
		}
}