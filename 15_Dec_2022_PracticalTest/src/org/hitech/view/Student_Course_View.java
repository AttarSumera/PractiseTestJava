package org.hitech.view;
import org.hitech.dao.*;
import org.hitech.model.*;
import org.hitech.service.*;
import java.util.*;

public class Student_Course_View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_Course_Service scs=new Student_Course_Service();
		Scanner sc=new Scanner(System.in);
int choice;
do {
	System.out.println("1:Add value");
	System.out.println("2:View value");
	System.out.println("3:Delete value");
	System.out.println("4:Exit");
	System.out.println("Enter your choice");
	System.out.println("Enter the Student ID :");
	int ID = sc.nextInt();
	
	System.out.println("Enter the Student Name :");
	String Name = sc.next();
	
	System.out.println("Enter the Student Qualification :");
	String Qualification = sc.next();
	
	System.out.println("Enter the Course ID :");
	int cid = sc.nextInt();
	
	System.out.println("Enter the Course Name :");
	String cname = sc.next();
	
	System.out.println("Enter the Course Price :");
	double cp = sc.nextDouble();
		
Student s = new Student(ID,Name,Qualification);
Course c=new Course(cid,cname,cp);
System.out.println("Enter Your Choice");
choice = sc.nextInt();

}
}
}