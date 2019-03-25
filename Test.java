package com;

public class Test {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEmpNumber(123);
		emp.setName("Sarfaraz");
		emp.setSalary(1000);
		String jsonResult=JsonUtil.convertJava2Json(emp);
		System.out.println(jsonResult);
		
		Employee empjava=JsonUtil.convertJson2Java(jsonResult, Employee.class);
		System.out.println(empjava);
	}

}
