package pack_main;

import java.util.Scanner;

import pack_employee.Salary;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Firstname");
		String a=sc.next();
		System.out.println("Enter Lastname");
		String b= sc.next();
		System.out.println("Enter Basic Pay");
		int c =sc.nextInt();
		System.out.println("Enter HRA");
		int d=sc.nextInt();
		System.out.println("Enter Travelling Allowance");
		float e=sc.nextFloat();
		System.out.println("Enter Concent for NPS");
		boolean f=sc.nextBoolean();
		Salary emp = new Salary (a, b, c, d, e, f);
		emp.UpdateEmployeeDetails();

	}

}
