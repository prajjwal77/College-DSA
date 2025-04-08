package DSAPrep;

import java.util.Scanner;

class Student{
	String name, course, section;
	int rollNo, sub1, sub2, sub3, sub4,sub5;
	
}
public class Students {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("ENter Student name : ");
		student.name = scanner.nextLine();
		
		System.out.println("Enter your course : ");
		student.course = scanner.nextLine();
		
		System.out.println("Enter your section : ");
		student.section = scanner.nextLine();	
		
		System.out.println("Enter your Roll No : ");
		student.rollNo = scanner.nextInt();
		
		System.out.println("Enter your sub1 mark :");
		student.sub1 = scanner.nextInt();
		
		System.out.println("Enter your sub2 mark :");
		student.sub2 = scanner.nextInt();
		
		System.out.println("Enter your sub3 mark :");
		student.sub3 = scanner.nextInt();
		
		System.out.println("Enter your sub4 mark :");
		student.sub4 = scanner.nextInt();
		
		System.out.println("Enter your sub5 mark :");
		student.sub5 = scanner.nextInt();
		
		System.out.println("Student Details :");
		System.out.println("Name : "+student.name+" Roll No.: "+ student.rollNo + " Course : "+ student.course +
				" Sub1 : "+ student.sub1+ " Sub2 : "+ student.sub2+ "  Sub3 : "+ student.sub3 +"Sub4 : "+ student.sub4 +
				" Sub5 : "+ student.sub5);
		
		
		
	}
}
