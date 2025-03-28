package DynamicProgramming;

import java.util.Scanner;

public class FibonacciSeries {
	public static int fibo(int n) {
		int fibSeries[] = new int[n + 1];
		for (int i = 0; i < n; i++) {
			fibSeries[i] = -1;
		}
		return fibHelper(n, fibSeries);
	}

	public static int fibHelper(int n, int[] fibSeries) {
		if (n == 0 || n == 1) {
			return n;
		}
		
		int x = fibHelper(n-1, fibSeries);
		int y = fibHelper(n-2, fibSeries);

		fibSeries[n] = x+y;
		
		return fibSeries[n];
	}

	public static int fib(int n) {
		int a = 0, b = 1, c = 0;
		if (n == 0) {
			return 0;
		}
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Top-Down Approach");
		System.out.println("Enter any number to know the fibo. nth element : ");
		int n = scanner.nextInt();

		System.out.println("Fibo. num : " + fib(n));
		
		System.out.println("Bottom-Up Approach");
		
		System.out.println("Fib : "+ fibo(n));
		
	}
}
