package DSAPrep;

import java.util.LinkedList;

public class StackLinkedList {
	private LinkedList<Integer> list;

    public StackLinkedList() {
        list = new LinkedList<>();
    }
    
    //push operation : add element to the top of the stack
    public void push(int x) {
    	list.addLast(x);
    }
    
    
    // Check if the stack is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
    
    // pop operation: remove and return the top of the element of the stack
    public int pop() {
		if(isEmpty()) {
			throw new IllegalStateException("Stack is empty");
		}
		return list.getLast();
	}
    
    //peek operation: return the top of element of the stack without removing it
    public int peek() {
    	if(isEmpty()) {
    		throw new IllegalStateException("Stack is empty");
    	}
    	return list.getLast();
    }
    public static void main(String[] args) {
    	StackLinkedList stack = new StackLinkedList();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println("Top element: " + stack.peek()); // Output: 30
        
        System.out.println("Popped element: " + stack.pop()); // Output: 30
        System.out.println("Popped element: " + stack.pop()); // Output: 20
        
        stack.push(40);
        
        System.out.println("Top element after push: " + stack.peek()); // Output: 40
	}
}
