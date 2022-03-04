package com.cg.oopsinjava;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class EmployeeDetails {
	int emp_Id;
	float empsalary;
	String empname,empaddress,empemail;
	Date empDob,empDoj;
	Scanner sc = new Scanner(System.in);
	@SuppressWarnings("unused")
	void readEmployeeDetails() throws ParseException {
		System.out.println("Enter the Employee data");
		System.out.println("Enter the Employee id");
		emp_Id=sc.nextInt();
		System.out.println("Enter the Employee salary");
		empsalary=sc.nextFloat();
		 System.out.println("Enter the Employee name,Employee address,Employee email");
		sc.nextLine();
        empname=sc.nextLine();
        empaddress=sc.nextLine();
        empemail=sc.nextLine();
		System.out.println("Enter the Employee dob 'dd/mm/yyyy");
		String dob = sc.nextLine();
		System.out.println("Enter the Employee doj 'dd/mm/yyyy");
		String doj = sc.nextLine();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		empDob = sdf.parse(dob);
		empDoj = sdf.parse(doj);
	}
	@SuppressWarnings("deprecation")
	void displayEmployeeDetails() {
		System.out.println("Entered the Employee data......");
		System.out.println("Employee salary = " + empsalary);
		System.out.println("Employee id = " + emp_Id);
		System.out.println("Employee name = " + empname );
		System.out.println("Employee address = " + empaddress);
		System.out.println("Employee email = " + empemail);
		System.out.println("Employee dob = " + empDob.getDate()+"/"+empDob.getMonth()+"/"+empDob.getYear());
		System.out.println("Employee doj = " + empDoj.getDate()+"/"+empDoj.getMonth()+"/"+empDoj.getYear());
	}
}
