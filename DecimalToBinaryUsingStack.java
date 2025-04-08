package DSAPrep;

import java.util.Scanner;

class Stack1 {
	private int maxSize;
	private int[] stackArray;
	private int top;

	// Constructor to initialize the stack
	public Stack1(int size) {
		maxSize = size;
		stackArray = new int[maxSize];
		top = -1;
	}
	// Method to check if the stack is full
		public boolean isFull() {
			return (top == maxSize - 1);
		}

	// Method to push an element onto the stack
		public void push(int value) {
			if (isFull()) {
				System.out.println("Stack Overflow! Cannot push " + value);
			} else {
				stackArray[++top] = value;
				//System.out.println(value + " pushed to stack");
			}
		}
		
		public void display() {
			for(int i = top ; i>=0;i--) {
				System.out.print(+stackArray[i]+" ");
			}
		}
}

public class DecimalToBinaryUsingStack {
	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number to convert into binary : ");
		n = scanner.nextInt();
		Stack1 stack1 =  new Stack1(n);
		int rem =0;
		int m = n; 
		while(n!=0) {
			rem = n%2;
			stack1.push(rem);
			n/=2;
		}
		
		System.out.print("Binary of "+ m + " = ");
		stack1.display();
	}
}
