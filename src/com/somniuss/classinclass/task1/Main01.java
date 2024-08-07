package com.somniuss.classinclass.task1;

public class Main01 {

	public static void main(String[] args) {

		Book b = new Book();

		Book.Author a = b.new Author();

		b.setTitle("The Hobbit");

		a.setName("J. R. R. Tolkien");
		a.setAge("81");
		a.printInfo();

	}

}
