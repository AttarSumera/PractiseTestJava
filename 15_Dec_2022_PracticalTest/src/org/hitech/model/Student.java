package org.hitech.model;

import java.util.Objects;

public class Student {
public int studentID;
public String studentName;
public String Qualification;
public Student() {
	
}
public Student(int sid,String sname,String squa) {
	this.studentID=sid;
	this.studentName=sname;
	this.Qualification=squa;
	
}
public int getStudentID() {
	return studentID;
}
public void setStudentID(int studentID) {
	this.studentID = studentID;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getQualification() {
	return Qualification;
}
public void setQualification(String qualification) {
	Qualification = qualification;
}
@Override
public String toString() {
	return "Student [studentID=" + studentID + ", studentName=" + studentName + ", Qualification=" + Qualification
			+ "]";
}
@Override
public int hashCode() {
	return Objects.hash(Qualification, studentID, studentName);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	return Objects.equals(Qualification, other.Qualification) && studentID == other.studentID
			&& Objects.equals(studentName, other.studentName);
}


}

 