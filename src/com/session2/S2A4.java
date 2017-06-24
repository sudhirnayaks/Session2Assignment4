package com.session2;

import java.util.Scanner;

public class S2A4 {
private static Scanner sc;
	
//	A student has A grade if marks are more than 70 (marks > 60 if age is less than 15),
//	B grade, if marks are between 61 and 70 (marks between 45 and 60 for age < 15) and
//	C grade, if marks are less than 61 (marks less than 45 for age < 15) 
//	Write a program to print the grade for given marks and age.
	
	int marks;
	int age;	
	String grade;
	
	//Method to calculate Grade based on Marks and Age
	void gradeCalculation(int marks, int age){
		this.marks = marks;
		this.age = age;
		if (age >= 15){
			if (marks >= 70){
				grade = "A";
			}if (marks >=61 && marks <70){
				 grade = "B";
			}if (marks < 61){
				 grade = "c";
			}
			
		} else if (age <15){
			if (marks >= 60)
				grade = "A";
			if (marks >= 45 && marks < 60)
				grade = "B";
			if (marks < 45)
				grade = "C";
		
		}
		System.out.println("Based on Marks:"+ marks +"and age:"+age+" the grade assigned is :: "+grade);
		
			
			
		
	}
	
	public static void main(String[] args) {
		System.out.println("********** Question 1******************");
		sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		if (num == 0){
			System.out.println("You Have Entered Zero");
		}else if (num < 0){
			System.out.println("You Have Entered Negative Value");
		}else if (num > 0){
			System.out.println("You Have Entered Positive Value");
		}
		System.out.println("***************************************");
		
		System.out.println("********** Question 2******************");
		System.out.println("Enter the Age");
		int age_entered = sc.nextInt();
		System.out.println("Enter the Marks");
		int marks_entered = sc.nextInt();
		S2A4 obj = new S2A4();
		obj.gradeCalculation(marks_entered,age_entered);
					
		}


}
