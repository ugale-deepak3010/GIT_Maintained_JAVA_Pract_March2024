package Hcom.AdvanceJava._InputOutput;

import java.util.Scanner;

public class H2_ConsoleInputWithScanner {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter your name:");
		String nameString= scanner.next();
		
		System.out.print("Enter your age:");
		int age= scanner.nextInt();
		
		System.out.print("Enter your Phone:");
		long phone= scanner.nextLong();
		
		PersonDetails p1=new PersonDetails(nameString, age, phone);
		
		
	}

}

class PersonDetails{
	String nameString;
	int age;
	long phone;
	public PersonDetails(String nameString, int age, long phone) {
		
		this.nameString = nameString;
		this.age = age;
		this.phone = phone;
		System.out.println("Person is created: name = " +nameString +" , Age = "+age+", Phone = "+phone);
	}
	
}