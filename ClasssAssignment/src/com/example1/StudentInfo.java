
package com.example1;


import java.util.Scanner;

public class StudentInfo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner in = new Scanner(System.in);
		
		System.out.println("pls enter your fulltname:"); 
		               String fulltname = in.nextLine();
		
	    System.out.println("pls enter your Student age:");  	
		       int age = in.nextInt();
		       
	    System.out.println("pls enter your Student Salary:"); 
		        double salary =in.nextDouble();
		        
		System.out.println("enter your Student bonus:"); 		
		        double bonus = in.nextDouble();
		        
		        
		        double total_salary = salary + bonus;
		
		System.out.println("student Full Name: " + fulltname);
		System.out.println("Student Ae:" + age);
		System.out.println("Student Bonus: " + bonus);
		System.out.println("Student Salary: " + salary);
		System.out.println("Student Total Salary:" + total_salary);
	}

}