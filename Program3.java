package MyPackage;

import java.util.*;
public class Program3 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.print("Enter Name: ");
		String name;
		name = sr.nextLine();
		System.out.print("Enter Course: ");
		String course;
		course = sr.nextLine();
		System.out.print("Enter University roll number: ");
		String roll;
		roll = sr.nextLine();
		System.out.print("Enter Sem: ");
		int sem;
		sem = sr.nextInt();
		
		System.out.println("Name: "+name);
		System.out.println("University Roll no. : "+roll);
		System.out.println("Course: "+course);
		System.out.println("Semester: "+sem);
		sr.close();

	}

}
