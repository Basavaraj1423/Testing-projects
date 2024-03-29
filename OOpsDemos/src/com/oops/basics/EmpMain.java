package com.oops.basics;

public class EmpMain {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.employeeName = "Basavaraj";
		employee.employeeId = 302888;
		employee.salary = 20000;
		System.out.println("Employee Name :" + employee.employeeName);
		System.out.println("Employee Id :" + employee.employeeId);
		System.out.println("Employee Salary :" + employee.salary);

		System.out.println("************************");

		Employee employee1 = new Employee();
		employee1.employeeName = "Bhoomika";
		employee1.employeeId = 302887;
		employee1.salary = 20000;
		System.out.println("Employee Name :" + employee1.employeeName);
		System.out.println("Employee Id :" + employee1.employeeId);
		System.out.println("Employee Salary :" + employee1.salary);

	}
}
