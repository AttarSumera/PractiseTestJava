package org.hitech.dao;
import org.hitech.model.*;
import java.util.*;

public class Student_Course_DAO {
	public static HashMap<Student,Course> map=new HashMap<Student,Course>();
	public void addStudentCourseDetails(Student s,Course c) {
		map.put(s,c);
	}
	public HashMap<Student, Course>getStudentCourseDetails(){
		return map;
	}
	public void deleteStudentCourseDetails(Student s) {
		map.remove(s);
	}
	 
}
