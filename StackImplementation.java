package DSAPrep;

class Stack {
	private int maxSize;
	private int[] stackArray;
	private int top;

	// Constructor to initialize the stack
	public Stack(int size) {
		maxSize = size;
		stackArray = new int[maxSize];
		top = -1;
	}

	// Method to check if the stack is empty
	public boolean isEmpty() {
		return (top == -1);
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
			System.out.println(value + " pushed to stack");
		}
	}

	// Method to pop an element from the stack
	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack Underflow! Cannot pop");
			return -1; // Return -1 or throw an exception for underflow
		} else {
			int value = stackArray[top--];
			System.out.println(value + " popped from stack");
			return value;
		}
	}

}

public class StackImplementation {
	public static void main(String[] args) {
		  Stack stack = new Stack(5);

	        stack.push(10);
	        stack.push(20);
	        stack.push(30);
	        stack.push(40);
	        stack.push(50);
	        stack.push(60); // Trying to push more elements than the stack size

	        stack.pop();
	        stack.pop();
	        stack.pop();
	        stack.pop();
	        stack.pop();
	        stack.pop(); // Trying to pop more elements than the stack has
	}
}
