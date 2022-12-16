package org.hitech.service;
import org.hitech.dao.*;
import org.hitech.model.*;
import java.util.*;

public class Student_Course_Service {
Student_Course_DAO dao =new Student_Course_DAO();
public void addStudentCourseDetails(Student s,Course c) {
	dao.addStudentCourseDetails(s, c);
}
public HashMap<Student, Course> getStudentCourseDetails()
{
	HashMap<Student, Course> hs = dao.getStudentCourseDetails();
	return hs;
}


public void deleteStudentCourseDetails(Student s) {
	dao.deleteStudentCourseDetails(s);
}
}
