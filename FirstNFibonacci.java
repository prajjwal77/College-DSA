package DSAPrep;

import java.util.Arrays;
import java.util.Scanner;

public class FirstNFibonacci {
	
	    // Function to return list containing first n fibonacci numbers.
	    public static int[] fibonacciNumbers(int n) {
	        // Your code here
	        int first = 0, second = 1;
	        if(n ==0){
	           return new int[0];
	        }
	        int[] fib = new int [n];
	        if(n >= 1){
	         fib[0] = 0;   
	        }
	        if(n >=2){
	            fib[1] = 1;
	        }
	        for(int i=2; i<n; i++){
	            fib[i] = fib[i-1] + fib[i-2];
	        }
	        return fib;
	    }
	    public static void main(String[] args) {
			int n;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a number :");
			n = scanner.nextInt();
			System.out.println("Fibonacci series : "+ Arrays.toString(fibonacciNumbers(n)) );
		}
	 
}
