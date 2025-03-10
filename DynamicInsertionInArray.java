package DSAPrep;

import java.util.Arrays;



class DynamicArray {
	private int[] arr;
	private int size;
	private int capacity;

	public DynamicArray() {
		capacity = 10;
		arr = new int[capacity];
		size = 0;
	}

	public void insert(int element) {

		if (size == capacity) {
			resize();
		} 
		arr[size++] = element;
	}

	public void insert(int element, int index) {
		if (index < 0 || index > size) {
			System.out.println("Invalid Index");
			return;
		}
		if (size == capacity) {
			resize();
		}
		for (int i = size; i > index; i--) {
			arr[i] = arr[i - 1];
		}
		arr[index] = element;
		size++;
	}

	public void delete(int index) {
		if (index < 0 || index >= size) {
			System.out.println("Invalid Index");
			return;
		}
		for (int i = index; i < size; i++) {
			arr[i] = arr[i + 1];
		}
		size--;
	}

	public int search(int element) {
		for (int i = 0; i < size; i++) {
			if (arr[i] == element) {
				return i;
			}
		}
		return -1;
	}

	public void print() {
		System.out.print("[");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i]);
			if (i < size - 1) {
				System.out.print(",");
			}
		}
		System.out.print("]");
	}

	private void resize() {
		capacity *= 2;
		arr = Arrays.copyOf(arr, capacity);
	}
	
	public void reverseArray(int[] arr) {
		int left = 0;
		int right = arr.length-1;
		
		while(left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}
}

public class DynamicInsertionInArray {
	public static void main(String[] args) {
		DynamicArray dynamicArray = new DynamicArray();
		dynamicArray.insert(22);
		dynamicArray.insert(32);
		dynamicArray.insert(42);
		dynamicArray.insert(52);
		dynamicArray.insert(62);
		dynamicArray.insert(72);
		
		dynamicArray.print();
		System.out.println();
		dynamicArray.insert(99,4);
		dynamicArray.print();
		
		System.out.println();
		dynamicArray.delete(2);
		dynamicArray.print();
		
				
	}
}
