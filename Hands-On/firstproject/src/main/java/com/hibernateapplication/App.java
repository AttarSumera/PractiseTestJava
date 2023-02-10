package com.hibernateapplication;



import com.hibernateapplication.dao.EmployeeDao;
import com.hibernateapplication.model.Employee;

public class App
{
    public static void main( String[] args )
    {
    	EmployeeDao employeeDao = new EmployeeDao();

        // insert values
        Employee employee = new Employee("mansi", "chavan", "mansichavan2010@gmail.com", 80000.5);
        Employee employee1 = new Employee("sumera", "attar", "sumeraattar2001@gmail.com",90000.5);
        Employee employee2 = new Employee("shraddha", "bangar", "shraddhabangar2017@gmail.com",50000.57);

        //save values
        employeeDao.saveEmployee(employee);
        employeeDao.saveEmployee(employee1);
        employeeDao.saveEmployee(employee2);


        employeeDao.getEmployee(1);
        employeeDao.loadEmployee(2);
        employeeDao.getEmployeeById(3);
    }
 }