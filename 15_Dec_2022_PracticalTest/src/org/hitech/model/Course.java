package org.hitech.model;

import java.util.Objects;

public class Course {
public int courseID;
public String courseNmae;
public double price;
public Course() {
	
}
public Course(int cid,String cname,double cp) {
	this.courseID=cid;
	this.courseNmae=cname;
	this.price=cp;
	
}

public int getCourseID() {
	return courseID;
}
public void setCourseID(int courseID) {
	this.courseID = courseID;
}
public String getCourseNmae() {
	return courseNmae;
}
public void setCourseNmae(String courseNmae) {
	this.courseNmae = courseNmae;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Course [courseID=" + courseID + ", courseNmae=" + courseNmae + ", price=" + price + "]";
}
@Override
public int hashCode() {
	return Objects.hash(courseID, courseNmae, price);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Course other = (Course) obj;
	return courseID == other.courseID && Objects.equals(courseNmae, other.courseNmae)
			&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
}

}
