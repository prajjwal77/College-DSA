package DSAPrep;

import java.util.Scanner;



public class ArrayOperations {
	 public static void main(String[] args) {
	        int[] arr = new int[50]; // Initial array size, can be adjusted
	        int size = 0; // Current number of elements in the array
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the size of an array and less than or equal 50 :");
	        size = scanner.nextInt();
	        
	        System.out.println("Enter Element into the array :");
	        for(int i=0;i<size;i++) {
	        	arr[i] = scanner.nextInt();
	        }

	        while (true) {
	            System.out.println("\nArray Operations:");
	            System.out.println("1. Insert at Beginning");
	            System.out.println("2. Insert at End");
	            System.out.println("3. Insert at Specific Position");
	            System.out.println("4. Delete from Beginning");
	            System.out.println("5. Delete from End");
	            System.out.println("6. Delete from Specific Position");
	            System.out.println("7. Display Array");
	            System.out.println("8. Exit");

	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    if (size < arr.length) {
	                        System.out.print("Enter element to insert: ");
	                        int element = scanner.nextInt();
	                        for (int i = size; i > 0; i--) {
	                            arr[i] = arr[i - 1];
	                        }
	                        arr[0] = element;
	                        size++;
	                    } else {
	                        System.out.println("Array is full.");
	                    }
	                    break;
	                case 2:
	                    if (size < arr.length) {
	                        System.out.print("Enter element to insert: ");
	                        int element = scanner.nextInt();
	                        arr[size] = element;
	                        size++;
	                    } else {
	                        System.out.println("Array is full.");
	                    }
	                    break;
	                case 3:
	                    System.out.print("Enter element to insert: ");
	                    int element = scanner.nextInt();
	                    System.out.print("Enter position: ");
	                    int position = scanner.nextInt();
	                    if (position >= 0 && position <= size && size < arr.length) {
	                        for (int i = size; i > position; i--) {
	                            arr[i] = arr[i - 1];
	                        }
	                        arr[position] = element;
	                        size++;
	                    } else if (size >= arr.length){
	                        System.out.println("Array is full.");
	                    } else {
	                        System.out.println("Invalid position.");
	                    }
	                    break;
	                case 4:
	                    if (size > 0) {
	                        for (int i = 0; i < size - 1; i++) {
	                            arr[i] = arr[i + 1];
	                        }
	                        size--;
	                    } else {
	                        System.out.println("Array is empty.");
	                    }
	                    break;
	                case 5:
	                    if (size > 0) {
	                        size--;
	                    } else {
	                        System.out.println("Array is empty.");
	                    }
	                    break;
	                case 6:
	                    System.out.print("Enter position to delete: ");
	                    int position1 = scanner.nextInt();
	                    if (size > 0 && position1 >= 0 && position1 < size) {
	                        for (int i = position1; i < size - 1; i++) {
	                            arr[i] = arr[i + 1];
	                        }
	                        size--;
	                    } else {
	                        System.out.println(size == 0 ? "Array is empty." : "Invalid position.");
	                    }
	                    break;
	                case 7:
	                    if (size == 0) {
	                        System.out.println("Array is empty.");
	                    } else {
	                        System.out.print("Array: ");
	                        for (int i = 0; i < size; i++) {
	                            System.out.print(arr[i] + " ");
	                        }
	                        System.out.println();
	                    }
	                    break;
	                case 8:
	                    System.out.println("Exiting...");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
}
