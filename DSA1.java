package DSAPrep;

import java.util.Scanner;

public class DSA1 {
	
	public static void main(String[] args) {
		int n;
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter any number:");
		n = scanner.nextInt();
		int  original = n;
		int rem =0, sum=0, mul=1, rev=0;
		while(n!=0) {
			rem = n % 10;
			sum += rem;
			mul *= rem;
			rev = (rev * 10)+rem;
			n /=10;
		}
		System.out.println("Sum : "+ sum);
		System.out.println("Mul : "+ mul);
		System.out.println("Reverse : "+ rev);
		if(original == rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
	}
}
