package com.somniuss.classinclass.task3;

public class Main03 {

	public static void main(String[] args) {

		University.Student student = new University.Student();

		student.setId(1);
		student.setName("Наливайко Петр Антонович");

		System.out.println("Student: " + student.getName() + "\nId: " + student.getId());

	}

}
